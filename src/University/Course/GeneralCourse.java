package model;

import model.Course;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class GeneralCourse extends Course {

    public GeneralCourse(String name, int code, String professorName, int capacity, int unit, boolean isGeneral, DayOfWeek classDay, LocalTime startTime, LocalTime endTime, LocalDate examDate) {
        super(name, code, professorName, capacity, unit, isGeneral, classDay, startTime, endTime, examDate);
        isGeneral = true;
    }
}
