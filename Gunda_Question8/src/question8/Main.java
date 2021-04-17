/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Gunda Sai Naga Anu Teja
 */

// Abstract class
abstract class PharmacyName {
  // Abstract method (does not have a body)
  public abstract void cvsPharmacy();

  public void Walgreens() {
    System.out.println("Walgreens");
  }
}


class Pharmacy extends PharmacyName {
  public void cvsPharmacy() {
    
    System.out.println("CVS Pharmacy");
  }
}

class Main {
  public static void main(String[] args) {
    Pharmacy pharmacy = new Pharmacy(); // 
    pharmacy.cvsPharmacy();
    pharmacy.Walgreens();
  }
}

