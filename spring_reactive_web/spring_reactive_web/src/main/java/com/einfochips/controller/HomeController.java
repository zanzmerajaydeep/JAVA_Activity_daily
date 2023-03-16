package com.einfochips.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class HomeController {
	
     WebClient wc= WebClient.create();
	
	@RequestMapping("rect")
	public Flux<String> getreact()
	{
		return wc.get()
				.uri("http://localhost:8080/fetch").retrieve().bodyToFlux(String.class);
	}
	
	@RequestMapping("rect/{id}")
	public Mono<String> getreact(@PathVariable int id)
	{
		return wc.get()
				.uri("http://localhost:8080/fetchById/"+id).retrieve().bodyToMono(String.class);
	}
	
	
	

}
