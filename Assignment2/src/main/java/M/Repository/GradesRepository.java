package M.Repository;

import M.Entities.Course;
import M.Entities.Grades;
import M.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GradesRepository extends JpaRepository<Grades, Integer> {
    public List<Grades> findAllByCourseid(Integer id);
    public List<Grades> findAllByStudentid(Integer id);


}
