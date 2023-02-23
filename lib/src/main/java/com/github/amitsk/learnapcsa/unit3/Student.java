package com.github.amitsk.learnapcsa.unit3;

public class Student {
    private final String name;

    public Student() {
        this.name = "";
    }
    public Student(String studName) {
         this.name = studName;
    }

    public String getName() {
        return name;
    }
    private String myName() {
        return  this.getName();
    }
}