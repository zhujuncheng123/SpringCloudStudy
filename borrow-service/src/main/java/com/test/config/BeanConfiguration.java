package com.test.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: zhujc
 * @Title: BeanConfiguration
 * @ProjectName: SpringCloudStudy
 * @Description:
 * @date: 2022/10/11 11:05
 */
@Configuration
public class BeanConfiguration {
    @Bean
    @LoadBalanced // 负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
