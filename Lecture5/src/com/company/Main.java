package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
     UniversityGroup group1 = new UniversityGroup(
             "NameGroup1",
             1995);

     UniversityGroup group2 = new UniversityGroup(
             "NameGroup2",
             1997,
             new ArrayList<>(Arrays.asList("Student 1", "Student 2", "Student 3")));

     group1.addStudent("Student006");
     group1.addStudent("Student007");
     group1.addStudent("Student008");
     group1.addStudent("Student009");
     group1.addStudent("Student010");


     group2.addStudent("Student 4");
     group2.addStudent("Student 5");
     group2.addStudent("Student 6");
     group2.addStudent("Student 7");
     group2.addStudent("Student 8");

     group2.removeStudent("Student 4");

     group1.getGroupDescription();
     group2.getGroupDescription();




    }
}
