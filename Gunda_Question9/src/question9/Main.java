/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author Gunda Sai Naga Anu Teja
 */


interface PharmacyName {
  public void cvsPahrmacy();
  public void walgreens();
}

class Pharmacy implements PharmacyName {
  public void cvsPahrmacy() {
    System.out.println("CVS Pharmacy");
  }
  public void walgreens() {
    System.out.println("Walgreens Pharmacy");
  }
}

class Main {
  public static void main(String[] args) {
    Pharmacy pharmacy = new Pharmacy();
    pharmacy.cvsPahrmacy();
    pharmacy.walgreens();
  }
}
