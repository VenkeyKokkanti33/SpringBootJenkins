package com.boot.jenkins.app;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsApplication {
	
	public static Logger log = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);

	@PostConstruct
	public void init() {
		log.info("Spring with jenkins has been executed..");
	}
	
	public static void main(String[] args) {
		log.info("Spring with Jenkins Main() has been executed....");
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
	}

}
