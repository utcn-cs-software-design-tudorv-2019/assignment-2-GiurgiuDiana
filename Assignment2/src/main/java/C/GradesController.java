package C;

import M.Entities.Course;
import M.Entities.Grades;
import M.Services.CourseService;
import M.Services.GradesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import java.util.List;
@Controller
public class GradesController {
    @Inject
    private GradesService gradesService;

    @RequestMapping(value =  "/grades", method = RequestMethod.GET)
    public ModelAndView getGradesCourses(@RequestParam(name="IdCourse", required = false) Integer firstName)
    {
        List<Grades> courseList = gradesService.getAllGradesByCourseId(firstName);

        ModelAndView mav = new ModelAndView("grades_view");
        mav.addObject("listwithCoursesandGrades", courseList);
        return mav;
    }

    @RequestMapping(value =  "/grades", method = RequestMethod.GET)
    public ModelAndView getGradesStuents(@RequestParam(name="IdStudent", required = false) Integer firstName)
    {
        List<Grades> courseList = gradesService.getAllGradesByStudentId(firstName);

        ModelAndView mav = new ModelAndView("grades_view");
        mav.addObject("listwithStudentandGrades", courseList);
        return mav;
    }

    @RequestMapping(value = "/grades", method = RequestMethod.POST)
    public ModelAndView postGrades(@ModelAttribute(value = "newGrades") Grades newCourse)
    {
        gradesService.create(newCourse);

        return new ModelAndView("redirect:Grades");

    }

    @RequestMapping(value = "/grades", method = RequestMethod.DELETE)
    public ModelAndView deleteGrades(@ModelAttribute(value = "newGrades") Grades newCourse)
    {
        gradesService.delete(newCourse);

        return new ModelAndView("redirect:grades");


    }

    @RequestMapping(value = "/Grades", method = RequestMethod.GET)
    public ModelAndView getGrades()
    {
        List<Grades> teacherList = gradesService.getAllGrades();


        ModelAndView mav = new ModelAndView("grades_view");
        mav.addObject("GradesList", teacherList);

        return mav;

    }


}
