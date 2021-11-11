package com.company;

import java.util.ArrayList;

public class UniversityGroup {
    private String groupName;
    private int startYear;
    private int endYear;
    private ArrayList<String> studentList;

    public String getGroupName() {
        return groupName;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public ArrayList<String> getStudentList() {
        return studentList;
    }

    public UniversityGroup (String groupName, int startYear) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.endYear = startYear + 5;
        this.studentList = new ArrayList<>();
    }

    public UniversityGroup (String groupName, int startYear, ArrayList<String> studentList) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.studentList = studentList;
        this.endYear = startYear + 5;
    }

    public void addStudent (String student) {
        this.studentList.add(student);
    }

    public boolean removeStudent (String student) {
        return this.studentList.remove(student);
    }

    public void getGroupDescription () {
        System.out.println("Group Name: " + getGroupName());
        System.out.println( "Start year: " + getStartYear());
        System.out.println( "End year: " + getEndYear());
        System.out.println( "Student list: " + getStudentList());
    }
}
