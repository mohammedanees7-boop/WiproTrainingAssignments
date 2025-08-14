package com.mainfiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SpringBootEntry {
	  public static void main(String[] args) {
	        SpringApplication.run(SpringBootEntry.class, args);
	    }
}
//http://localhost:8067/send?message="Hello" GET

//Message sent to Kafka: "Hello"
//Received message: "Hello"
