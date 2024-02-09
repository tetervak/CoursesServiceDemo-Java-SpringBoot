package ca.tetervak.coursesservicedemo.domain;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue
    private Integer id = 0;

    @Column(name = "first_name")
    private String firstName = "";

    @Column(name = "last_name")
    private String lastName = "";

    @ManyToMany
    private List<Course> courses = new ArrayList<>();

    public Student() {
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void registerToCourse(Course course){
        courses.add(course);
    }

    public void unRegisterFromCourse(Course course){
        courses.removeIf(c -> c.code.equals(course.code));
    }
}
