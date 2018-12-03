package com.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author yunxiang.yang
 * @date 2018/12/01 19:02
 */

@Component
public class BaiduHealthConfig implements HealthIndicator {
    @Override
    public Health health() {
        try {
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.getForObject("http://www.baidu.com", String.class);
            return Health.up().build();
        } catch (Exception e) {
            return Health.down().withDetail("errorMessage", e.getMessage()).build();
        }
    }
}
