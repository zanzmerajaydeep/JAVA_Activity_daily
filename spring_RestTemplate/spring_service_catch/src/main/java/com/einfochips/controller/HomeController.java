package com.einfochips.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
	
	@RequestMapping("getCon")
	@ResponseBody
	public ResponseEntity<String> getService()
	{
		
		RestTemplate rt = new RestTemplate();
		
		return rt.getForEntity("http://localhost:8080/fetch",String.class);
	}

}
