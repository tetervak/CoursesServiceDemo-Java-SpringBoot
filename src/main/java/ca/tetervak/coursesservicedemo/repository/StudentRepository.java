package ca.tetervak.coursesservicedemo.repository;

import ca.tetervak.coursesservicedemo.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
