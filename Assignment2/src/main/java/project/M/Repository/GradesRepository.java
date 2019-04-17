package project.M.Repository;

import project.M.Entities.Grades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GradesRepository extends JpaRepository<Grades, Integer> {
   // public List<Grades> findAllByCourseId(Integer id);
   // public List<Grades> findAllByStudentId(Integer id);


}
