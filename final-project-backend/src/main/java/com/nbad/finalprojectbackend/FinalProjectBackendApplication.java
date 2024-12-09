package com.nbad.finalprojectbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.nbad.finalprojectbackend.model")
@EnableJpaRepositories(basePackages = "com.nbad.finalprojectbackend.repositories")
public class FinalProjectBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinalProjectBackendApplication.class, args);
    }

}
