package University.Department;

import University.Course.Course;
import University.University;

import java.util.ArrayList;

public abstract class Department {

    public static ArrayList<Course>allCourses = new ArrayList<>();
    public static ArrayList<Integer> allCodeCourses = new ArrayList<Integer>();

    public Department(){
    University.departments.add(this);
    }

    public abstract void showCoursesOfDepartment();





}
