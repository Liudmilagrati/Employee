/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/** Programmer: Liudmila Grati 
 *  CA2: Programming - Object Oriented Approach
 */

    public class EmployeeTest {
    
    /* Part 2: Write another class, EmployeeTest, containing the main method, 
    which creates 3 Employee objects. 
    */
    
    /* *******************************************************
        GitHub link: https://github.com/Liudmilagrati/Employee/tree/main/src/employee
    **********************************************************
    */
    
    // Main Method 
    public static void main(String[] args) {
      
    //declare an array, called projectGroup, to store these 3 Employee objects and loads the array with the objects.
    Employee[] projectGroup = new Employee[3];
        
    // Create 3 Employee objects with details specified in the CA 
    projectGroup[0] = new Employee("Joe Bloggs", "jb@gmail.com");
    projectGroup[1] = new Employee("Ann Banana", "ab@gmail.com");
    projectGroup[2] = new Employee("Tom Thumb", "tt@gmail.com");
    
    //Print out the value of variable nextEmpNum to the terminal window
    System.out.println("The value of the Next Employee Number is: " + Employee.getNextEmpNum());
     
    /* Write the code to search and display the name of each of the employees in the projectGroup array, 
    who have an employee number above the value stored in a variable called m.
    */
    int m = 1; // Example value for variable 'm'
        for (Employee employee : projectGroup) {
            if (employee.getEmpNum() > m) {
                System.out.println("Employee Name: " + employee.getName());
            }
        } 
        
        //Code Run the Manager Consiole Menu 
        Manager_Console_Menu.getWelcomeMenu();       
        Manager_Console_Menu.login();
    }  
}



    

