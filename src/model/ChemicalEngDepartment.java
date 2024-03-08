package model;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class ChemicalEngDepartment extends Department {
    public static ArrayList<Course> ChemicalEngCourses = new ArrayList<>();
    public ChemicalEngDepartment(){
        super();
        ChemicalEngCourses.add(new SpecializedCourse("chimistry1",31,"Akbari",40,2,false, DayOfWeek.SATURDAY, LocalTime.of(10,0),LocalTime.of(13,0), LocalDate.of(2024,6,14)));
        ChemicalEngCourses.add(new SpecializedCourse("chimistry2",32,"Salehi",20,3,false, DayOfWeek.MONDAY,LocalTime.of(14,0),LocalTime.of(16,0), LocalDate.of(2024,6,15)));
        ChemicalEngCourses.add(new SpecializedCourse("chimistry3",33,"Nouri",15,3,false, DayOfWeek.TUESDAY,LocalTime.of(10,0),LocalTime.of(12,0), LocalDate.of(2024,6,19)));
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
