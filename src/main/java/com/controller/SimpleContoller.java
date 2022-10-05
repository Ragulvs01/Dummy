package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleContoller {
    @GetMapping(value="/")
	public String sayHello() {
		return"Welcome to Amazon Web Service";
	}
}
