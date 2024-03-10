package University.Departments;

import University.Course.Course;
import University.Course.GeneralCourse;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class ReligiousCenter extends Department {
    public static String name = "Religiuos Center Department";
    public static ArrayList<Course> ReligiousCourses = new ArrayList<>();
    public ReligiousCenter() {
        ReligiousCourses.add(new GeneralCourse("Quran",61,"Norouzi",20,2,true, DayOfWeek.WEDNESDAY, LocalTime.of(15,0),LocalTime.of(16,0), LocalDate.of(2024,6,5)));
        ReligiousCourses.add(new GeneralCourse("Islamic Revoloution",62,"Ferdowsi",20,2,true, DayOfWeek.WEDNESDAY,LocalTime.of(16,0),LocalTime.of(17,0), LocalDate.of(2024,6,5)));
        ReligiousCourses.add(new GeneralCourse("History",63,"Hosseini",20,2,true, DayOfWeek.WEDNESDAY,LocalTime.of(17,0),LocalTime.of(18,0), LocalDate.of(2024,6,5)));
        for (Course c:ReligiousCourses){
            Department.allCourses.add(c);
        }
    }

    @Override
    public void showCoursesOfDepartment() {
        for (Course c:ReligiousCourses){
            System.out.println(c);
        }
    }


}
