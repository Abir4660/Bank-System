/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeesalary;

/**
 *
 * @author User
 */
public class Employee {
    
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor to initialize the instance variables
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Check if monthly salary is positive before setting its value
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    // Getter and setter methods for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and setter methods for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and setter methods for monthlySalary
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        // Check if monthly salary is positive before setting its value
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    // Method to calculate and return the yearly salary
    public double calculateYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to give a 10% raise to the monthly salary
    public void giveRaise() {
        monthlySalary *= 1.10;
    }
}


