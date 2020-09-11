package com.rcp.restful_client.config;

import com.rcp.restful_client.pojo.Greeting;
import com.rcp.restful_client.pojo.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @auther Stiles-JKY
 * @date 2020/9/10-22:06
 */
@Configuration
public class RestTemplateConfig {

    private static final Logger log = LoggerFactory.getLogger(RestTemplateConfig.class);

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public ApplicationRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Greeting greeting = restTemplate.getForObject(
                    "http://localhost:8080/greeting", Greeting.class);
            log.info(greeting.toString());
        };
    }

}
