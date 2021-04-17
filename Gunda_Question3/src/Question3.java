
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gunda Sai Naga Anu Teja
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Object> arr_list = new ArrayList<Object>();
        arr_list.add(new Loan(100000.25,"Guntur"));  
        arr_list.add(new Date());  
        arr_list.add(new String("Anu Teja")); 
        arr_list.add(new Circle(500)); 
        System.out.println("Question 3 : Gunda Sai Naga Anu Teja");

        for (int i = 0; i < arr_list.size(); i++) {
        System.out.println((arr_list.get(i)).toString());
        }
     }
  }
         class Circle{
         double area;
         Circle(double a){
         this.area=a;
         }
         @Override
         public String toString(){
            return "Circle with Area: "+this.area;
         }
     }
         class Loan{
         double amount;
         String bankBranch;

    public Loan(double amount, String bankBranch) {
        this.amount = amount;
        this.bankBranch = bankBranch;
    }

    @Override
    public String toString() {
        return "Loan{" + "amount=" + amount + ", bankBranch=" + bankBranch + '}';
    }
         
     }
       
         
 
