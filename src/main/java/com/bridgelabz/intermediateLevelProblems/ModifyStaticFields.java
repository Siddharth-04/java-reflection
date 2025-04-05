package com.bridgelabz.intermediateLevelProblems;

import java.lang.reflect.Field;

class Configuration{
    private static String API_KEY = "apiKey";
}
public class ModifyStaticFields {
    public static void modifyApiKey() throws Exception{
        Class c = Configuration.class;

        Field f = c.getDeclaredField("API_KEY");
        f.setAccessible(true);
        f.set(Configuration.class,"apiKeyChanged");
        Object apiKey = f.get(Configuration.class);
        System.out.println(apiKey);
    }

    public static void main(String[] args) {
        try{
            modifyApiKey();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
//apiKeyChanged