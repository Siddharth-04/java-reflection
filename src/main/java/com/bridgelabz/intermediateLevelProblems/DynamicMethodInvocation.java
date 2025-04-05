package com.bridgelabz.intermediateLevelProblems;

import java.lang.reflect.Method;
import java.util.Scanner;

class Math{
    int a;
    int b;

    public int add(int a , int b){
        return a+b;
    }

    public int sub(int a , int b){
        return a-b;
    }

    public int multiply(int a , int b) {
        return a * b;
    }
}

public class DynamicMethodInvocation {
    private static void callMethodDynamically() throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String methodName = sc.next();

        Math math = new Math();

        Class c = Math.class;
        Method m = c.getDeclaredMethod(methodName, int.class, int.class);
        Object o = m.invoke(math,a,b);
        System.out.println("Result of method "+ methodName + " : " + o);
    }

    public static void main(String[] args) {
        try{
            callMethodDynamically();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
//5
//6
//multiply
//Result of method multiply : 30