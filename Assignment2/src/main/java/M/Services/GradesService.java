package M.Services;

import M.Entities.Course;
import M.Entities.Grades;
import M.Repository.GradesRepository;
import M.Repository.TeacherRepository;

import javax.inject.Inject;
import java.util.List;

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

    public List<Grades> getAllGradesByCourseId(Integer id)
    {
        List<Grades> coursesFilteredList = null;

        if (id==0)
        {
            coursesFilteredList = gradesRepository.findAll();
        }
        else
        {
            coursesFilteredList=gradesRepository.findAllByCourseid(id);
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
            coursesFilteredList=gradesRepository.findAllByStudentid(id);
        }

        return coursesFilteredList;
    }


}
