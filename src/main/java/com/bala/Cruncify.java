package com.bala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Cruncify {


	 
	    @RequestMapping("/")
	    String home() {
	        return "Hello World Spring Boot!";
	    }
	    
	    @RequestMapping("/welcome/{name}")
	    String home(@PathVariable("name") String name) { 
	    	
	        return "Welcome to Hello World Spring Boot by "+StringUtils.capitalize(name)+"!";
	    }
	 
	    public static void main(String[] args) throws Exception {
	        SpringApplication.run(Cruncify.class, args);
	    }
	 
	
}
