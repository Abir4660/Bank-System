/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeesalary;

/**
 *
 * @author User
 */
public class Employeesalary {


    public static void main(String[] args) {
        // Create two Employee objects
        Employee employee1 = new Employee("John", "Doe", 5000);
        Employee employee2 = new Employee("Jane", "Smith", 6000);

        // Display each object's yearly salary
        System.out.println("Yearly Salary for Employee 1: " + employee1.calculateYearlySalary());
        System.out.println("Yearly Salary for Employee 2: " + employee2.calculateYearlySalary());

        // Give each Employee a 10% raise
        employee1.giveRaise();
        employee2.giveRaise();

        // Display each Employee's yearly salary again
        System.out.println("\nAfter 10% Raise:");
        System.out.println("Yearly Salary for Employee 1: " + employee1.calculateYearlySalary());
        System.out.println("Yearly Salary for Employee 2: " + employee2.calculateYearlySalary());

        // Create an array of 10 Employee objects
        Employee[] employees = new Employee[10];

        // Initialize each Employee in the array
        for (int i = 0; i < 10; i++) {
            employees[i] = new Employee("Employee", String.valueOf(i + 1), 5000 + i * 100);
        }

        // Display the Employee objects in the array
        System.out.println("\nArray of 10 Employee Objects:");
        for (Employee employee : employees) {
            System.out.println("Yearly Salary for " + employee.getFirstName() + " " +
                    employee.getLastName() + ": " + employee.calculateYearlySalary());}
    }
}
    
    
    
    /*   public static void main(String[] args) {
       Employee e1=new Employee("Rakib","hasan",566);
      Employee e2=new Employee("alif","hossain",577);
    e1.calculateYearlySalary();
    e2.calculateYearlySalary();
    e1.giveRaise();
    e2.giveRaise();
    Employee[] employees=new Employee[10];
    for(int i=0;i<10;i++){
    employees[i]=new Employee("Employee",String.valueOf(i+1),566+i*100);
    for(Employee  e :employees ){
    System.out.println("yearly salary for"+e.getFirstName()+" "+e.getLastName()+e.calculateYearlySalary());
         
    }
    }
    }
}*/
