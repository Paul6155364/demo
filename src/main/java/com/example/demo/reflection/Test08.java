package com.example.demo.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("com.example.demo.reflection.User");
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());
        Field[] fields = c1.getDeclaredFields();
        for (Field field: fields){
            System.out.println(field);
        }
        Field name = c1.getDeclaredField("name");
        System.out.println(name);
        Method[] methods = c1.getDeclaredMethods();
        for (Method method:methods){
            System.out.println(method);
        }
        System.out.println(c1.getMethod("getName",null));
    }
}
