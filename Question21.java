package com.collectionexcercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Employee1 implements Comparable<Employee1>{
    private int age;
    private double salary;
    private String firstName;
    private String lastName;

    Employee1(int age , double salary , String firstName , String lastName){
        this.age = age;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return lastName + ", " + firstName + salary;
    }

    public int compareTo(Employee1 o) {
        return (int)(salary - o.getSalary());
    }

}

public class Question21 {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1(23 , 20000.0 , "somesh" , "kumar");
        Employee1 e2 = new Employee1(45 , 30000.0 , "pawandeep" , "singh");
        Employee1 e3 = new Employee1(21 , 25000.0 , "tushar" , "palit");
        Employee1 e4 = new Employee1(34 , 27000.0 , "rohit" , "sharma");
        Employee1 e5 = new Employee1(22 , 40000.0 , "ishan" , "kishan");
        Employee1 e6 = new Employee1(33 , 50000.0 , "virat" , "kohli");

        List<Employee1> emp1 = Arrays.asList(e1 , e2 , e3 , e4 , e5 , e6);
        Collections.sort(emp1);
        Iterator<Employee1> iterator = emp1.iterator();
        while (iterator.hasNext()) {
            Employee1 tempDTO = iterator.next();
            System.out.println(tempDTO.getFirstName() + " " +  tempDTO.getLastName() + "  "+tempDTO.getSalary());
        }
    }
}
