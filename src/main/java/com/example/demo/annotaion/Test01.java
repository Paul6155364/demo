package com.example.demo.annotaion;

import java.lang.annotation.*;

@MyAnnotation
public class Test01 {
        @MyAnnotation1("hh")
        public void test(){

        }
}
@Target(value = {ElementType.METHOD,ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
@interface MyAnnotation{
        String name() default "";
        int age() default 0;
        int id() default -1;
        String[] schools() default {"SUS"};
}

@Target(value = {ElementType.METHOD,ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
@interface MyAnnotation1{
        String value();
}

