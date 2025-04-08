package com.bridgelabz.advanceLevelProblems;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Car{
    String name;
    String color;
    String model;

    private void print(){
        System.out.println("Name : " + name);
        System.out.println("Colour : " + color);
        System.out.println("Model : " + model);
    }
}

public class MethodExecutionTiming {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class c = Car.class;
        Car car = new Car();
        Method [] methods = c.getDeclaredMethods();
        long startTime = 0;
        long endTime = 0;

        for(Method m : methods){
            m.setAccessible(true);
            if(m.getName().equals("print")){
                startTime = System.nanoTime();
                m.invoke(car);
                endTime = System.nanoTime();
            }
        }

        System.out.println("Execution Time : " + (endTime - startTime));
    }
}
//Name : null
//Colour : null
//Model : null
//Execution Time : 420400