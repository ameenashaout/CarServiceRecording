package com.CarServiceRecording;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@OpenAPIDefinition
public class CarServiceRecordingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarServiceRecordingApplication.class, args);
	}

}
