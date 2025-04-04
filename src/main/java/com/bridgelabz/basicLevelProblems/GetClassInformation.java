package com.bridgelabz.basicLevelProblems;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Company{
    private final String companyName;
    String departmentName;
    int departmentID;
    int employees;

    Company(String companyName, String departmentName, int departmentID, int employees) {
        this.companyName = companyName;
        this.departmentName = departmentName;
        this.departmentID = departmentID;
        this.employees = employees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }
}
public class GetClassInformation {
    public static void main(String[] args) {
        Company company = new Company("Bridge LabZ", "Trainer", 2, 1);

        Class obj = company.getClass();

        //Method display
        Method [] methods = obj.getDeclaredMethods();

        System.out.println("Method Details \n");
        for(Method method : methods) {
            int modifiers = method.getModifiers();
            String modifier = Modifier.toString(modifiers);
            System.out.println(method.getName() + " , " + method.getReturnType() + " , " + modifier);
        }

        //Fields display
        Field [] field =  obj.getDeclaredFields();
        System.out.println("\nField Details \n");

        for(Field f : field) {
            int modifiers = f.getModifiers();
            System.out.println(f.getName() + "," + f.getType());
        }

        Constructor [] constructor = obj.getDeclaredConstructors();

        System.out.println("\nConstructor Details \n");

        for(Constructor c : constructor) {
            System.out.println(c.getName());
        }
    }
}
//Method Details
//
//setDepartmentName , void , public
//setEmployees , void , public
//getDepartmentID , int , public
//setDepartmentID , void , public
//getEmployees , int , public
//getCompanyName , class java.lang.String , public
//getDepartmentName , class java.lang.String , public
//
//Field Details
//
//companyName,class java.lang.String
//departmentName,class java.lang.String
//departmentID,int
//employees,int
//
//Constructor Details
//
//com.bridgelabz.basicLevelProblems.Company