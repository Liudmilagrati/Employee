/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

import java.util.Scanner;

/*
    Programmer: Liudmila Grati 
    CA2: Programming - Object Oriented Approach
 */

public class Manager extends Employee {
    
    //declaring variables username and password
    private String username;
    private String password;
    
    // Constructor 
    public Manager(String name, String email, String username, String password) {
        super(name, email);
        this.username = username;
        this.password = password;
    }
    
    // Getters and Setters methods for username and password
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

