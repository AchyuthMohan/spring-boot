package com.example.demo.Student;
import java.util.*;
import java.time.LocalDate;

public class Student{
    private String name;
    private Integer id;
    private String email;
    private LocalDate dob;
    private Integer age;


    public Student(String name,
                   Integer age,
                   LocalDate dob,
                   String email,
                   Integer id) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.email = email;
        this.id = id;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student(String name,
                   String email,
                   LocalDate dob,
                   Integer age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }


}