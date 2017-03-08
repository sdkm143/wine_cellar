package com.spring.boot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.service.BootService;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
 
public class Application {
	@Autowired
	BootService  service ;
	
	@RequestMapping("/")
    String home() {
		
        return "Hello World!" +service.addBoot("sdkm");
    }
	@RequestMapping("/hello")
    String home2() {
		
        return "Hello World!" +service.addBoot("sdkm");
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
