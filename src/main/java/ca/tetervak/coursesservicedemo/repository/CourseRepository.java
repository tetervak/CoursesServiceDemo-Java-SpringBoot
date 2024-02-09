package ca.tetervak.coursesservicedemo.repository;

import ca.tetervak.coursesservicedemo.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, String> {
}
