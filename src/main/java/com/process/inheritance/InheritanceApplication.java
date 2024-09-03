package com.process.inheritance;

import com.process.inheritance.entity.tableperclass.Student;
import com.process.inheritance.entity.tableperclass.Teacher;
import com.process.inheritance.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class InheritanceApplication implements CommandLineRunner {

	private final PersonRepository personRepository;

    public InheritanceApplication(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public static void main(String[] args) {
		SpringApplication.run(InheritanceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//*************** table perclass implementation *************
		Student student = new Student();
		student.setName("Boris");
		student.setBirthDate(new Date());
		student.setScore(15.5);
		personRepository.save(student);

		Teacher teacher = new Teacher();
		teacher.setName("Mohamed");
		teacher.setBirthDate(new Date());
		teacher.setCourse("JEE");
		personRepository.save(teacher);

		//*************
	}
}
