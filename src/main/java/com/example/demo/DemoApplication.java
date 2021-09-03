package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    @ConfigurationProperties("myprop")
    public MyProp myProp() {
        return new MyProp();
    }

    @Bean
    public String myBean(MyProp myProp) {
        System.out.println(myProp.getArray().get(0));
        return myProp.getArray().get(0);
    }
}
