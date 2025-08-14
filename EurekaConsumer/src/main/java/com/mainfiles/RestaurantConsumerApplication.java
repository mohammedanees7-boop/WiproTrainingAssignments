package com.mainfiles;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.mainfiles", "com.pojos", "com.example.client", "com.controllerfiles"})
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.example.client"})
public class RestaurantConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestaurantConsumerApplication.class, args);
    }
}
//http://localhost:8761/->registering servers
// http://localhost:8082/consumer/restaurants
//[{"id":1,"name":"Spicy Villa","location":"New York"},
//{"id":2,"name":"Pasta Paradise","location":"Chicago"},
//{"id":3,"name":"Curry Corner","location":"San Francisco"}]