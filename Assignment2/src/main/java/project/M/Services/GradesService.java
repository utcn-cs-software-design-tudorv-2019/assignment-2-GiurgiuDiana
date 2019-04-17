package project.M.Services;

import project.M.Entities.Grades;
import project.M.Entities.Student;
import project.M.Repository.GradesRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
@Service
public class GradesService {
    @Inject
    GradesRepository gradesRepository;
    public List<Grades> getAllGrades()
    {
        return gradesRepository.findAll();
    }
    public Grades create(Grades grd)
    {
        return gradesRepository.save(grd);
    }
    public void delete(Grades grd)
    {
        gradesRepository.delete(grd);
    }
/*
    public List<Grades> getAllGradesByCourseId(Integer id)
    {
        List<Grades> coursesFilteredList = null;

        if (id==0)
        {
            coursesFilteredList = gradesRepository.findAll();
        }
        else
        {
            coursesFilteredList=gradesRepository.findAllByCourseId(id);
        }

        return coursesFilteredList;
    }

    public List<Grades> getAllGradesByStudentId(Integer id)
    {
        List<Grades> coursesFilteredList = null;

        if (id==0)
        {
            coursesFilteredList = gradesRepository.findAll();
        }
        else
        {
            coursesFilteredList=gradesRepository.findAllByStudentId(id);
        }

        return coursesFilteredList;
    }
*/
   public void update(Grades old, Grades st)
   {
       if(old==null)
       {
           System.out.println("eror at update");
       }
       else
       {
           gradesRepository.delete(old);
           gradesRepository.save(st);
       }
   }

}
