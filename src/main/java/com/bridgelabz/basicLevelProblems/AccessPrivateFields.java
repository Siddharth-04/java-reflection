package com.bridgelabz.basicLevelProblems;
import java.lang.reflect.*;

class Person {
    String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class AccessPrivateFields{
    public void accessPrivateFields() throws Exception{
        Person person = new Person("Siddharth", 23);
        Class c = person.getClass();

        Field field = c.getDeclaredField("age");
        field.setAccessible(true);
        field.set(person,19);

        System.out.println("Changed Value : "+  field.get(person));
    }
    public static void main(String[] args) {
        AccessPrivateFields apf = new AccessPrivateFields();

        try{
            apf.accessPrivateFields();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
