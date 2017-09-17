package com.cheran.DAO;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cheran.model.Student;
import com.cheran.util.ConnectionUtil;


	public class StudentDAO {
		public void save(Student student)
		{
			JdbcTemplate jdbcTemplate=ConnectionUtil.getJdbcTemplate();
			String sql="insert into student(name,email,password)values(?,?,?)";
			Object[] obj={student.getName(),student.getEmail(),student.getPassword()};
			int row=jdbcTemplate.update(sql,obj);
			System.out.println(row+" "+"Student Added");
			
		}
	}


