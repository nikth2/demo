package com.example.demo;


import javax.inject.Inject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.DataRepository;

@RestController
public class HelloRest 
{
	@Inject DataRepository dr;
	
	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
	
	@RequestMapping("/user/{id}")
    public String getUserById(@PathVariable("id")int id) 
	{
        return "userId:"+id +" name:"+dr.getUserById(id).getName();
    }
}
