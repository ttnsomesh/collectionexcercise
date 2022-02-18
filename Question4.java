package com.collectionexcercise;
/*
Create class Employee with attributes
name,age,designation and use instances of these class as keys in a Map and their salary as value
* */

import java.util.HashMap;
import java.util.Map;

class Employee{
    private String name;
    private int age;
    private String designation;
    double salary;

    Employee(String name , int age , String designation , double salary){
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
public class Question4 {
    public static void main(String[] args) {
        Employee e1 = new Employee("somesh" , 22 , "jvm" , 34000.0);
        Employee e2 = new Employee("sourav" , 23 , "feen" , 32000.0);
        Employee e3 = new Employee("dinesh" , 24 , "jvm",33000);
        Employee e4 = new Employee("riya" , 21 , "feen" , 45000);
        Employee e5 = new Employee("tushar" , 24 , "qe" , 32000);
        Map<Employee , Double> m = new HashMap<>();
        m.put(e1 , e1.getSalary());
        m.put(e2 , e2.getSalary());
        m.put(e3 , e3.getSalary());
        m.put(e4 , e4.getSalary());
        m.put(e5 , e5.getSalary());

    }
}
