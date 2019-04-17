package project.C;

import project.M.Entities.Course;
import project.M.Services.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import java.util.List;

@Controller
public class CourseController {

    @Inject
    private CourseService courseService;

  /*  @RequestMapping(value =  "", method = RequestMethod.GET)
    public ModelAndView getCourses(@RequestParam(name="id", required = false) Integer firstName)
    {
        List<Course> courseList = courseService.getAllCoursesByTeacherId(firstName);

        ModelAndView mav = new ModelAndView("course_view");
        mav.addObject("courseWithTeachersListId", courseList);
        return mav;
    }

   */

    @RequestMapping(value = "/Courses", method = RequestMethod.POST)
    public ModelAndView postCourses(@ModelAttribute(value = "newCourse") Course newCourse)
    {
        courseService.create(newCourse);

        return new ModelAndView("redirect:Course");

    }

    @RequestMapping(value = "/Courses", method = RequestMethod.DELETE)
    public ModelAndView deleteCourse(@ModelAttribute(value = "newCourse") Course newCourse)
    {
        courseService.delete(newCourse);

        return new ModelAndView("redirect:course");


    }

    @RequestMapping(value = "/Courses", method = RequestMethod.GET)
    public ModelAndView getCourses()
    {
        List<Course> teacherList = courseService.getAllCourses();


        ModelAndView mav = new ModelAndView("Courses_view");
        mav.addObject("CoursesList", teacherList);

        return mav;

    }


}
