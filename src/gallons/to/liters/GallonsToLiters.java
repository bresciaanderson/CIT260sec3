/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gallons.to.liters;

/**
 *
 * @author hyrumandbrescia
 */
public class GallonsToLiters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gallons;
	double liters;
		
        gallons = 10;
	liters = gallons * 3.7854;
		
        System.out.println(gallons + " gallons is " + liters + " liters.");
	}
}