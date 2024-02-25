package model;

import java.util.Scanner;

public class Admin extends User{

    public Admin(String name, String passWord) {
        super(name, passWord);
    }

    @Override
    public void options() {
        System.out.println("hello "+this.getName());
    }

    public void addNewCourse(){

    }

    public void removeCourse(){

    }

    public void increaseCapacityCourse(){

    }

    public void showEnrolledStudentsofCourse(){

    }

    public void removeStudentFromaCourse(){

    }

    public void addStudentToCourse(){

    }

}
