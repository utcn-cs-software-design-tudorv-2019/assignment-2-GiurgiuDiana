package project.M.Services;

import project.M.Entities.Student;
import project.M.Entities.Teacher;
import project.M.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
@Service
public class StudentService {
    @Inject
    StudentRepository studentRepository;
    public Student create(Student newStudent)
        {return studentRepository.save(newStudent);}
    public List<Student> getAllStudents()
    {
        return studentRepository.findAll();
    }
    public void delete(Student st)
    {
        studentRepository.delete(st);
    }
    public void update(Student old, Student st)
    {
        if(old==null)
        {
            System.out.println("eror at update");
        }
        else
        {
            studentRepository.delete(old);
            studentRepository.save(st);
        }
    }


}
