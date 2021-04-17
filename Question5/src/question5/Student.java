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
 * creating subclass Student in super class Person 
 */
public class Student extends Person {
  private String grade;
    private static final String status = "Graduate";

    public Student(String name) {
        super(name);
    }
    public Student(String name, String address, String phoneNumber, String emailAddress, String grade, String status) {
        super(name, address, phoneNumber, emailAddress);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Name of the Student: " + super.getName();
    }
}