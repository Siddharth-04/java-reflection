package com.bridgelabz.basicLevelProblems;

import java.lang.reflect.Constructor;

class Student{
    String name;
    int age;
    int rollNo;

    public Student(String name,int age,int rollNo){
        this.age=age;
        this.rollNo=rollNo;
        this.name=name;
    }
}

public class DynamicallyCreateObject  {
    public static void createObject() throws Exception{
        Class c = Student.class;

        Constructor contructor = c.getConstructor(String.class,int.class,int.class);
        Student student = (Student) contructor.newInstance("Sid",23,101);
        System.out.println(student.name + " , " + student.age + " , " + student.rollNo);
    }

    public static void main(String[] args) {
        try{
            createObject();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
//Sid , 23 , 101