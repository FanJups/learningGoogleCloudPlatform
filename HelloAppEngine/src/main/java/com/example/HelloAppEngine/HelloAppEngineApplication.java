package com.example.HelloAppEngine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
@RestController
public class HelloAppEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloAppEngineApplication.class, args);
	}
	@RequestMapping(value = "/")
   public String hello() {
      return "Hello welcome on this Spring Boot app ! Date & time : "+Calendar.getInstance().getTime().toString();
   }
   

}
