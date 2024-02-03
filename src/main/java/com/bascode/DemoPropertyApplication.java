package com.bascode;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoPropertyApplication {
	@GetMapping("/")
	public List<String> welcome(){
		return List.of("Welcome", "bascode-dev");
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoPropertyApplication.class, args);
	}

}
