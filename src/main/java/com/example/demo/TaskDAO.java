package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TaskDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@SuppressWarnings("deprecation")
	public String getTaskById(String taskId) {
		return jdbcTemplate.queryForObject("SELECT name FROM person where id=?",
				new Object[] {taskId},String.class);
	}
}
