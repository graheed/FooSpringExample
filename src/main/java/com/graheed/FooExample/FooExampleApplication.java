package com.graheed.FooExample;

import com.graheed.FooExample.controllers.FooController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FooExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(FooExampleApplication.class, args);

		FooController fooController = (FooController) ctx.getBean("fooController");

		System.out.println(fooController.getFooValue());
	}

}
