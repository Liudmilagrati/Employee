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
    
    //1st constrcutot that initialises the name and email instance fiorleds witf defauls values
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
    


 
    }
    

