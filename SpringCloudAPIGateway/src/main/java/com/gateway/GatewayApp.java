package com.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GatewayApp {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApp.class, args);
    }
}

/*
 first run dummy app and in postman 8081,  will get output
 now run 8080
http://localhost:8080/employee/status   GET

here we runing 8080 employe it goes to 8081 deliver server and produce result 
Delivery is on the way!
(calling 8081 by the 8080 server)

*/