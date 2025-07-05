package com.example.servicediscoveryapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryApplication {
      /*Spring Cloud helps more here like send the request in balanced way see, here we can use eureka server and use @loadbalanced
      we can do the api gateway (hitting the request from client), calling from one microservice to another microservice easier
      by enabling eureka server in pom.xml and added dependency for eureka server, load balanced, api gateway dependency*/
    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryApplication.class, args);
    }

}
