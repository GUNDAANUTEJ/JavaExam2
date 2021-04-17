/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

import java.util.Date;

/**
 *
 * @author Gunda Sai Naga Anu Teja
 */
/**
 *
 * creating subclass Employee in super class Person
 */
public class Employee extends Person {
    private String office;
    private String salary;
    private Date dateHired;

    public Employee(String name) {
        super(name);
    }

    public Employee(String name, String address, String phoneNumber,String emailAddress, String office, String salary, Date dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Name of the Employee: " + super.getName();
    }
}

