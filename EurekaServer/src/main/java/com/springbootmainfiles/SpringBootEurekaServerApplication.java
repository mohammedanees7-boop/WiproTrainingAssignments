package com.springbootmainfiles;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
 * In order to discover and communicate Microservices with each other, we need 
to create a Eureka
Server Service.
 * Creating a Eureka Server is itself similar to creating a Microservice. 
Moreover, 
 * it is just a Spring Boot Project that incorporates Spring Cloud’s Eureka
Server
 * dependency. 
 * In application.properties file 
 * we will have some specific properties that will indicate that
 * this application/microservice is a Eureka server. 
 */
@SpringBootApplication
/*
 * In order to make your application/microservice acts as Eureka server, 
 * you need to apply @EnableEurekaServer at the main class of your application.
 */
@EnableEurekaServer//Eureka dashboard will be displayed

//http://localhost:8761/

public class SpringBootEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaServerApplication.class, 	args);
		
	}

}
