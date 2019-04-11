package M.Services;

import M.Entities.Student;
import M.Entities.Teacher;
import M.Repository.StudentRepository;
import M.Repository.TeacherRepository;

import javax.inject.Inject;
import java.util.List;

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
}
