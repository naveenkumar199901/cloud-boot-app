package com.dataservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/* Spring Auto Boot Class */
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.dataservice")
public class DataServiceSpringController extends SpringBootServletInitializer {

    private static final Logger logger = LoggerFactory.getLogger(DataServiceSpringController.class);

	public static void main(String[] args) {
        SpringApplication.run(DataServiceSpringController.class, args);
	}

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        logger.info("Configuring application with Spring Boot");
        return application.sources(DataServiceSpringController.class);
    }
}
