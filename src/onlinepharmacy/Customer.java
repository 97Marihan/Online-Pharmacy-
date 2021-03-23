package onlinepharmacy;

import java.util.*;
public class Customer extends User implements java.io.Serializable{
    transient Scanner input = new Scanner(System.in);
    public List <Order> previousOrders;
    private PaymentMethod paymentMethod;
    private enum PaymentMethodChoice {
        CASHONDELIVERY,CREDITCARD
    }
    private PaymentMethodChoice paymentMethodChoice;
    
    public Customer() {
        this.previousOrders = new ArrayList<Order>();
        paymentMethod = null;
        paymentMethodChoice = PaymentMethodChoice.CASHONDELIVERY;
    }
    //Add the orders to made by user to his history 
    public void addPreviousOrder(Order previousOrder) {
        this.previousOrders.add(previousOrder);
    }
    //dislay orders made by this customer
    public void displayPreviousOrders() {
        
        if(previousOrders.isEmpty())
            System.out.println("History is Empty");
        System.out.println("Previous Orders: ");
        System.out.println("______________________________");
        int startPoint = 0;
        for(int i = startPoint ; i< previousOrders.size(); i++) {    
            for(int j = startPoint; j <previousOrders.get(i).getOrders().size();j++ )
            {
                System.out.println(j+1);
                System.out.println("Name: "+previousOrders.get(i).getOrders().get(j).getName());
                System.out.println("Price: "+previousOrders.get(i).getOrders().get(j).getPrice());
                System.out.println("Count: "+previousOrders.get(i).getOrders().get(j).getSingleOrderQuantity());
                System.out.println(previousOrders.get(i).getOrders().get(j).getSingleOrderQuantity() * previousOrders.get(i).getOrders().get(j).getPrice());
                System.out.println("-------------------------------------------------");    
                System.out.println("Date: "+previousOrders.get(i).getDate());
                System.out.println("Status: "+previousOrders.get(i).getStatus());
             
                startPoint = j;
            }
            System.out.println("____________________________________________________");        
        }
        
    }
    // clear the history of products for the customer
    public void clearHistory() {
        System.out.println("Are you sure you want to clear history you will not be able to retieve them !" + "\n" + "Please select Yes or No");
        String choice = input.next();
        if (choice.equals("NO")|| choice.equals("no")  || choice.equals("N")|| choice.equals("n")) {
            System.out.println("ok");        }
        else if (choice.equals("YEs")|| choice.equals("yes")  || choice.equals("y")|| choice.equals("Y")) {
                    previousOrders.clear();
                    System.out.println("History is Empty!");
                    }
        else
            clearHistory();
        }
    public void setCreditCard(boolean isCreditCard) {
        if (isCreditCard) {
            paymentMethod = new PaymentMethod();
        }
    }
    
    public void setCreditCard(String cardNumber, String cvv, String expDate) {
        paymentMethod.setCardNumber(cardNumber);
        paymentMethod.setCvv(cvv);
        paymentMethod.setExpDate(expDate);
    }
        public String getCreditCard() {
        return paymentMethod.getCardType();
    }
}
