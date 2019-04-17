package project.M.Repository;
import java.util.List;

import project.M.Entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{
  //  List<Course> findAllByTeacher(Integer id);
    // public List<Course> findAllByTeacher(Integer id);

}
