package model;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class LanguageCenter extends Department {
    public static ArrayList<Course> LanguageCourses = new ArrayList<>();
    public LanguageCenter() {
        LanguageCourses.add(new GeneralCourse("English",51,"Vaezi",100,2,true, DayOfWeek.SUNDAY, LocalTime.of(8,0),LocalTime.of(9,0), LocalDate.of(2024,6,11)));
        LanguageCourses.add(new GeneralCourse("Spanish",52,"HasanPour",80,2,true, DayOfWeek.MONDAY,LocalTime.of(9,0),LocalTime.of(10,0), LocalDate.of(2024,6,12)));
        LanguageCourses.add(new GeneralCourse("French",53,"Radesh",50,2,true, DayOfWeek.SUNDAY,LocalTime.of(10,0),LocalTime.of(11,0), LocalDate.of(2024,6,13)));
        for (Course c:LanguageCourses){
            Department.allCourses.add(c);
        }
    }

    @Override
    public void showCoursesOfDepartment() {
        for (Course c:LanguageCourses){
            System.out.println(c);
        }
    }

}
