package onlinepharmacy;

import java.util.*;
public class Pharmacy {
   private Scanner input = new Scanner(System.in);
   private Product newProduct = new Product(); 
   private static Hashtable<String,Product> stock = new Hashtable<>();
   private static List<Staff> staffRecords = new ArrayList<>();//All staff information gatherd in a list
   private static List<Customer> customerRecords = new ArrayList<>();//All staff information gatherd in a list
   private static List<Order> ordersList = new ArrayList<>();
   
   
   public void setStaff(List<Staff> people) {
       this.staffRecords = people;
   }
   public void setCustomer(List<Customer> customers){
       this.customerRecords = customers;
   }
   public void setProduct(Hashtable<String,Product> products){
       this.stock = products;
   }
   public void seOrders(List<Order> orders){
       if (orders != null)
           this.ordersList = orders;
   }
    //Add new Product to stock
    public void addProduct(Product newProduct) {
        stock.put(newProduct.getName(), newProduct);
       // return(stock.get(newProduct.getName()));
    }
    //Add new Sraff member to the Records
    public void addStaff(Staff newStaff){//display All staff members
        staffRecords.add(newStaff);
    }
    //Add new Customer to the Records
    public void addCustomer(Customer newCustomer){
        customerRecords.add(newCustomer);

    }
    //Display Products
    public void displayProducts() {
        int counter =1;
        System.out.println("Choose a product");
        System.out.println("___________________________");
        System.out.println("___________________________");        
        for(Map.Entry<String,Product> entry:stock.entrySet() ) {
            newProduct = entry.getValue();
            System.out.println(counter);
            System.out.println(newProduct);
            counter++;
        }
    }
    //Display Cosmetic Products
    public void displayCosmetic() {  
        int counter =1;
        System.out.println("Choose a product");
        System.out.println("___________________________");
        System.out.println("___________________________");        
        for(Map.Entry<String,Product> entry:stock.entrySet() ) {
            newProduct = entry.getValue();
            String categoryCheck = newProduct.getCategory();
            if(categoryCheck=="cosmetic"){
                System.out.println(counter);
                System.out.println(newProduct);
                counter++;
            }
        }
    }
    //Display Prescription Products
    public void displayPrescription() {
        int counter =1;
        System.out.println("Choose a product");
        System.out.println("___________________________");
        System.out.println("___________________________");        
        for(Map.Entry<String,Product> entry:stock.entrySet() ) {
            newProduct = entry.getValue();
            String categoryCheck = newProduct.getCategory();
            if(categoryCheck=="prescription"){
                System.out.println(counter);
                System.out.println(newProduct);
                counter++;
            }
        }
    }    
    //Display Drugs
    public void displayDrugs() {
        int counter =1;
        System.out.println("Choose a product");
        System.out.println("___________________________");
        System.out.println("___________________________");        
        for(Map.Entry<String,Product> entry:stock.entrySet() ) {
            newProduct = entry.getValue();
            String categoryCheck = newProduct.getCategory();
            if(categoryCheck=="drug"){
                System.out.println(counter);
                System.out.println(newProduct);
                counter++;
            }
        }
    }
    //Display staff records        
    public void displayStaff() { 
        System.out.println("Staff records"+"\n"+"-------------------------");
        for(int i=0;i<staffRecords.size();i++) {
            System.out.println(staffRecords.get(i).toString());
        }

    } 
    //Display Customer records
    public void displayCustomer() { 
        System.out.println("Customers records"+"\n"+"-------------------------");
        for(int i=0;i<customerRecords.size();i++) {
            System.out.println(customerRecords.get(i).toString());
        }
    }
    // return the product with index
    public Product getProduct(String key) {
         return stock.get(key);
     } 
    // return the product with index
    public Prescription getPrescription(String key) {
         return (Prescription)stock.get(key);
     }
    //log in process for staff members    
    public Staff logInStaff(String email,String password){
        boolean check = false;
        
        Staff user = new Staff();
        for (int i = 0; i<staffRecords.size(); i++) {
            String mailTest = staffRecords.get(i).getEmailAddress();
            String pwTest = staffRecords.get(i).getPassword();
            if(email.equals(mailTest) && password.equals(pwTest)) {
             
                check = true;
               return staffRecords.get(i);
            } 
        
        }
        return null;
    }
         

          
    
    //log in process for customer members
    public Customer loginCustomer(String mail,String pw){
        boolean check = false;
        for (int i = 0; i<customerRecords.size(); i++){
            String mailTest = customerRecords.get(i).getEmailAddress();
            String pwTest = customerRecords.get(i).getPassword();
            if(mail.equals(mailTest) && pw.equals(pwTest)) {
                check = true;
                return customerRecords.get(i);
            } 
        }
        return null;
    } 
    //Sign up process for new customer
    public Customer singUp(Customer newCustomer,Address newAddress) {
        
            System.out.println("Help us with your inforomation");
            System.out.print("First name: ");
            newCustomer.setFirstName(input.next());                 
            System.out.print("Middle name: ");
            newCustomer.setMiddleNameInit(input.next().charAt(0));
            System.out.print("last name: ");
            newCustomer.setLastName(input.next());
            System.out.print("Email address: ");
            newCustomer.setEmailAddress(input.next());
            System.out.print("Phone number: ");
            newCustomer.setPhoneNum(input.next());
            System.out.print("Password: ");
            newCustomer.setPassword(input.next());
            System.out.print("Street name: ");
            newAddress.setStreetName(input.next());
            System.out.print("Building number: ");
            newAddress.setApartmentNum(input.nextInt());
            System.out.println("Area: ");
            newAddress.setArea(input.next());
            System.out.println("Appartment number: ");
            newAddress.setApartmentNum(input.nextInt());
            newCustomer.setAddress(newAddress);
            addCustomer(newCustomer);
            System.out.println("You are now registered");
            System.out.println("Welcome "+ newCustomer.getFirstName() );
            System.out.println("____________________________________________");
            return newCustomer;
    }
    //Search for certain product in the stock
    public String SearchProduct(String key) {
       if( stock.containsKey(key))
           return("The Product exists");
       else
           return("This Product does not exist");
    }
    //Print a report for admistrartive staff member
    public void addQuantity() {
        int counter =1;
        System.out.println("Report");
        System.out.println("_______");
        for(Map.Entry<String,Product> entry:stock.entrySet() ) {
            newProduct = entry.getValue();
            String categoryCheck = newProduct.getCategory();
            if(newProduct.getQuantity()<10){
                System.out.println(counter);
                System.out.println(newProduct);
                counter++;
            }
        System.out.print("Select Product name: ");
        String name =input.next();
        Product item = stock.get(name);
        System.out.print("Select add on quantity: ");
        int addOn = input.nextInt();
        addOn+= item.getQuantity();
        item.setQuantity(addOn);
        }
        

    }
    public void addToOrder(Order o){
        this.ordersList.add(o);
    }			
    public List<Staff> getStaffRecords() {
        return this.staffRecords;
    }
    public List<Customer> getCustomerRecords(){
        return this.customerRecords;
    }
    public List<Order> getOrdersRecords(){
        return this.ordersList;
    }
   public Hashtable<String,Product> getProductRecords(){
       return this.stock;
   }
}
