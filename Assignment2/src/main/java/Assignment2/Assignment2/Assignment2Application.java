package Assignment2.Assignment2;

import M.Entities.Teacher;
import M.Services.TeacherService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment2Application {

	public static void main(String[] args) {
		SpringApplication.run(Assignment2Application.class, args);
		//new TeacherService().create(Teacher);
	}

}
