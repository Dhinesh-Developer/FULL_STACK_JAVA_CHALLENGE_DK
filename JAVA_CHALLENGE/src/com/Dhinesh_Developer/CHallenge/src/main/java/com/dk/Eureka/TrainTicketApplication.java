package com.dk.Eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TrainTicketApplication {
    public static void main(String[] args){
        SpringApplication.run(TrainTicketApplication.class,args);
    }

}
