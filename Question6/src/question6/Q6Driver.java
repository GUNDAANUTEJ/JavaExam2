/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.util.Scanner;

/**
 *
 * @author Gunda Sai Naga Anu Teja
 */
public class Q6Driver {

    /**2
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Question 6 : Gunda Sai Naga Anu Teja");
        System.out.print("Enter the side1: ");
        double side1 = scan.nextDouble();
        System.out.print("Enter the side2: ");
        double side2 = scan.nextDouble();
        System.out.print("Enter the side3: ");
        double side3 = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter the color: ");
        String strcolor = scan.nextLine();
        System.out.print("Is the triangle having three sides and a color? " + " (True or False): ");
        boolean yes = scan.nextBoolean();
        Triangle T = new Triangle(yes, strcolor, side1, side2, side3);
        System.out.println(T.toString());
    }
}