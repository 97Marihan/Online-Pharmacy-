package onlinepharmacy;

import java.util.Scanner;
 public class Prescription extends Product implements java.io.Serializable {
    transient Scanner input = new Scanner(System.in);
    private String prescription;

    //default constructor 
    public Prescription(String productName, String id, double price, int quantity, int singleOrderQuantity,String category) {  
        super(productName, id, price, quantity, singleOrderQuantity,category);
        prescription = "";
    }

    //overloading constructor
    public Prescription(String prescription) {
        setPrescription(prescription);
        category = Category.PRESCRIPTIONS;
     }
    //setters
    public void setPrescription(String prescription) {
 
            this.prescription = prescription;

    }
    //getters
    public String getPrescription() {
        return prescription;
    }
}
