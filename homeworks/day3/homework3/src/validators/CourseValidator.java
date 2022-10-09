package validators;

import java.util.Arrays;
import java.util.List;

import entities.Course;

public class CourseValidator extends Validator {
    public static boolean isValidCourse(Course course) {
        List<String> exampleCategoryNames = Arrays.asList("course1", "course2", "course3");
        if (exampleCategoryNames.contains(course.getName())) {return false;}
        if (course.getPrice() < 0) {return false;}
        return true;
    }
}
