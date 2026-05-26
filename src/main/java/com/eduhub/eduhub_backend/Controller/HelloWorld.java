package com.eduhub.eduhub_backend.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    private final Environment environment;

    @Value("${spring.application.name}")
    private String appName;

    //constructor Injection
    public HelloWorld(Environment environment){
        this.environment = environment;
    }

    @GetMapping("/hello-world")
    String sayhello(){
        return "Hello World!";
    }

    @GetMapping("/env")
    public String getEnvironmentVariable(){
        String port = environment.getProperty("server.port");
        return "App Name:" + appName + " | Port:" + port;
    }
}
