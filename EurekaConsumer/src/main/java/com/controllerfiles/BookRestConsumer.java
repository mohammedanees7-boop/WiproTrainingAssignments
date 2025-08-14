package com.controllerfiles;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pojos.Books;




@FeignClient(name="MicroservicesProducer")

public interface BookRestConsumer
{
	@GetMapping("/book/data")//9011
public String getBookData();

@GetMapping("/book/{id}")
public Books getBookById(@PathVariable(value="id") Integer id);

@GetMapping("/book/all")
public List<Books> getAllBooks();

@GetMapping("/book/entity")
public ResponseEntity<String> getEntityData();


}
