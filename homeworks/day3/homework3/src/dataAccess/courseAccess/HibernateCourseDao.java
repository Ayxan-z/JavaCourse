package dataAccess.courseAccess;

import entities.Course;

public class HibernateCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Added course with Hibernate: " + course.getName());
    }
}
