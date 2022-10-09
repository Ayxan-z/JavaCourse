package business;

import dataAccess.courseAccess.CourseDao;
import entities.Course;
import logging.Logger;
import validators.CourseValidator;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        if (!CourseValidator.isValidId(course)) {
            throw new Exception("course id isn't valid");
        }
        if (!CourseValidator.isValidCourse(course)) {
            throw new Exception("course isn't valid");
        }
        courseDao.add(course);

        for (Logger logger: loggers) {
            logger.log(course.getName());
        }
    }
}
