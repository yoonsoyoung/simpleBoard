package com.yoon.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BoardApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(BoardApplication.class);
		app.addListeners(new ApplicationPidFileWriter());
		app.run(args);
	}

}
