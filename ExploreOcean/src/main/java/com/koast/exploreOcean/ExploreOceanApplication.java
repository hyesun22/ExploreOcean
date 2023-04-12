package com.koast.exploreOcean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.koast.exploreOcean"})
public class ExploreOceanApplication {
	public static void main(String[] args) {
		SpringApplication.run(ExploreOceanApplication.class, args);
				
	}
}
