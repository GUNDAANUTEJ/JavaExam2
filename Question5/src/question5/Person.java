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
 *  Creating person class
 */
public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person(String name, String address, String phoneNumber,
            String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name Of the Person: " + name;
    }
    
}
