package com.project.basics.db.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.basics.db.demo.entity.Person;

@Repository 
public class PersonJdbcDAO {
		@Autowired
		JdbcTemplate JdbcTemplate;
		
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Person> findAll() {
	 return	JdbcTemplate.query("select * from person",
				new BeanPropertyRowMapper(Person.class));
		
	}
	
}
