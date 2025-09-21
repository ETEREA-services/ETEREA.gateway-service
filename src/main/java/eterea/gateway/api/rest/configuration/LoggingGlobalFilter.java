package eterea.gateway.api.rest.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.route.Route;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class LoggingGlobalFilter implements GlobalFilter, Ordered {

    private static final Logger logger = LoggerFactory.getLogger(LoggingGlobalFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        long startTime = System.currentTimeMillis();

        // Log incoming request
        logger.info("Incoming request: {} {} from {}",
            request.getMethod(),
            request.getURI(),
            request.getRemoteAddress() != null ? request.getRemoteAddress().getAddress().getHostAddress() : "unknown");

        // Log request headers
        request.getHeaders().forEach((key, values) -> {
            logger.debug("Request header: {} = {}", key, values);
        });

        // Log the route if available
        Object routeObj = exchange.getAttribute("org.springframework.cloud.gateway.support.ServerWebExchangeUtils.gatewayRoute");
        if (routeObj instanceof Route) {
            Route route = (Route) routeObj;
            logger.info("Routing to: {} -> {}", request.getURI(), route.getUri());
        }

        return chain.filter(exchange)
            .doOnSuccess(aVoid -> {
                ServerHttpResponse response = exchange.getResponse();
                long duration = System.currentTimeMillis() - startTime;

                // Log response
                logger.info("Response: {} {} in {}ms",
                    response.getStatusCode(),
                    exchange.getRequest().getURI(),
                    duration);

                // Log response headers
                response.getHeaders().forEach((key, values) -> {
                    logger.debug("Response header: {} = {}", key, values);
                });
            })
            .doOnError(throwable -> {
                long duration = System.currentTimeMillis() - startTime;
                logger.error("Error processing request: {} {} in {}ms - Error: {}",
                    request.getMethod(),
                    request.getURI(),
                    duration,
                    throwable.getMessage(),
                    throwable);
            });
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE; // Execute after other filters
    }
}