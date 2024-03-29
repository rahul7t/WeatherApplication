package com.example.weather;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherApplication {

	private static final Logger log = LoggerFactory.getLogger(WeatherApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WeatherApplication.class, args);
	}

}
