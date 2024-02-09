package ca.tetervak.coursesservicedemo.init;

import ca.tetervak.coursesservicedemo.domain.Course;
import ca.tetervak.coursesservicedemo.domain.Student;
import ca.tetervak.coursesservicedemo.repository.CourseRepository;
import ca.tetervak.coursesservicedemo.repository.StudentRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {

    StudentRepository studentRepository;

    CourseRepository courseRepository;

    public DataInitializer(StudentRepository studentRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    @PostConstruct
    public void init() {

        Student bart = new Student("Bart", "Simpson");
        Student lisa = new Student("Lisa", "Simpson");
        Student marge = new Student("Marge", "Simpson");
        Student homer = new Student("Homer", "Simpson");

        Course prog10004 = new Course("PROG10004", "Programming Principles");
        Course syst10082 = new Course("SYST10082", "Operating Systems Fundamentals");
        Course math10025 = new Course("MATH10025", "Mathematics for Computing");
        Course tele10025 = new Course("TELE10025", "Edge to Core: Network Foundations");

        bart = studentRepository.save(bart);
        lisa = studentRepository.save(lisa);
        marge = studentRepository.save(marge);
        homer = studentRepository.save(homer);

        prog10004 = courseRepository.save(prog10004);
        syst10082 = courseRepository.save(syst10082);
        math10025 = courseRepository.save(math10025);
        tele10025 = courseRepository.save(tele10025);

        bart.registerToCourse(prog10004);
        bart.registerToCourse(syst10082);
        studentRepository.save(bart);

        lisa.registerToCourse(math10025);
        lisa.registerToCourse(tele10025);
        studentRepository.save(lisa);

        marge.registerToCourse(prog10004);
        marge.registerToCourse(syst10082);
        marge.registerToCourse(math10025);
        studentRepository.save(marge);

        homer.registerToCourse(tele10025);
        studentRepository.save(homer);
    }
}
