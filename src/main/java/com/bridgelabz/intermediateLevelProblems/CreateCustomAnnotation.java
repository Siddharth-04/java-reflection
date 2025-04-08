package com.bridgelabz.intermediateLevelProblems;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}

@Author(name = "Siddharth")
public class CreateCustomAnnotation {
    public static void main(String[] args) {
        Class c = CreateCustomAnnotation.class;

        if(c.isAnnotationPresent(Author.class)){
            Author author = (Author) c.getAnnotation(Author.class);
            System.out.println(author.name());
        }
    }
}
//Siddharth