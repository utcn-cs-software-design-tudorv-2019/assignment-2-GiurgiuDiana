package project.C;

import project.M.Entities.Student;
import project.M.Services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import java.util.List;

@Controller
public class StudentController {

    @Inject
    StudentService studentService;


    @RequestMapping(value = "/Student", method = RequestMethod.GET)
    public ModelAndView getStudents()
    {
        List<Student> studentList = studentService.getAllStudents();

        ModelAndView mav = new ModelAndView("student_view");
        mav.addObject("all students", studentList);

        return mav;

    }
    @RequestMapping(value = "/Student", method = RequestMethod.POST)
    public ModelAndView postStudent(@ModelAttribute(value = "newStudent") Student newStudent)
    {
        studentService.create(newStudent);

        return new ModelAndView("redirect:student");

    }

    @RequestMapping(value = "/Student", method = RequestMethod.DELETE)
    public ModelAndView deleteStudent(@ModelAttribute(value = "newStudent") Student newStudent)
    {

        studentService.delete(newStudent);

        return new ModelAndView("redirect:student");

    }

}
