package project.C;

import project.M.Entities.Teacher;
import project.M.Services.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import java.util.List;

@Controller
public class TeacherController {

    @Inject
    TeacherService teacherService;

    @RequestMapping(value ="" ,method = RequestMethod.GET)
    public ModelAndView getTeachers()
    {
        List<Teacher> teacherList = teacherService.getAllTeachersWithCourses();


        ModelAndView mav = new ModelAndView("TeacherView");
        mav.addObject("teachersWithCoursesListId", teacherList);

        return mav;

    }
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ModelAndView postTeacher(@ModelAttribute(value = "newTeacher") Teacher newTeacher)
    {
        teacherService.create(newTeacher);
        return new ModelAndView("redirect:teachers");

    }
    @RequestMapping(value ="", method = RequestMethod.DELETE)
    public ModelAndView deleteTeacher(@ModelAttribute(value = "newTeacher") Teacher newTeacher)
    {
        teacherService.delete(newTeacher);

        return new ModelAndView("redirect:teachers");

    }
/*
    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public void set(@RequestParam("idTeacher") Integer idTask, @RequestParam("name") String description, @RequestParam("password") String filepath, @RequestParam("address") String str, @RequestParam("email") String ema,@RequestParam("age")Integer it){

// assign parameters to taskDocumentEntity by constructor args or setters
        Teacher document = new Teacher(idTask,description,filepath,str,ema,it);
        teacherService.create(document);
    }
    */


}
