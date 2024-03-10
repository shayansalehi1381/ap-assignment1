package model;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Course {
    private String name;
    private int code;
    private String professorName;
    private int capacity;
    private int unit;
    private boolean isGeneral = false;
    private DayOfWeek classDay;
    private LocalTime startTime;
    private LocalTime endTime;
    private LocalDate examDate;
    public ArrayList<Student> studentsOfThisCourse;





    public Course(String name, int code, String professorName, int capacity, int unit,boolean isGeneral,DayOfWeek classDay,LocalTime startTime, LocalTime endTime,LocalDate examDate) {
        this.name = name;
        this.code = code;
        this.professorName = professorName;
        this.capacity = capacity;
        this.unit = unit;
        this.isGeneral = isGeneral;
        this.classDay = classDay;
        this.startTime = startTime;
        this.endTime = endTime;
        this.examDate = examDate;
        studentsOfThisCourse = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public boolean isGeneral() {
        return isGeneral;
    }

    public void setGeneral(boolean general) {
        isGeneral = general;
    }

    public DayOfWeek getClassDay() {
        return classDay;
    }

    public void setClassDay(DayOfWeek classDay) {
        this.classDay = classDay;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public LocalDate getExamDate() {
        return examDate;
    }

    public void setExamDate(LocalDate examDate) {
        this.examDate = examDate;
    }


    public String type(){
        if (isGeneral == true){
            return "General";
        }
        else {
            return "Speceialized";
        }
    }


    public String toString(){
        return "name: "+getName()+",code: "+getCode()+",ProfName: "+getProfessorName()+",Capacity: "+getCapacity()+",Unit: "+getUnit()+",type: "+type()+",classDay: "+getClassDay()+",StartTime: "+ getStartTime()+",EndTime: "+getEndTime()+",ExamDate: "+getExamDate();
    }


}
