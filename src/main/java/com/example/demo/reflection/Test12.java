package com.example.demo.reflection;

public class Test12 {
    public static void main(String[] args) {
       Class c1 = Student2.class;
        TableKuang tableKuang = (TableKuang) c1.getAnnotation(TableKuang.class);
    }
}

class Student2{

}

@interface TableKuang{
    String value();
}

@interface FieldKuang{
    String columnName() default "";
}
