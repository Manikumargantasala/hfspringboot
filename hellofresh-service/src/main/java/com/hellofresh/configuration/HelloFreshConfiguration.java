package com.hellofresh.configuration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloFreshConfiguration {
    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS).addMixIn(Object.class, IgnoreHibernatePropertiesInJackson.class);
        return mapper;
    }

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private abstract class IgnoreHibernatePropertiesInJackson{ }
}
