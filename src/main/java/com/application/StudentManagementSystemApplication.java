package com.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.entity.Student;
import com.repository.StudentRepository;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableAutoConfiguration
@EntityScan("com.entity")
@EnableJpaRepositories(basePackages = "com.repository")
@ComponentScan({ "com.service.impl", "com.service", "com.controller" })
public class StudentManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

//	@Autowired
//	private StudentRepository studentRepository;
//	
//	@Override
//	public void run(String... args) throws Exception {
		
//		 Student student1 = new Student("Ramesh", "Fadatare", "ramesh@gmail.com");
//		 studentRepository.save(student1);
//		  
//		  Student student2 = new Student("Sanjay", "Jadhav", "sanjay@gmail.com");
//		  studentRepository.save(student2);
//		  
//		  Student student3 = new Student("tony", "stark", "tony@gmail.com");
//		  studentRepository.save(student3);
//		 
//		
	}

