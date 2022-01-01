package com.project.basics;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.basics.db.demo.PersonJdbcDAO;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringBootBasicsApplication implements CommandLineRunner {
	private Logger Logger = LoggerFactory.getLogger(this.getClass());
		@Autowired
		PersonJdbcDAO dao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		 Logger.info("ALL users -> {}",dao.findAll());
	}
	

}
