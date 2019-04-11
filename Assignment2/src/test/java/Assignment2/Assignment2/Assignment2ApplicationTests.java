package Assignment2.Assignment2;

import C.CourseController;
import C.TeacherController;
import M.Entities.Course;
import M.Entities.Student;
import M.Entities.Teacher;
import M.Repository.TeacherRepository;
import M.Services.TeacherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Assignment2ApplicationTests {
	@Inject
	TeacherService ll;

	@Test
	public void contextLoads() {


	}
	@Test
public void tet()
{

	Teacher th= new Teacher(1,"nUME","parola","ADRESA","EMAIL",33);
	//System.out.println(th);
	// new TeacherController().createTeacher(
	ll.create(th);
	//Teacher thhh= new TeacherRepository().save(th);
	//System.out.println(tct);
			/*Student st= new Student("parola","numeS","ädresa","email",22);
			Course cst= new Course(1,"nume",th);
			System.out.println(cst);
			ModelAndView ss= new CourseController().postCourses(cst);
			ModelAndView set= new CourseController().deleteCourse(cst);
*/

}
}
