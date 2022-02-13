package optional;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class TrainingCompany {

    // --- attributes ---------------------------------------------------------

    private List<Course> courses;

    // --- constructors -------------------------------------------------------

    public TrainingCompany(List<Course> courses) {
        this.courses = courses;
    }

    // --- getters and setters ------------------------------------------------

    public List<Course> getCourses() { return courses; }

    // --- public methods -----------------------------------------------------

    public Course getCheaperCourse(int maxPrice) {
        Optional<Course> cheapCourse = Optional.empty();
        for (Course course : courses) {
            if (course.getPrice() <= maxPrice) {
                cheapCourse = Optional.of(course);
            }
        }
        return cheapCourse.orElseThrow(exceptionSupplier());
    }

    public int getPriceOfCourseWithGivenNameAndLevel(String name, Level level) {
        Optional<Course> courseWithGivenNameAndLevel = Optional.empty();
        for (Course course : courses) {
            if (course.getName().equals(name) && course.getLevel() == level) {
                courseWithGivenNameAndLevel = Optional.of(course);
            }
        }
        return courseWithGivenNameAndLevel.orElseThrow(exceptionSupplier()).getPrice();
    }

    public String getNameOfCourseWithGivenLevel(Level level) {
        Optional<String> courseNameWithGivenLevel = Optional.empty();
        for (Course course : courses) {
            if (course.getLevel() == level) {
                courseNameWithGivenLevel = Optional.of(course.getName());
            }
        }
        return courseNameWithGivenLevel.orElse("Sorry, there is no course at this level.");
    }

    // --- private methods ----------------------------------------------------

    private Supplier<IllegalArgumentException> exceptionSupplier() {
        return () -> new IllegalArgumentException("No such course.");
    }
}