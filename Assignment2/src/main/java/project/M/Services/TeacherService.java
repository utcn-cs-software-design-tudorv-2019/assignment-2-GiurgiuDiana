package project.M.Services;

import project.M.Entities.Teacher;
import project.M.Repository.TeacherRepository;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    private int count;

    @Inject
    TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachersWithCourses()
    {
        return teacherRepository.findAll();
    }

    public void create(Teacher newTeacher)
    {
        System.out.println("aaaa"+newTeacher);
         teacherRepository.save(newTeacher);
    }
    public void delete(Teacher newTeacher)
    {
         teacherRepository.delete(newTeacher);
    }

   public void update(Teacher old,Teacher st)
   {
        if(old==null)
        {
            System.out.println("eror at update");
        }
        else
        {
            teacherRepository.delete(old);
            teacherRepository.save(st);
        }
   }

}
