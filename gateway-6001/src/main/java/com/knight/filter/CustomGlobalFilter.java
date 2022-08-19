package com.knight.filter;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Description: 自定义过滤器
 * @Author: knight
 * @Date: 2022/8/8 11:48
 */
@Component
@Slf4j
public class CustomGlobalFilter implements GlobalFilter, Ordered {

    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        if(exchange.getRequest().getQueryParams().getFirst("token") == null){
            ServerHttpResponse response = exchange.getResponse();
            JSONObject res = new JSONObject();
            res.put("status","-1");
            res.put("msg","need login");
            byte[] datas = JSONObject.toJSONBytes(res);
            DataBuffer buffer = response.bufferFactory().wrap(datas);
            response.setStatusCode(HttpStatus.UNAUTHORIZED);
            response.getHeaders().add("Content-Type", "application/json;charset=UTF-8");
            log.warn("无效访问");
            return response.writeWith(Mono.just(buffer));
        }
        return chain.filter(exchange);
    }

    public int getOrder() {
        return 0;
    }
}
