package model;

import model.Course;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Student extends User {

    ArrayList<Course> courses;
    int studentUnits = 0;



    public Student(String name, String pass) {
        super(name, pass);
        courses = new ArrayList<>();
    }



    @Override
    public void options() {
       boolean running = true;
        while (running){
            System.out.println("1.show courses of the Departments");
            System.out.println("2.show Enrolled courses");
            System.out.println("3.back");
            int input = scanner.nextInt();

            if (input == 1){

                showCoursesofDepartmentOrChoose();

            }

            else if (input == 2){
                showEnrolledCourses();
            }

            else if (input == 3){
                running = false;
            }
        }


    }

    public void chooseCourses(){

    }

    public void removeCourse(){

    }

    public void showCoursesofDepartmentOrChoose (){
        final MathDepartment mathDepartment = new MathDepartment();
        final ComputerEngDepartment computerEngDepartment = new ComputerEngDepartment();
        final ChemicalEngDepartment chemicalEngDepartment = new ChemicalEngDepartment();
        final ElectricalEngDepartment electricalEngDepartment = new ElectricalEngDepartment();
        final LanguageCenter languageCenter = new LanguageCenter();
        final ReligiousCenter religiousCenter = new ReligiousCenter();
        boolean running = true;
        while (running){
            System.out.println("1.See Math Department Courses");
            System.out.println("2.See Computer Engineering Department Courses");
            System.out.println("3.See Chemical Engineering Department Courses");
            System.out.println("4.See Electrical Engineering Department Courses");
            System.out.println("5.See Language Center Courses");
            System.out.println("6.See Religious Center Courses");
            System.out.println("7.Choose Course from a Department ");
            System.out.println("8.back");
            int choice = scanner.nextInt();
            if (choice == 1){
                System.out.println("***************************************************************************************************************************************************************************************************");
               for (Course c:MathDepartment.mathCourses){
                   System.out.println(c);
               }

                System.out.println("***************************************************************************************************************************************************************************************************");
            }
            else if (choice == 2){
                System.out.println("***************************************************************************************************************************************************************************************************");
                for (Course c:ComputerEngDepartment.CECourses){
                    System.out.println(c);
                }

                System.out.println("***************************************************************************************************************************************************************************************************");
            } else if (choice == 3) {
                chemicalEngDepartment.showCoursesOfDepartment();
            } else if (choice == 4) {
                electricalEngDepartment.showCoursesOfDepartment();
            } else if (choice == 5) {
                languageCenter.showCoursesOfDepartment();
            } else if (choice == 6) {
                religiousCenter.showCoursesOfDepartment();

            }
            else if (choice == 7){
                    getCourses();
                for (Course c :courses){
                    System.out.println(c);
                }
            }else if (choice == 8){
                running = false;
                MathDepartment.mathCourses.clear();
                ComputerEngDepartment.CECourses.clear();
            }


        }


    }

    public void showEnrolledCourses(){

    }

    public void getCourses() {
        System.out.println("Enter the Course code: ");
        int input = scanner.nextInt();
       switch (input){
           case 11:
               courses.add(MathDepartment.course1);
               MathDepartment.course1.setCapacity(MathDepartment.course1.getCapacity()-1);
               System.out.println(MathDepartment.course1.getCapacity());
               break;
           case 12:
               courses.add(MathDepartment.course2);
               MathDepartment.course1.setCapacity(MathDepartment.course1.getCapacity()-1);
               break;
           case 13:
               courses.add(MathDepartment.course3);
               MathDepartment.course1.setCapacity(MathDepartment.course1.getCapacity()-1);
               break;
           case 21:
               courses.add(ComputerEngDepartment.course1);
               ComputerEngDepartment.course1.setCapacity(ComputerEngDepartment.course1.getCapacity()-1);
               break;
           case 22:
               courses.add(ComputerEngDepartment.course2);
               break;
           case 23:
               courses.add(ComputerEngDepartment.course3);
               break;
           case 31:
               break;
           case 32:
               break;
           case 33:
               break;
           case 41:
               break;
           case 42:
               break;
           case 43:
               break;
           case 51:
               break;
           case 52:
               break;
           case 53:
               break;
           case 61:
               break;
           case 62:
               break;
           case 63:
               break;
           default:
       }
    }

    public int getStudentUnits() {
        return studentUnits;
    }
}
