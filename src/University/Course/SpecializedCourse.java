package University.Course;

import University.Course.Course;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class SpecializedCourse extends Course {

    public SpecializedCourse(String name, int code, String professorName, int capacity, int unit, boolean isGeneral, DayOfWeek classDay, LocalTime startTime, LocalTime endTime, LocalDate examDate) {
        super(name, code, professorName, capacity, unit, isGeneral, classDay, startTime, endTime, examDate);
    }
}
