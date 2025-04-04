package com.bridgelabz.basicLevelProblems;

import java.lang.reflect.Method;

class Calculator{
    private int multiply(int a, int b){
        return a*b;
    }
}

public class InvokePrivateMethod {
    public static void accessPrivateMethod()throws Exception{
        Calculator calculator = new Calculator();

        Class c = calculator.getClass();

        Method method = c.getDeclaredMethod("multiply",int.class,int.class);
        method.setAccessible(true);
        Object o = method.invoke(calculator,5,6);
        System.out.println(o.toString());
    }
    public static void main(String[] args) {
        try{
            accessPrivateMethod();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
//30