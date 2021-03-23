package onlinepharmacy;
import files.AbstractFileReader;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Order implements java.io.Serializable {
    
    
    
    
    transient Scanner scanner = new Scanner(System.in);
    private ArrayList<Product> tempproducts = new ArrayList<Product>();//a temperory list that holds the recpit's info and gets cleared each time a the customer make a new oeder
    private ArrayList<Product> ordersList = new ArrayList<Product>();
    private double totalPrice;
    private String date;
    private Customer customer = new Customer();
    private enum Status {
        PENDING, APPROVED, DELIVERED
    }
    
    private Status status; //Status is a enum which determinate the status of the order wheater it is pending or delivered or aprroved
    //default constructor
    public Order() {
       
        this.totalPrice = 0.0;
        this.date = "";
        this.status = Status.PENDING;
        
    }
    //overloading constructor
    public Order(ArrayList<Product> products, double totalPrice, String date, Status status) {
        this.tempproducts = products;
        this.totalPrice = totalPrice;
        this.date = date;
        this.status = status;
    }
    // add product to product list
    public void addProduct(Product product) {
        tempproducts.add(product);
        ordersList.add(product);
    }
   
    //getters
    public String getDate() {
        return date;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public Status getStatus() {
        return status;
    }
    public ArrayList<Product> getTempproducts() {
        return tempproducts;
    }
    public ArrayList<Product> getOrders(){
        return ordersList;
    }
    
    //setters
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void setStatus(String status) {
        if (status == "Pending" || status == "pending" || status == "p" || status == "P" || status == "PENDING" )
            this.status = Status.PENDING;
        else if (status == "Approved" || status == "approved" || status == "a" || status == "A" || status == "APPROVED")
            this.status = Status.APPROVED;
        else if (status == "Dilevered" || status == "delivered" || status == "d" || status == "D" || status == "DILEVERED")
            this.status = Status.DELIVERED;
    }
    public String displayrecepit() {
        totalPrice = 0;
        String info ="";
        for (int i = 0; i < this.tempproducts.size(); i++) {
            
      
        
        if (tempproducts.get(i).getCategory() == "drug" || tempproducts.get(i).getCategory() == "Prescreption") {
            if (tempproducts.get(i).getQuantity()<10 && tempproducts.get(i). getSingleOrderQuantity() > 2)
            {
               
                JOptionPane.showMessageDialog(null,"Error you can't select more thean to units","Inane error",JOptionPane.ERROR_MESSAGE);
                break;
                 
            }
       }
            
            String name = ("Name : " + this.tempproducts.get(i).getName()+"\n");
            String price= (" Price : " + this.tempproducts.get(i).getPrice()+"\n");
            String q =(" Quantity : " + this.tempproducts.get(i).getSingleOrderQuantity()+"\n");             
            this.tempproducts.get(i).setQuantity(this.tempproducts.get(i).getQuantity() - this.tempproducts.get(i).getSingleOrderQuantity());

            totalPrice += this.tempproducts.get(i).getSingleOrderQuantity() * tempproducts.get(i).getPrice();
            
            info+=(name+price+q);
        }
            String t = (" Total price : "+totalPrice);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDate localDate = LocalDate.now();
            String d = (" Date:"+dtf.format(localDate));
            String recipt = info +"\n" +"-----------------------------------" +"\n"+t +"\n"+d +"\n" ;
        this.tempproducts.clear();
        AbstractFileReader reader = new AbstractFileReader();
        Pharmacy pharmacy = new Pharmacy();
        reader.saveStock(pharmacy.getProductRecords());
        return recipt;
      
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.toString();
    }
}