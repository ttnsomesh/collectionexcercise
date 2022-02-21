package com.collectionexcercise;
/*
Given the following class
Employee class{ Double Age; Double Salary; String Name}
Design the class in such a way that the default sorting should work on firstname and lastname.
Also, Write a program to sort Employee objects based on salary using Comparator.

 */

import java.util.*;

class Employee{
    private int age;
    private double salary;
    private String firstName;
    private String lastName;

    public Employee(int age , double salary , String firstName , String lastName){
        this.age = age;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public double getAge() {
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
        return lastName + ", " + firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (! (o instanceof Employee)) return false;
        Employee p = (Employee) o;
        return firstName.equals(p.firstName) && lastName.equals(p.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

}

class FirstnameSort implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getLastName().compareTo(o2.getFirstName());
    }
}

class SalarySort implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getSalary() > o2.getSalary()){
            return 1;
        }else if(o1.getSalary() < o2.getSalary()){
            return -1;
        }else{
            return 0;
        }
    }
}
public class Question2 {
    public static void main(String[] args) {
        Employee e1 = new Employee(23 , 20000.0 , "somesh" , "kumar");
        Employee e2 = new Employee(45 , 30000.0 , "pawandeep" , "singh");
        Employee e3 = new Employee(21 , 25000.0 , "tushar" , "palit");
        Employee e4 = new Employee(34 , 27000.0 , "rohit" , "sharma");
        Employee e5 = new Employee(22 , 40000.0 , "ishan" , "kishan");
        Employee e6 = new Employee(33 , 50000.0 , "virat" , "kohli");

        List<Employee> emp = Arrays.asList(e1 , e2 , e3 , e4 , e5 , e6);

        Collections.sort(emp , new FirstnameSort());

        Iterator<Employee> iterator = emp.iterator();
        while (iterator.hasNext()) {
            Employee tempDTO = iterator.next();
            System.out.println(tempDTO.getFirstName() + " " +  tempDTO.getLastName());
        }

        Collections.sort(emp , new SalarySort());
        System.out.println("-----------------------------");
        Iterator<Employee> iterator1 = emp.iterator();
        while (iterator1.hasNext()) {
            Employee tempDTO = iterator1.next();
            System.out.println(tempDTO.getFirstName() + " " +  tempDTO.getSalary());
        }

    }
}
