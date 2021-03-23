package onlinepharmacy;
import java.util.ArrayList;
import java.util.Scanner;
public class Adminstrative extends Staff {
    //Define the  role of the adminstrative 
    private enum Role {
        MANAGING,REPORTING
    }
    Role role;
    transient Scanner input = new Scanner(System.in);
    
    //overloading constructor
    public Adminstrative(String role) {
        setRole(role);
        
    } 
    ArrayList<Order> report = new ArrayList<Order>();
    
    //Setters
    public void setRole(String role)
    {
        if (role == "managing" || role == "MANAGING" || role == "Managing")
            this.role = Role.MANAGING;
        else if (role == "reporting" || role == "REPORTING" || role == "Reporting")
            this.role = Role.REPORTING;
        else {
            System.out.println("Error Enter a valide role (Managing/Reporting");
            setRole(input.next());
        }
    }
    //getters
    public String getRole() {
        if(role.equals(Role.MANAGING))
            return "managing";
        else 
            return "reporting";
    }
            
    
    //Add order
    public void addOrder(Order order) {
        this.report.add(order);
    }
    //Display Report
    public void displayOrder() {
        int startPoint=0;
        for(int i = 0; i < this.report.size(); i++) {
            for(int j = startPoint; j <report.get(i).getOrders().size();j++ ){
                System.out.println(j+1);
                System.out.println("Name: "+report.get(i).getOrders().get(j).getName());
                System.out.println("Price: "+report.get(i).getOrders().get(j).getPrice());
                System.out.println("Count: "+report.get(i).getOrders().get(j).getSingleOrderQuantity());
                System.out.println("-------------------------------------------------");    
                System.out.println(report.get(i).getOrders().get(j).getSingleOrderQuantity() * report.get(i).getOrders().get(j).getPrice());
                startPoint = j;
            }
            System.out.println("Price:");
            System.out.println("Date: " + this.report.get(i).getDate());
            System.out.println("Status: "+this.report.get(i).getStatus());
            
        }
    }
    //Approving orders made by costumer
    public void acceptORders(Order order){
        order.setStatus("approved");
    }

}


















