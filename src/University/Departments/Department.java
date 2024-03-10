package University.Departments;

import University.University;
import University.Course.Course;

import java.util.ArrayList;

public abstract class Department {

    public static ArrayList<Course>allCourses = new ArrayList<>();

    public Department(){
    University.departments.add(this);
    }

    public abstract void showCoursesOfDepartment();





}
