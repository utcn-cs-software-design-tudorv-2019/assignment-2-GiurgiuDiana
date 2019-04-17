package project.M.Services;

import project.M.Entities.Course;
import project.M.Entities.Student;
import project.M.Repository.CourseRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
@Service
public class CourseService {

    @Inject
    CourseRepository courseRepository;
    public List<Course> getAllCourses()
    {
        return courseRepository.findAll();
    }
    public Course create(Course cr)
    {
        return courseRepository.save(cr);
    }
    public void delete(Course cr)
    {
        courseRepository.delete(cr);
    }
   /* public List<Course> getAllCoursesByTeacherId(Integer id)
    {
        List<Course> coursesFilteredList = null;

        if (id==0)
        {
            coursesFilteredList = courseRepository.findAll();
        }
        else
        {
           // coursesFilteredList = courseRepository.findAllById(Collections.singleton(id));
            coursesFilteredList=courseRepository.findAllByTeacher(id);
        }

        return coursesFilteredList;
    }

    */
 public void update(Course old, Course st)
 {
     if(old==null)
     {
         System.out.println("eror at update");
     }
     else
     {
         courseRepository.delete(old);
         courseRepository.save(st);
     }
 }

}
