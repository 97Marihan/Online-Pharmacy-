package onlinepharmacy;
import java.util.Scanner;

public class Product implements java.io.Serializable{
    transient Scanner input = new Scanner(System.in);
    protected String name;
    protected String productCode;
    protected double price;
    protected int quantity;
    protected int singleOrderQuantity;

    protected enum Category {
        COSMETICS, DRUGS, PRESCRIPTIONS
    }
    protected Category category;

    //default constructor
    public Product() {
        this.name = "";
        this.productCode = "";
        this.price = 0.0;
        this.quantity = 0;
        this.singleOrderQuantity = 1;
        this.category =Category.DRUGS;
    }
    
    //overloading consructor
    public Product(String productName, String id, double price, int quantity, int singleOrderQuantity,String category) {
        this.name = productName;
        this.productCode = id;
        setPrice(price);//avoid  errors
        setQuantity(quantity);//avoid errors
        this.singleOrderQuantity = singleOrderQuantity;    
        setCategory(category);
        
    }
    
    //Mutators functions for each of prduct name, quantity, ssn and price variable to assign values for each one of them
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.productCode = id;
    }
    public void setPrice(Double price) {

            this.price = price;
    }
    public void setSingleOrderQuantity(int singleOrderQuantity) {
        this.singleOrderQuantity = singleOrderQuantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setCategory(String category) {
        if (category == "Cosmetics" || category == "COSMETICS" || category == "cosmetics")
            this.category = Category.COSMETICS;
        else if (category == "Drugs" || category == "DRUGS" || category == "drugs")
            this.category = Category.DRUGS;
        else if (category == "Prescriptions" || category == "PRESCRIPTIONS" || category == "prescriptions")
            this.category = Category.PRESCRIPTIONS;
        else System.out.println("Invalid Category Entry!");
    }
    //Accessors functions
    public String getName() {
        return this.name;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int getSingleOrderQuantity() {
        return this.singleOrderQuantity;
    }

    public String getCategory() {

        if (category.equals(Category.COSMETICS))
            return "cosmetic";
        else if(category.equals(Category.PRESCRIPTIONS))
            return "prescription";
        else
            return "drug";
    }
    
      @Override
    public String toString() {
        return "ID : " + productCode+"\nProduct : " + name  + "\nPrice : " + price + "\nQuantity : " + quantity +"\nCategory: "+category+"\n________________________________";
    }  
}
