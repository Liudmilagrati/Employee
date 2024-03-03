/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

import java.util.ArrayList;

/*
    Programmer: Liudmila Grati 
    CA2: Programming - Object Oriented Approach
 */

// Part 2: Create a Company class that stores information about employees
public class Company {
    
    // Create the field companyName for the name of the company 
    private String companyName;
    
    //Create an ArrayList, called staff, to hold a list of employee objects, whose class is described in Question 1 above.
    private ArrayList<Employee> staff;
    
    //Write the default constructor for this class which initialises all fields.
     public Company() {
        this.companyName = "Default Company";
        this.staff = new ArrayList<>();
    }
     
     //Write an overloaded constructor which accepts a name value as a parameter.
     public Company(String companyName) {
        this.companyName = companyName;
        this.staff = new ArrayList<>();
    }
    
}
