package com.raz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerApplication {

    @GetMapping("/greeting")
    public String greeting() {
        return "Welcome to Openshift . your app is running !!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringDockerApplication.class, args);
    }

}
