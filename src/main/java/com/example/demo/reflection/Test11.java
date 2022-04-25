package com.example.demo.reflection;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class Test11 {
    public void test01(Map<String,User> map, List<User> list){
        System.out.println("test01");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = Test11.class.getMethod("test01", Map.class, List.class);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        for (Type type : genericParameterTypes){
            System.out.println(type);
            if(type instanceof ParameterizedType){
               Type[] types = ((ParameterizedType) type).getActualTypeArguments();
               for(Type type1 : types){
                   System.out.println(type1);
               }
            }
        }
    }
}
