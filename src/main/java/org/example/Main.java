package org.example;

public class Main {

    public static void main (String[] args) {
        System.out.println("Hello world!");
        Student nwStudent = new Student("Java");
        System.out.println(nwStudent.getName());
        //System.out.println(nwStudent.getName()+" ---->");
        nwStudent.setName("Learning");
        System.out.println(nwStudent.getName());


    }
}