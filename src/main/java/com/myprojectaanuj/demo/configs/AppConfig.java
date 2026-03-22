package com.myprojectaanuj.demo.configs;

import com.myprojectaanuj.demo.services.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    PaymentService paymentService(){
        return new PaymentService();
    }
}
