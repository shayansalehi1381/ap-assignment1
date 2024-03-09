package model;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class Admin extends User{

    public Admin(String name, String passWord) {
        super(name, passWord);
    }
    boolean Math = false;
    boolean CE = false;
    boolean CHE = false;
    boolean EE = false;
    boolean LC = false;
    boolean RC = false;

    @Override
    public void options() {
        boolean running = true;
        while (running){
            System.out.println("Departments:");
            System.out.println("** Math Department **");
            System.out.println("** Computer Engineering Department **");
            System.out.println("** Chemical Engineering Department **");
            System.out.println("** Elevtrical Engneering Department **");
            System.out.println("** Language Center **");
            System.out.println("** Religious Center **");
            System.out.println();
            System.out.println("1.Show courses of department");
            System.out.println("2.Back");
            int input = scanner.nextInt();
            if (input == 1){
                showCourses();
            }
            else if (input == 2){
                running = false;
            }
        }
    }

    public void addNewCourse(){
        System.out.println("Enter the name of the course:");
        String CourseName = scanner.next();
        System.out.println("Enter the Course Code:");
        int code = scanner.nextInt();
        System.out.println("Enter the Prof Name:");
        String ProfName = scanner.next();
        System.out.println("Enter the Capacity:");
        int capacity = scanner.nextInt();
        System.out.println("Enter the Course Unit:");
        int unit = scanner.nextInt();
        System.out.println("Enter 1 if the course is General");
        System.out.println("Enter 2 if the course is Specialized");
        int CourseType = scanner.nextInt();
        boolean isGeneral = false;
        if (CourseType == 1){
            isGeneral = true;
        }
        else if (CourseType == 2){
            isGeneral = false;
        }
        System.out.println("Enter the Class days:");
        System.out.println("1.Saturday");
        System.out.println("2.Sunday");
        System.out.println("3.Monday");
        System.out.println("4.Tuesday");
        System.out.println("5.Wednesday");
        DayOfWeek classDay;
        int days = scanner.nextInt();
        switch (days){
            case 1:classDay = DayOfWeek.SATURDAY;
                break;
            case 2: classDay = DayOfWeek.SUNDAY;
                break;
            case 3:classDay = DayOfWeek.MONDAY;
                break;
            case 4:classDay = DayOfWeek.TUESDAY;
                break;
            case 5:classDay = DayOfWeek.WEDNESDAY;
                break;
            default:classDay = DayOfWeek.THURSDAY;
        }
        System.out.println("Enter the class start time(the course ends 2 hours after that):");
        System.out.println("1. 8:00 AM");
        System.out.println("2. 10:00 AM");
        System.out.println("3. 1:00 PM");
        System.out.println("4. 3:00 PM");
        LocalTime startTime;
        LocalTime endTime;
        int classStartTime = scanner.nextInt();
        switch (classStartTime){
            case 1:startTime =LocalTime.of(8,0);
                endTime = LocalTime.of(10,0);
                break;
            case 2:startTime = LocalTime.of(10,0);
                endTime = LocalTime.of(12,0);
                break;
            case 3:startTime = LocalTime.of(13,0);
                endTime = LocalTime.of(15,0);
                break;
            case 4:startTime = LocalTime.of(15,0);
                endTime = LocalTime.of(17,0);
                break;
            default:startTime= LocalTime.of(9,0);
            endTime = LocalTime.of(11,0);
        }
        System.out.println("Exam Date:");
        System.out.println("Although the exam month is June!");
        LocalDate examDate;
        int number;
        System.out.print("Enter a number between 1 and 30: ");
        while (true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= 1 && number <= 30) {
                    break;
                }
            } else {
                String input = scanner.next();
                System.out.println(input + " is not a valid number. Please enter a valid integer between 1 and 30.");
            }
            System.out.print("Number must be between 1 and 30. Try again: ");
        }

        System.out.println("You entered: " + number);
        examDate= LocalDate.of(2024,6,number);

        Course newCourse = new Course(CourseName,code,ProfName,capacity,unit,isGeneral,classDay,startTime,endTime,examDate);
        System.out.println("Couse Details:");
        System.out.println(newCourse);
        if (Math == true){
          MathDepartment.mathCourses.add(newCourse);
        }
       else if (CE == true) {
            ComputerEngDepartment.CECourses.add(newCourse);
        } else if (CHE == true) {
            ChemicalEngDepartment.ChemicalEngCourses.add(newCourse);
        } else if (EE == true) {
            ElectricalEngDepartment.EEcourses.add(newCourse);
        } else if (LC == true) {
            LanguageCenter.LanguageCourses.add(newCourse);
        } else if (RC == true) {
            ReligiousCenter.ReligiousCourses.add(newCourse);
        }
    }

    public void removeCourse(){

    }

    public void increaseCapacityCourse(){

    }

    public void showEnrolledStudentsofCourse(){
        if (Math == true){
            System.out.println("Enter the Course Code to show its Students:");
            int code = scanner.nextInt();
            for (Course c:MathDepartment.mathCourses){
                if (c.getCode() == code){
                 for (Student s :c.studentsOfThisCourse){
                     System.out.println(s);
                 }
                }
            }
        } else if (CE == true) {
            System.out.println("Enter the Course Code to show its Students:");
            int code = scanner.nextInt();
            for (Course c:ComputerEngDepartment.CECourses){
                if (c.getCode() == code){
                    for (Student s :c.studentsOfThisCourse){
                        System.out.println(s);
                    }
                }
            }
        } else if (CHE == true) {
            System.out.println("Enter the Course Code to show its Students:");
            int code = scanner.nextInt();
            for (Course c:ChemicalEngDepartment.ChemicalEngCourses){
                if (c.getCode() == code){
                    for (Student s :c.studentsOfThisCourse){
                        System.out.println(s);
                    }
                }
            }
        } else if (EE == true) {
            System.out.println("Enter the Course Code to show its Students:");
            int code = scanner.nextInt();
            for (Course c:ElectricalEngDepartment.EEcourses){
                if (c.getCode() == code){
                    for (Student s :c.studentsOfThisCourse){
                        System.out.println(s);
                    }
                }
            }
        }else if (LC == true){
            System.out.println("Enter the Course Code to show its Students:");
            int code = scanner.nextInt();
            for (Course c:LanguageCenter.LanguageCourses){
                if (c.getCode() == code){
                    for (Student s :c.studentsOfThisCourse){
                        System.out.println(s);
                    }
                }
            }
        } else if (RC == true) {
            System.out.println("Enter the Course Code to show its Students:");
            int code = scanner.nextInt();
            for (Course c:ReligiousCenter.ReligiousCourses){
                if (c.getCode() == code){
                    for (Student s :c.studentsOfThisCourse){
                        System.out.println(s);
                    }
                }
            }
        }


    }

    public void removeStudentFromaCourse(){

    }

    public void addStudentToCourse(){
        System.out.println("Enter the Student ID: ");
        String StudentID = scanner.next();
        for (Student s: Student.students){
            if (s.getName().equals(StudentID)){
                System.out.println("Enter the Course Code:");
                int Code =scanner.nextInt();
                for (Course c :Department.allCourses){
                    if (c.getCode() == Code){
                        System.out.println(c);
                        if (c.getCapacity() > 0){
                            c.studentsOfThisCourse.add((s));
                            c.setCapacity(c.getCapacity()-1);
                            s.studentUnits+=c.getUnit();
                            s.courses.add(c);
                        }
                        else {
                            System.out.println("The capacity of "+c.getName()+" is full");
                        }
                    }
                }
            }

            else {
                System.out.println("There is no Student with this ID!");
                break;
            }
        }



    }

    public void showCourses(){
        boolean running = true;
        while (running){
            System.out.println("1.Math Department");
            System.out.println("2.Computer Engineering Department");
            System.out.println("3.Chemical Engineering Department");
            System.out.println("4.Elevtrical Engneering Department");
            System.out.println("5.Language Center");
            System.out.println("6.Religious Center");
            System.out.println("7.Back");

            int input = scanner.nextInt();
            if (input == 1){
                Math = true;
                for (Course c:MathDepartment.mathCourses){
                    System.out.println(c);
                }
                showAdminOptions2();

            }
            else if (input == 2){
                CE = true;
                for (Course c:ComputerEngDepartment.CECourses){
                    System.out.println(c);
                }
                showAdminOptions2();
            }
            else if (input == 3){
                CHE = true;
                for (Course c:ChemicalEngDepartment.ChemicalEngCourses){
                    System.out.println(c);
                }
                showAdminOptions2();
            }
            else if (input == 4){
                EE = true;
                for (Course c:ElectricalEngDepartment.EEcourses){
                    System.out.println(c);
                }
                showAdminOptions2();
            }
            else if (input == 5){
                LC = true;
                for (Course c:LanguageCenter.LanguageCourses){
                    System.out.println(c);
                }
                showAdminOptions2();
            }
            else if (input == 6){
                RC = true;
                for (Course c:ReligiousCenter.ReligiousCourses){
                    System.out.println(c);
                }
                showAdminOptions2();
            }

            else if (input == 7){
                Math = false;
                CE = false;
                CHE = false;
                EE = false;
                LC = false;
                RC = false;
                running = false;
            }

        }

    }



    public  void showAdminOptions2(){
        boolean running = true;
        while (running){
            System.out.println("**************************************************************************************************************************************************************************************");
            System.out.println("1.Add a New Course to this Department Or Remove a Course From this Department");
            System.out.println("2.show list of Enrolled Students in this Department");
            System.out.println("3.Back");
            int input = scanner.nextInt();
            if (input == 1){
          //  addNewCourse();
            }
            else if (input == 2){
                boolean running2 = true;
                while (running2){
                    System.out.println("1.show Enrolled Students of a Course");
                    System.out.println("2.add a Student to a Course");
                    System.out.println("3.Remove a Student from a Course");
                    System.out.println("4.Back");
                    int choice = scanner.nextInt();
                    if (choice == 1){
                        showEnrolledStudentsofCourse();
                    } else if (choice == 2) {
                        addStudentToCourse();
                    } else if (choice == 3) {
                        removeStudentFromaCourse();
                    }
                    else if (choice == 4){
                        running2 = false;
                    }
                }


            }
            else if (input == 3){
                running = false;
            }
        }
    }

}
