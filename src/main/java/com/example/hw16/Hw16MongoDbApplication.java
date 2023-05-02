package com.example.hw16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Hw16MongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(Hw16MongoDbApplication.class, args);
	}

}
