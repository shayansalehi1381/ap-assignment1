package University.Department;

import University.Course.Course;
import University.Course.GeneralCourse;
import University.Course.SpecializedCourse;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class MathDepartment extends Department {

    public static String name = "Math Department";
      public static ArrayList<Course> mathCourses = new ArrayList<>();

    public MathDepartment(){
        super();
        mathCourses.add(new SpecializedCourse("calcalus1",11,"Jamali",100,4,false, DayOfWeek.SUNDAY,LocalTime.of(10,0),LocalTime.of(13,0), LocalDate.of(2024,6,20)));
        mathCourses.add(new SpecializedCourse("calcalus2",12,"Habibi",80,4,false, DayOfWeek.MONDAY,LocalTime.of(14,0),LocalTime.of(16,0), LocalDate.of(2024,6,20)));
        mathCourses.add(new SpecializedCourse("probability",13,"Mirsadeqi",0,4,false, DayOfWeek.SUNDAY,LocalTime.of(10,0),LocalTime.of(12,0), LocalDate.of(2024,6,17)));
        mathCourses.add(new GeneralCourse("Farsi",10,"Jalili",25,3,true, DayOfWeek.SATURDAY,LocalTime.of(13,0),LocalTime.of(15,0), LocalDate.of(2024,6,11)));
        for (Course c:mathCourses){
            Department.allCourses.add(c);
        }
    }

    @Override
    public void showCoursesOfDepartment() {
        for (Course c:mathCourses){
            System.out.println(c);
        }


    }
}
