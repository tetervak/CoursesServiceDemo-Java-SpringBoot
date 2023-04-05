package ca.tetervak.coursesdemo.repository;

import ca.tetervak.coursesdemo.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, String> {
}
