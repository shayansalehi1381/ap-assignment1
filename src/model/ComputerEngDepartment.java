package model;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class ComputerEngDepartment extends Department {
   static SpecializedCourse course1;
    static SpecializedCourse course2;
    static SpecializedCourse course3;
    public static ArrayList<Course> CECourses = new ArrayList<>();
    public ComputerEngDepartment(){
        super();
        course1 = new SpecializedCourse("BasicProgramming",21,"Sharifi",100,4,false, DayOfWeek.MONDAY, LocalTime.of(10,0),LocalTime.of(13,0), LocalDate.of(2024,6,20));
        CECourses.add(course1);
        course2 = new SpecializedCourse("AdvancedProgramming ",22,"Rezaii",80,4,false, DayOfWeek.TUESDAY,LocalTime.of(14,0),LocalTime.of(16,0), LocalDate.of(2024,6,21));
        CECourses.add(course2);
        course3 = new SpecializedCourse("DataStrocture",23,"Ahmadi",50,4,false, DayOfWeek.WEDNESDAY,LocalTime.of(10,0),LocalTime.of(12,0), LocalDate.of(2024,6,18));
        CECourses.add(course3);

        for (Course c:CECourses){
            Department.allCourses.add(c);
        }
    }

    @Override
    public void showCoursesOfDepartment() {
        for (Course c: CECourses){
            System.out.println(c);
        }
    }



}
