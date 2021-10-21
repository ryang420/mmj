package com.epam.mmj.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sourabh Sharma
 */
@SpringBootApplication
@EnableEurekaClient
@RefreshScope
@RestController
public class UsersApp {
    @Value("${app.greet.msg}")
    String msg;

    @RequestMapping("/")
    public String greet() {
        return msg;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(UsersApp.class, args);
    }

}