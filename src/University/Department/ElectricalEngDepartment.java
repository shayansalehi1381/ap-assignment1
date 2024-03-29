package University.Department;

import University.Course.Course;
import University.Course.GeneralCourse;
import University.Course.SpecializedCourse;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class ElectricalEngDepartment extends Department {
    public static String name = "Electrical Engineering Department";
    public static ArrayList<Course> EEcourses = new ArrayList<>();
    public ElectricalEngDepartment() {
        EEcourses.add(new SpecializedCourse("Electronic",41,"   Raoufi",40,3,false, DayOfWeek.SUNDAY, LocalTime.of(8,0),LocalTime.of(10,0), LocalDate.of(2024,6,3)));
        EEcourses.add(new SpecializedCourse("Power",42,"Ahmadi",40,3,false, DayOfWeek.MONDAY,LocalTime.of(11,0),LocalTime.of(13,0), LocalDate.of(2024,6,10)));
        EEcourses.add(new SpecializedCourse("System analys",43,"Mahmudi",30,4,false, DayOfWeek.TUESDAY,LocalTime.of(15,0),LocalTime.of(17,0), LocalDate.of(2024,6,7)));
        EEcourses.add(new GeneralCourse("Moral philosophy",10,"Bahrami",25,2,true, DayOfWeek.WEDNESDAY,LocalTime.of(8,0),LocalTime.of(10,0), LocalDate.of(2024,6,2)));
        for (Course c:EEcourses){
            Department.allCourses.add(c);
        }
    }

    @Override
    public void showCoursesOfDepartment() {
        for (Course c:EEcourses){
            System.out.println(c);
        }
    }


}
