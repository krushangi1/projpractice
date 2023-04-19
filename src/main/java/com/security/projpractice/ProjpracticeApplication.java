package com.security.projpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@EnableJpaRepositories(basePackages ={"com.security.projpractice"} )
public class ProjpracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjpracticeApplication.class, args);
	}

}
