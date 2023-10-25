package com.example.article;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ArticleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(ArticleApplication.class, args);
		//Object dataSource=context.getBean("dataSource");
		//System.out.println((dataSource));
	}


	@Bean
	ApplicationRunner init() {
		return (args) -> {
			System.out.println("Hello man");
		};
	}

}
