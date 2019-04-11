package M.Services;

import M.Entities.Course;
import M.Repository.CourseRepository;
import M.Repository.TeacherRepository;

import javax.inject.Inject;
import java.util.Collections;
import java.util.List;

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
    public List<Course> getAllCoursesByTeacherId(Integer id)
    {
        List<Course> coursesFilteredList = null;

        if (id==0)
        {
            coursesFilteredList = courseRepository.findAll();
        }
        else
        {
           // coursesFilteredList = courseRepository.findAllById(Collections.singleton(id));
            coursesFilteredList=courseRepository.findAllByTeacherid(id);
        }

        return coursesFilteredList;
    }
}
