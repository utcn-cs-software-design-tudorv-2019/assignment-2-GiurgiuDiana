package M.Services;

import M.Entities.Teacher;
import M.Repository.TeacherRepository;
import java.util.List;

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
/*
   public Teacher update(Integer ID)
   {
       Teacher th= teacherRepository.findById(ID);
       if()
       {

       }
   }
}
*/}