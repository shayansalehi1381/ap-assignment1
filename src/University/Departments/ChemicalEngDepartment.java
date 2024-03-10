package University.Departments;

import University.Course.Course;
import University.Course.GeneralCourse;
import University.Course.SpecializedCourse;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class ChemicalEngDepartment extends Department {
    public static String name = "Chemical Engineering Department";
    public static ArrayList<Course> ChemicalEngCourses = new ArrayList<>();
    public ChemicalEngDepartment(){
        super();
        ChemicalEngCourses.add(new SpecializedCourse("chimistry1",31,"Akbari",40,2,false, DayOfWeek.SATURDAY, LocalTime.of(10,0),LocalTime.of(13,0), LocalDate.of(2024,6,14)));
        ChemicalEngCourses.add(new SpecializedCourse("chimistry2",32,"Salehi",20,3,false, DayOfWeek.MONDAY,LocalTime.of(14,0),LocalTime.of(16,0), LocalDate.of(2024,6,15)));
        ChemicalEngCourses.add(new SpecializedCourse("chimistry3",33,"Nouri",15,3,false, DayOfWeek.TUESDAY,LocalTime.of(10,0),LocalTime.of(12,0), LocalDate.of(2024,6,19)));
        ChemicalEngCourses.add(new GeneralCourse("DaneshKhanevade",10,"Khazaii",25,2,true, DayOfWeek.SUNDAY,LocalTime.of(17,0),LocalTime.of(19,0), LocalDate.of(2024,6,10)));
        for (Course c:ChemicalEngCourses){
            Department.allCourses.add(c);
        }
    }

    @Override
    public void showCoursesOfDepartment() {
        for (Course c:ChemicalEngCourses){
            System.out.println(c);
        }
    }


}
