package com.gglee.sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class SampleConfig {

    @Bean
    public Map<String, String> testBean() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "test");

        return map;
    }

}
