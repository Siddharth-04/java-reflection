package com.bridgelabz.advanceLevelProblems;
import java.lang.reflect.Field;

class Person{
    String name;
    int age;
    int rollNo;

    public Person(String name, int age, int rollNo) {
        this.name  = name;
        this.age = age;
        this.rollNo = rollNo;
    }
}
class JsonConverter{
    public static  String jsonConversion(Person p){
        if(p == null){
            return "null";

        }
        StringBuilder json = new StringBuilder("{");

        Class c = p.getClass();
        Field [] field = c.getDeclaredFields();

        for(int i=0 ; i<field.length ; i++) {
            Field f = field[i];
            f.setAccessible(true);
            try{
                Object value = f.get(p);
                String name = f.getName();
                json.append("\"").append(name).append("\":");

                if(value == null){
                    json.append("\"null\"");
                }
                else{
                    json.append("\"").append(value).append("\"");
                }

                if(i<field.length-1){
                    json.append(",");
                }else{
                    json.append("}");
                }

            }catch(Exception e){
                e.printStackTrace();
            }
        }

        return json.toString();
    }
}
public class GenerateJsonRepresentation {
    public static void main(String[] args) {
        Person person = new Person("Siddharth",23,101);
        JsonConverter jsonConverter = new JsonConverter();
        String json = jsonConverter.jsonConversion(person);
        System.out.println(json);
    }
}
//{"name":"Siddharth","age":"23","rollNo":"101"}