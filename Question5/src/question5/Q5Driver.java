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
 * creating driver class
 */
public class Q5Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p = new Person("Munna");
        Student s = new Student("Dileep");
        Employee e = new Employee("Bagi");
        Faculty f = new Faculty("Phani");
        Staff s1 = new Staff("Jani");
        System.out.println("Question 5 : Gunda Anu Tej");
        System.out.println(p.toString());
        System.out.println("**************************");
        System.out.println(s.toString());
        System.out.println("**************************");
        System.out.println(e.toString());
        System.out.println("**************************");
        System.out.println(f.toString());
        System.out.println("**************************");
        System.out.println(s1.toString());
        System.out.println("**************************");

    }
    
}
