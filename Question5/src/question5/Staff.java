/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Gunda Sai Naga Anu Teja
 */
/**
 *
 * creating subclass Staff within super class Employee
 */
public class Staff extends Employee {

    private String title;
    
    public Staff(String name) {
        super(name);
    }
    public Staff(String name, String title) {
        super(name);
        this.title = title;
    }
    public String toString() {
        return "Name of the Staff: " + super.getName();
    }

}
