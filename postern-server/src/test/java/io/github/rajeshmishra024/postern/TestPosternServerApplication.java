package io.github.rajeshmishra024.postern;

import org.springframework.boot.SpringApplication;

public class TestPosternServerApplication {

	public static void main(String[] args) {
		SpringApplication.from(PosternServerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
