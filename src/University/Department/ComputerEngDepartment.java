package University.Department;

import University.Course.Course;
import University.Course.GeneralCourse;
import University.Course.SpecializedCourse;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class ComputerEngDepartment extends Department {
    public static String name = "Computer Engineering Department";
   static SpecializedCourse course1;
    static SpecializedCourse course2;
    static SpecializedCourse course3;
    public static ArrayList<Course> CECourses = new ArrayList<>();
    public ComputerEngDepartment(){
        super();
        CECourses.add(new SpecializedCourse("BasicProgramming",21,"Sharifi",100,4,false, DayOfWeek.MONDAY, LocalTime.of(10,0),LocalTime.of(13,0), LocalDate.of(2024,6,20)));
        CECourses.add(new SpecializedCourse("AdvancedProgramming ",22,"Rezaii",80,4,false, DayOfWeek.TUESDAY,LocalTime.of(14,0),LocalTime.of(16,0), LocalDate.of(2024,6,21)));
        CECourses.add(new SpecializedCourse("DataStrocture",23,"Ahmadi",50,4,false, DayOfWeek.WEDNESDAY,LocalTime.of(10,0),LocalTime.of(12,0), LocalDate.of(2024,6,18)));
        CECourses.add(new GeneralCourse("Islamic ethics",10,"Moradi",25,2,true, DayOfWeek.TUESDAY,LocalTime.of(13,0),LocalTime.of(14,0), LocalDate.of(2024,6,20)));

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
