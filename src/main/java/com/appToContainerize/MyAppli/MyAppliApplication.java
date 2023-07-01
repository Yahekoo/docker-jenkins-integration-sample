package com.appToContainerize.MyAppli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyAppliApplication {
	
	@GetMapping("/index.php")
	public String sayHello() {
		return "<b>Hello This a nminimal Spring boot app</b>" ; 
	}

	public static void main(String[] args) {
		SpringApplication.run(MyAppliApplication.class, args);
	}

}
