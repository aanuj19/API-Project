package com.myprojectaanuj.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    PaymentService paymentService(){
        return new PaymentService();
    }
}
