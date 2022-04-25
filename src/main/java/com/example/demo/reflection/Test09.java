package com.example.demo.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test09 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class c1 = Class.forName("com.example.demo.reflection.User");
        User user = (User) c1.newInstance();
        Method method = c1.getDeclaredMethod("setName", String.class);
        method.invoke(user,"hhh");
        System.out.println(user.getName());
        Constructor constuctor = c1.getDeclaredConstructor(String.class,int.class,int.class);
        User user1 = (User) constuctor.newInstance("222",1,2);
        System.out.println(user1);
    }
}
