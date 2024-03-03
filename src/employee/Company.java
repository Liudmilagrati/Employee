/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

import java.util.ArrayList;
import java.util.Iterator;

/*
    Programmer: Liudmila Grati 
    CA2: Programming - Object Oriented Approach
 */

// Part 2: Create a Company class that stores information about employees
public class Company {
    
    // Create the field companyName for the name of the company 
    private String companyName;
    
    //Create an ArrayList, called staff, to hold a list of employee objects, whose class is described in Question 1 above.
    private static ArrayList<Employee> staff;
    
    //Write the default constructor for this class which initialises all fields.
     public Company() {
        this.companyName = "Gnomes LTD Company";
        this.staff = new ArrayList<>();
    }
     
     //Write an overloaded constructor which accepts a name value as a parameter.
     public Company(String companyName) {
        this.companyName = companyName;
        this.staff = new ArrayList<>();
    }
     
     //Complete the implementation by writing the code for the following methods only: 

    //1. addNewStaff() adds a new employee to the staff arrayList (the employee is a parameter). 
     public static void addNewStaff(Employee employee) {
        staff.add(employee);
    }
     
    //2. getStaffNumber() returns the number of employees currently in the arrayList.
     public int getStaffNumber() {
        return staff.size();
    }
     
     //3. listEmployees() uses an iterator object to find in the arrayList all employees above a given employee number value
     //   (this value is a parameter for this method) and prints the names of these employees. 
       public void listEmployees(int value) {
        Iterator<Employee> iterator = staff.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEmpNum() > value) {
                System.out.println("Employee Name: " + employee.getName());
            }
        }           
    }
       //Merhod to display all the employees details 
       public static void displayEmployeeDetails() {
        System.out.println("Employee details for " + "Gnomes LTD" + ":");
        for (Employee employee : staff) {
            displayEmployeeDetails(employee);
        }
    }

    public static void displayEmployeeDetails(Employee employee) {
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Email: " + employee.getEmail());
        System.out.println("Employee EmpNum: " + employee.getEmpNum());
        System.out.println();
    }
    
    // Remove an employee based on empNum
    public static void removeStaff(int empNum) {
        Iterator<Employee> iterator = staff.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEmpNum() == empNum) {
                iterator.remove();
                System.out.println("Employee with empNum " + empNum + " removed successfully.");
                return;
            }
        }
        System.out.println("Employee with empNum " + empNum + " not found.");
    } 
    
        //Bonus challenge:
        //Create a HashSet called staffSet that will not allow two employees with the same empNum to be elements
        // HashSet<Employee> staffSet = new HashSet<>();
        //  public void addNewStaff(Employee employee) {
        //     if (staffSet.add(employee)) {
        //        staff.add(employee);
        //   } else {
        //       System.out.println("Employee with empNum " + employee.getEmpNum() + " already exists.");
        //   }
        //  }
}
