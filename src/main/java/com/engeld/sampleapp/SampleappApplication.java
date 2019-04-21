package com.engeld.sampleapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleappApplication {

	@Value("${hello.message}")
	private String helloMessage;

	public static void main(String[] args) {
		SpringApplication.run(SampleappApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return helloMessage;
	}
}
