package ca.tetervak.coursesdemo.repository;

import ca.tetervak.coursesdemo.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
