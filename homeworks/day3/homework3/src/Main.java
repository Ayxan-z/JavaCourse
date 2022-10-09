import business.CourseManager;
import dataAccess.courseAccess.HibernateCourseDao;
import entities.Course;
import logging.DatabaseLogger;
import logging.Logger;
import logging.MailLogger;

public class Main {
    public static void main(String[] args) throws Exception{
        Logger[] loggers = {new MailLogger(), new DatabaseLogger()};
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        Course course = new Course();
        course.setId(1);
        course.setEducatorId(1);
        course.setName("course4");
        course.setPrice(100);
        courseManager.add(course);
    }
}
