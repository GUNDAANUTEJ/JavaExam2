/*/
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S542408
 */
public class CourierServiceDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CourierService dart= new CourierService();
         DtdcCompany dtdc = new DtdcCompany();
         dart.travel();
         dtdc.travel();
    }
    
}
