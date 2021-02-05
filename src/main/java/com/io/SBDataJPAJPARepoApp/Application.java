package com.io.SBDataJPAJPARepoApp;

import com.io.SBDataJPAJPARepoApp.entity.Student;
import com.io.SBDataJPAJPARepoApp.repository.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		ConfigurableApplicationContext applicationContext =SpringApplication.run(Application.class, args);
		StudentRepo studentRepo =applicationContext.getBean(StudentRepo.class);  // calling repo
		/*
		Student s = new Student();
		s.setStudentId(100);
		s.setStudentName("Rudra1");
		s.setStudentEmail("rh100@gmail.com");
		s.setStudentAge(19);
		studentRepo.save(s);  */


	//	List<Student> studentAge = studentRepo.findAll(Sort.by("studentAge").descending());

		Student s = new Student();
		s.setStudentName("Rudra");
		Example<Student> example = Example.of(s);
		List<Student> studentAge = studentRepo.findAll(example,Sort.by("studentAge").descending());

		studentAge.forEach(i->{
			System.out.println(i);
		});



	}

}
