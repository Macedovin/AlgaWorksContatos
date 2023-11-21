package com.macedovingithub;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ContatosControle {
	
	@GetMapping
	public String index() {
		return "index";
	}

}
