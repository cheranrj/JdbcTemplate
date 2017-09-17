package com.cheran.DAO;

import com.cheran.model.Student;

public class TestStudentDAO {

	public static void main(String[] args) {
		Student student=new Student();
		student.setName("cheran");
		student.setEmail("cheranrj@gmail.com");
		student.setPassword("chr123");
		StudentDAO dao = new StudentDAO();
		dao.save(student);

	}

}

