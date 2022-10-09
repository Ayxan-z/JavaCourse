package dataAccess.courseAccess;

import entities.Course;

public class JdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Added course with Jdbc: " + course.getName());
    }
}
