package model;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class MathDepartment extends Department{
       static SpecializedCourse course1;
        static SpecializedCourse course2;
        static SpecializedCourse course3;
      public static ArrayList<Course> mathCourses = new ArrayList<>();

    public MathDepartment(){
        super();
        course1 = new SpecializedCourse("calcalus1",11,"Jamali",100,4,false, DayOfWeek.SUNDAY,LocalTime.of(10,0),LocalTime.of(13,0), LocalDate.of(2024,6,20));
        course2 = new SpecializedCourse("calcalus2",12,"Habibi",80,4,false, DayOfWeek.MONDAY,LocalTime.of(14,0),LocalTime.of(16,0), LocalDate.of(2024,6,20));
        course3 = new SpecializedCourse("probability",13,"Mirsadeqi",50,4,false, DayOfWeek.SUNDAY,LocalTime.of(10,0),LocalTime.of(12,0), LocalDate.of(2024,6,17));
        addCourseToList();
    }

    @Override
    public void showCoursesOfDepartment() {
        for (Course c:mathCourses){
            System.out.println(c);
        }


    }




    public void addCourseToList(){
        mathCourses.add(course1);
        mathCourses.add(course2);
        mathCourses.add(course3);
    }




}
