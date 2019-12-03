package com.example.configserverclientdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConfigserverclientdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigserverclientdemoApplication.class, args);
	}

}

@RefreshScope
@RestController
class MessageController {

	@Value("${msg:Hello World - Config Server is not working...please check}")
	private String message;

	@RequestMapping("/message")
	String getMsg() {
		return this.message;
	}
}