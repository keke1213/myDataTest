package com.collection;

public class Student  {
    String name;
    int age;
    public Student(String name, int age) {
        this.name= name;
        this.age = age;
    }
    public String toString() {
        return "[name: " + name + ", age: " + age + "]";
    }


}