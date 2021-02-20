package com.gbq.my_autoconfig.config;


import com.gbq.my_autoconfig.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloPorperties.class)
public class helloconfig {

    @Autowired
    HelloPorperties helloPorperties;

    @Bean
    public HelloService helloService() {
        HelloService helloService = new HelloService();
        helloService.setHelloPorperties(helloPorperties);
        return helloService;
    }
}
