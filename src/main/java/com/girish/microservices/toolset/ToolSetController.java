package com.girish.microservices.toolset;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToolSetController {

	@GetMapping("/")
	public String sayHello() {
		
		return "Welcome to the world of Tools!";
	}
	
	@GetMapping("/tools")
	public List<String> getTools() {
		
		//Java 9 or above only
		List<String> tools = List.of("Calc", "Temp Conv");
		return tools;
	}
}
