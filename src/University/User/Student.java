package University.User;

import University.Course.Course;
import University.Departments.*;

import java.util.ArrayList;

public class Student extends User {
    static ArrayList<Student> students = new ArrayList<>();
    ArrayList<Course> courses;
    int studentUnits = 0;


    public Student(String name, String pass) {
        super(name, pass);
        courses = new ArrayList<>();
        students.add(this);
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



    public void showCoursesofDepartmentOrChoose (){

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
                for (Course c: ComputerEngDepartment.CECourses){
                    System.out.println(c);
                }

                System.out.println("***************************************************************************************************************************************************************************************************");
            } else if (choice == 3) {
                System.out.println("***************************************************************************************************************************************************************************************************");
                for (Course c: ChemicalEngDepartment.ChemicalEngCourses){
                    System.out.println(c);
                }

                System.out.println("***************************************************************************************************************************************************************************************************");
            } else if (choice == 4) {
                System.out.println("***************************************************************************************************************************************************************************************************");
                for (Course c: ElectricalEngDepartment.EEcourses){
                    System.out.println(c);
                }

                System.out.println("***************************************************************************************************************************************************************************************************");
            } else if (choice == 5) {
                System.out.println("***************************************************************************************************************************************************************************************************");
                for (Course c:LanguageCenter.LanguageCourses){
                    System.out.println(c);
                }

                System.out.println("***************************************************************************************************************************************************************************************************");
            } else if (choice == 6) {
                System.out.println("***************************************************************************************************************************************************************************************************");
                for (Course c: ReligiousCenter.ReligiousCourses){
                    System.out.println(c);
                }

                System.out.println("***************************************************************************************************************************************************************************************************");

            }
            else if (choice == 7){
               chooseCourses();
            }else if (choice == 8){
                running = false;

            }


        }


    }



    public void chooseCourses(){
        getCourses();
        for (Course c :courses){
            System.out.println(c);
        }
    }

    public void removeCourse(){
        System.out.println("Enter the Course Code to Remove:");
        int input = scanner.nextInt();

        for (int i = this.courses.size() - 1; i >= 0; i--) {
            Course c = this.courses.get(i);
            if(c.getCode() == input){
                courses.remove(i);
                c.setCapacity(c.getCapacity()+1);
                this.studentUnits-=c.getUnit();
                c.studentsOfThisCourse.remove(this);
            }
        }

    }

    public void showEnrolledCourses(){
        boolean running = true;
        while (running){
            System.out.println("1.Show Enrolled Courses");
            System.out.println("2.Remove Course");
            System.out.println("3.Back");
            int input = scanner.nextInt();
            if (input == 1){
                if (courses.size() == 0){
                    System.out.println("You Have No Courses yet!");
                }
                else
                    for (Course c:this.courses){
                        System.out.println(c);
                    }
                System.out.println("Total units: "+studentUnits);
                System.out.println("Number of courses: "+courses.size());
            }
            else if (input == 2){
                removeCourse();
            }
            else if (input == 3){
                running = false;
            }
        }

    }

    public void getCourses() {
        System.out.println("Enter the Course code: ");
        int input = scanner.nextInt();
        Course course = null;
        for (Course c: Department.allCourses){
            if (c.getCode() == input){
                course = c;
            }
        }
        int unitCalculate = studentUnits;
       unitCalculate+= course.getUnit();
        if (unitCalculate <= 20) {
            if (hasTimeConflict(course) == false){
                if (hasExamDateConflict(course) == false){
                    if (courseIsFull(course) == false){
                        if (generalCourseIsMoreThanFiveUnit(this,course) == false){

                            this.courses.add(course);
                            course.studentsOfThisCourse.add(this);
                            this.studentUnits += course.getUnit();
                            course.setCapacity(course.getCapacity() - 1);
                        }
                       else System.out.println("you can't take more than 5 units of general courses!");
                    }
                  else System.out.println("the Course Capacity is full");
                }
               else System.out.println("2 courses Exam date are in a same day!");
            }
                       else {
                System.out.println("class time has Conflict!");
            }
                    }
        else System.out.println("You can't have more than 20 units in a semester!");
            }





    private boolean hasTimeConflict(Course a) {
        int i = 0;
        for (Course c:this.courses){
            if (a.getStartTime().equals(c.getStartTime())) {
                i++;
            }
        }
        if (i > 0){
            return true;
        }
        else return false;
    }


    private boolean hasExamDateConflict(Course a) {
        int i = 0;
        for (Course c:this.courses){
            if (a.getExamDate().equals(c.getExamDate())) {
                i++;
            }
        }
        if (i > 0){
            return true;
        }
        else return false;
    }

    private boolean courseIsFull(Course course){
        if (course.getCapacity() > 0 ){
            return false;
        }
        else return true;
    }


    private boolean generalCourseIsMoreThanFiveUnit(Student student,Course course){
        int i=0;
        for (Course c:student.courses){
            if (c.isGeneral() == true){
                i+=c.getUnit();
            }
        }
        if (course.isGeneral() == true){
            i+=course.getUnit();
        }
        if (i > 5){

            return true;

        }
        else return false;
    }




        }





