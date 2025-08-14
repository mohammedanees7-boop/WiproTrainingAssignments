package com.controllerfiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	@Autowired
	private BookRestConsumer consumer;//AUTOWIRED THE INTERFACE

	@GetMapping("/data")
	public String getStudentInfo() {
	 System.out.println(consumer.getClass().getName()); //prints as a proxy 	class
	return "Accessing from MicroservicesProducer ==> "+consumer.getBookData();// # 1 INTERFACE METHOD
	 }
	
	@GetMapping("/allBooks")
	public String getBooksInfo() {
	return "Accessing from MicroservicesProducer ==> " + 	consumer.getAllBooks();// # 2 INTERFACE METHOD
	 }
	@GetMapping("/getOneBook/{id}")
	public String getOneBookForStd(@PathVariable(value="id") Integer id) {
	return "Accessing from MicroservicesProducer ==> " + 	consumer.getBookById(id); // # 3 INTERFACE METHOD
	 }
	@GetMapping("/entityData")
	public String printEntityData() {
	 ResponseEntity<String> resp = consumer.getEntityData();// # 4 INTERFACE 	METHOD
	return "Accessing from MicroservicesProducer ==> " + resp.getBody() +" ,	status is:" +	resp.getStatusCode();
	 }


	
}
