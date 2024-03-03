/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

import java.util.Scanner;

    /* Create a Netbean-console menu system for the manager to log in 
       and view current staff and add new staff. (username – “Gnomeo”; Password – “smurf”)
    */ 
  
public class Manager_Console_Menu {
    
    private static final String Manager_Username = "Gnomeo";
    private static final String Manager_Password = "smurf";
    
     /**
     * Outputs the welcome menu for the manager to the terminal 
     */
    public static void getWelcomeMenu() {
        System.out.println("");
        System.out.println(" ******* WELCOME TO GNOMES LTD*************");
        System.out.println("");
        System.out.println("          Employee Management System");
        System.out.println("");
        System.out.println("         Please login to if you wish to continue");
        System.out.println("-------------------------------------------");
    }
    
    //Login method to promt the user to enter login and password and to make a selection 
    public static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String inputUsername = scanner.nextLine();
        System.out.println("Enter password:");
        String inputPassword = scanner.nextLine();

        if (inputUsername.equals("Gnomeo") && inputPassword.equals("smurf")) {
            System.out.println("Login Successful!");
            
        System.out.println("");
        System.out.println("------------------------------------------------");
        System.out.println("___Please Select One of the following Options:___\n");
        System.out.println("        (1) List Employees");
        System.out.println("        (2) Add a New Employee");
        System.out.println("        (3) Remove an Employee");
        System.out.println("_______________________________________________\n");
        System.out.println (""); 
         
        String inputSelection = scanner.nextLine();
        
        if (inputSelection.equals("1")) {
            System.out.println("Current Available Staff:");
            Company.displayEmployeeDetails();               
            }
      
        else if (inputSelection.equals("2")) {
            System.out.println("Enter new employee details:");
            System.out.println("Name:");
            String name = scanner.nextLine();
            System.out.println("Email:");
            String email = scanner.nextLine();
            Company.addNewStaff(new Employee(name, email));
            System.out.println("New employee added successfully.");
        }
        else if (inputSelection.equals("3")) {
            Company.removeStaff(1);
        }
        else {
            System.out.println("Wrong username or password. Try again!");
        }
    }
}
    
  
    
}
