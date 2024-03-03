/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;

/** Programmer: Liudmila Grati 
 * CA2: 
 * 
 */
public class Employee {

    /** Part 1:	Write the complete class, Employee, which has the following fields and methods:
    Instance fields:
    name, of type String
    email, of type String
    empNum, of type int
     */
    
     // Instance fields
    private String name;
    private String email;
    private int empNum;
    
    /* Static field: nextEmpNum, of type int and initialized to 1, which initialises 
    empNum in the constructor.  Its value must then be incremented to give consecutive 
    numbers to each newly created object. 
    */
    
    // Static field
    private static int nextEmpNum = 1;
    
    /*Two Constructors: 
	- One constructor initialises the name and email instance fields with default values. 
	- The other constructor initialises these fields with values passed as parameters.
    */
    
    //1st constructor that initialises the name and email instance fields with defaults values
    public Employee() {
        this.name = "Default Name";
        this.email = "default@example.ie";
        this.empNum = nextEmpNum++;
    }
    
    //2nd constrcuctor that initialises these fields with values passed as parameters
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum++;
    }
        
    /* Methods:
    -Accessor methods to return name, email and empNum values.
    -setEmail(String email) – to set the email field to a new value passed as a parameter.  The value must not be accepted if its length is 3 or less.
    -getNextEmpNum() - to return the current value of nextEmpNum.
    */
    
    // Method to return name values
    public String getName() {
        return name;
    }
    // Method to return email values
    public String getEmail() {
        return email;
    }
    // Method to return empNum values 
    public int getEmpNum() {
        return empNum;
    }
    
    // Method to set email. Using if statement to check condition that email cannot be less then 3 characters. 
    public void setEmail(String email) {
        if (email.length() > 3) {
            this.email = email;
        } else {
            System.out.println("Invalid input. The email address must be longer than 3 characters. Please try again!");
        }
    }
    
    
    
        
        

    }

    


 
    
    

