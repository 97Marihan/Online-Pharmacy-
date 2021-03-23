package onlinepharmacy;
import files.AbstractFileReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class OnlinePharmacy {
    
    public static void main(String[] args) {//this main Class can be used to Write Backup data to files the phase one content are commented
        Scanner input = new Scanner(System.in);
        Pharmacy pharmacy = new Pharmacy();
        Order order = new Order();
        Customer newCustomer;
        Address newAddress;
        Staff newStaff;
//        newCustomer = new Customer();
//        newCustomer.setFirstName("Mariam");
//        newCustomer.setMiddleNameInit('M');
//        newCustomer.setLastName("Elnossair");
//        newCustomer.setEmailAddress("Mariam@gmail.net");
//        newCustomer.setPassword("mariam12!");
//        newCustomer.setPhoneNum("01111555954");
//        newCustomer.setAge(10);
//        //Address information
//        AbstractFileReader reader = new AbstractFileReader();
//        newAddress = new Address("Nozha",20,"sheraton",3);
//        newCustomer.setAddress(newAddress);
//        pharmacy.addCustomer(newCustomer);
//        
//       
//        Product newItem = new Prescription ("Lisinopril","158",70.00,19,1,"prescriptions");
//        pharmacy.addProduct (newItem);
//        
//        newItem = new Prescription ("Hydrocodone","218",90.00,29,1,"prescriptions");
//        pharmacy.addProduct (newItem);
//        
//        newItem = new Prescription ("Amoxicillin","298",60.00,13,1,"prescriptions");
//        pharmacy.addProduct (newItem);
//        
//        newItem = new Prescription ("Acarbose","221",50.00,53,1,"prescriptions");
//        pharmacy.addProduct (newItem);
//        
//        newItem = new Prescription ("Acebutolol ","232",70.00,26,1,"prescriptions");
//        pharmacy.addProduct (newItem);  
//        
//        newItem = new Prescription ("Aceon","100",82.00,46,1,"prescriptions");
//        pharmacy.addProduct (newItem);  
//
//        //drugs items
//        newItem = new Drug("Panadol","123",40.00,6,1,"drugs");
//        pharmacy.addProduct(newItem);
//        
//        newItem = new Drug("Clearest","111",20.00,24,1,"drugs");
//        pharmacy.addProduct(newItem);
//        
//        newItem = new Drug("voltaren","145",35.50,59,1,"drugs");
//        pharmacy.addProduct(newItem);
//        
//        newItem = new Drug("Antinal","122",14.00,39,1,"drugs");
//        pharmacy.addProduct(newItem);
//        
//        newItem = new Drug("Brufen","192",21.00,32,1,"drugs");
//        pharmacy.addProduct(newItem);
//        
//        newItem = new Drug ("septrin","176",23.0,42,1,"drugs");
//        pharmacy.addProduct(newItem);
//        
//        //Cosmetic item
//        newItem = new Cosmetic ("Nevia","115",30.00,34,1,"cosmetics");
//        pharmacy.addProduct (newItem);
//        
//        newItem = new Cosmetic ("Tooth brush","121",10.00,64,1,"cosmetics");
//        pharmacy.addProduct (newItem);
//                
//        newItem = new Cosmetic ("Dove","151",40.00,32,1,"cosmetics");
//        pharmacy.addProduct (newItem);
//        
//        newItem = new Cosmetic ("Bioderma","191",70.00,22,1,"cosmetics");
//        pharmacy.addProduct (newItem);
//        
//        newItem = new Cosmetic ("Clear","188",50.00,22,1,"cosmetics");
//        pharmacy.addProduct (newItem);
//        
//        newItem = new Cosmetic ("Sunsilk","191",39.00,7,1,"cosmetics");
//        pharmacy.addProduct (newItem);
//       
//        newStaff = new Staff();
//        newStaff.setFirstName("Abdelrahman");
//        newStaff.setMiddleNameInit('E');
//        newStaff.setLastName("Arabi");
//        newStaff.setEmailAddress("Abdoo12z@yahoo.com");
//        newStaff.setPhoneNum("01009948470");
//        newStaff.setPassword("abdo123!");
//        newStaff.setShift("day");
//        newStaff.setPosition("delivery");
//        //Addres info
//        newAddress = new Address("Algeish",4,"Eldaher",2);
//        newStaff.setAddress(newAddress);
//        pharmacy.addStaff(newStaff);
   
        // second staff member
//        Adminstrative newReporter = new Adminstrative("reporting");
//        newStaff.setFirstName("Omar");
//        newStaff.setMiddleNameInit('Y');
//        newStaff.setLastName("Salah");
//        newStaff.setEmailAddress("omaryassersalah@outlook.com");
//        newStaff.setPhoneNum("01019442200");
//        newStaff.setPassword("helloWo!");
//        newStaff.setShift("day");
//        newStaff.setPosition("administrative");
//         AbstractFileReader reader2 = new AbstractFileReader();
//         reader2.saveCustomer(pharmacy.getCustomerRecords());
//         reader2.saveOrders(pharmacy.getOrdersRecords());
//         reader2.saveStock(pharmacy.getProductRecords());
//         reader2.savePeople(pharmacy.getStaffRecords());
//        // adress info
//        newAddress = new Address("Yasmeen 2", 5 , "Tagamo3", 264);
//        newStaff.setAddress(newAddress);
//        pharmacy.addStaff(newReporter);
//        
//        //third staff member
//        newStaff = new Staff();
//        newStaff.setFirstName("Nada");
//        newStaff.setMiddleNameInit('K');
//        newStaff.setLastName("Salah");
//        newStaff.setEmailAddress("Nadas@gmail.com");
//        newStaff.setPhoneNum("01099821014");
//        newStaff.setPassword("helloWo!");
//        newStaff.setShift("night");
//        newStaff.setPosition("administrative");
//        // adress info
//        newAddress = new Address("share3", 23 , "Matareya", 14);
//        newStaff.setAddress(newAddress);
//        pharmacy.addStaff(newStaff);
//        
//        
//        //Forth staff member
//        Adminstrative newManger = new Adminstrative("managing");
//       newManger.setFirstName("Ibrahim");
//       newManger.setMiddleNameInit('M');
//       newManger.setLastName("Ali");
//       newManger.setEmailAddress("IbraAli@yahoo.com");
//       newManger.setPhoneNum("01009948488");
//       newManger.setPassword("ibra123!");
//       newManger.setShift("night");
//       newManger.setPosition("administrative");
//        //Addres info
//        newAddress = new Address("Makram",25,"Nasr city",9);
//        newStaff.setAddress(newAddress);
//        pharmacy.addStaff(newManger);
////        pharmacy.displayStaff();
////        System.out.println(pharmacy.getStaffRecords().size());
//        AbstractFileReader reader = new AbstractFileReader();
//        reader.savePeople(pharmacy.getStaffRecords());
//        
//        try {
//            Thread.sleep(2000L);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(OnlinePharmacy.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        List<Staff> people = reader.getPeople();
       

//        //Interface
//        int choice = 0;
//    
//        System.out.println("Welcome Please select whether you are Customer or staff" +"\n"+ "1.For staff"+"\n"+ "2.For costumer");
//        choice = input.nextInt();
//        if (choice == 1) {
//            
//            System.out.println("Please select whether you are an Admin or delivery" +"\n"+ "1.For admin"+"\n"+ "2.delivery");  
//            int position = input.nextInt();
//            if (position == 1 ) {
//                Adminstrative admin =(Adminstrative) pharmacy.logInStaff();
//                if (admin.getRole().equals("managing"))
//                {
//                    String decision ="yes";
//                    while(decision == "yes" ||decision == "YES" || decision == "Yes") { 
//                        System.out.println("Please select an action");
//                        System.out.println("1.Display products");
//                        System.out.println("2.Add quantity to items with quantity below 10");
//                        System.out.println("3.Add Product");
//                        System.out.println("4.Exist");
//                        System.out.println("___________________________________");
//                        int adminChoice = input.nextInt();
//                        switch(adminChoice){
//                            case 1 : 
//                                pharmacy.displayProducts();
//                            break;
//                            case 2:
//                                pharmacy.addQuantity();
//                            break;
//                            case 3:
//                                  System.out.print("Please enter Product name: ");
//                                  String name = input.next();
//                                  System.out.print("please enter Product ID: ");
//                                  String id = input.next();
//                                  System.out.print("please enter number of items: ");
//                                  int quantity = input.nextInt();
//                                  System.out.print("please enter price of product");
//                                  double price = input.nextDouble();
//                                  System.out.print("please enter the Category (cosmetic/prescreption/drug: ");
//                                  String category = input.next();
//                                        
//                                  Product newProduct;
//                                  if (category == "Cosmetic")
//                                  {
//                                      newProduct = new Cosmetic(name,id,price,quantity,1,category);
//                                  }
//                                  else if (category == "drug")
//                                  {
//                                      newProduct = new Drug(name,id,price,quantity,1,category);
//                                  }
//                                  else 
//                                  {
//                                      newProduct = new Prescription(name,id,price,quantity,1,category);
//                                  }
//                                   
//                        {
//                            try {
//                                ObjectOutputStream StockOos = new ObjectOutputStream( new FileOutputStream("Stock.txt"));
//                                StockOos.writeObject(pharmacy.getProductRecords());
//                            }
//                            catch(FileNotFoundException e){
//                                e.printStackTrace();
//                            }
//                            catch (IOException ex) {
//                                Logger.getLogger(OnlinePharmacy.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                            
//                        }          
//                            case 4:
//                                decision = "no";
//                            break;
//                        }
//                    }
//                        
//                }
//                else {                   
//                    String decision ="yes";
//                    while(decision == "yes" ||decision == "YES" || decision == "Yes") { 
//                        System.out.println("Please select an action");
//                        System.out.println("1.Display products");
//                        System.out.println("2.view orders");
//
//                        System.out.println("3.Exist");
//                        System.out.println("___________________________________");
//                        int adminChoice = input.nextInt();
//                        switch(adminChoice){
//                            case 1 : 
//                                pharmacy.displayProducts();
//                            break;
//                            case 2:
//                                newReporter.displayOrder();
//                            break;
//                            case 3:
//                                decision = "no";
//                            break;
//                        }
//                    }
//                }
//            }
//            else {     
//                String decision ="yes";
//                while(decision == "yes" ||decision == "YES" || decision == "Yes") {
//                    System.out.println("1.Display products");
//                    System.out.println("2.view orders");
//                    System.out.println("3.View customers data");
//                    System.out.println("4.Exist");
//                    System.out.println("___________________________________");
//                    int adminChoice = input.nextInt();
//                    switch(adminChoice){
//                        case 1 : 
//                            pharmacy.displayProducts();
//                        break;
//                        case 2:
//                            newReporter.displayOrder();
//                        break;
//                        case 3:
//                            pharmacy.displayCustomer();
//                        break;
//                        case 4:
//                            decision = "no";
//                    }
//                }
//            }
//        }
//       else if (choice == 2) {
//            System.out.print("Please enter (yes) if you are register to our pharmacy and (no) if you want to create a new account: ");
//            String check  = input.next();
//            if (check.equals("YES")||check.equals("yes")||check.equals("Yes") ) 
//                pharmacy.loginCustomer();
//            else if(check.equals("NO") || check.equals("No") || check.equals("no")){
//                newCustomer = new Customer();
//                newAddress = new Address();
//                pharmacy.singUp(newCustomer, newAddress);
//                
//                try {
//                    ObjectOutputStream customerOos = new ObjectOutputStream(new FileOutputStream("Customer.txt"));
//                    customerOos.writeObject(pharmacy.getCustomerRecords());
//                }
//                catch(FileNotFoundException e){
//                    e.printStackTrace();
//                }
//                catch (IOException ex) {
//                    Logger.getLogger(OnlinePharmacy.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//            
//                String decision ="yes";
//            
//            while(decision == "yes" ||decision == "YES" || decision == "Yes") { 
//                System.out.println("Please select an action \n1.Display products to make an order \n2.Display orders history \n3.Clear History \n4.Search for certain object \n5.Exit");
//                System.out.println("___________________________________");
//                choice = input.nextInt();
//                switch (choice) {
//                    case 1:
//                        System.out.println("Please Select Categoty \n1.All\n2.Cosmetic\n3.Prescriptions\n4.Drugs");
//                        int CategorySelect = input.nextInt();
//                        switch (CategorySelect){
//                            case 1: 
//                                pharmacy.displayProducts();
//                            break;
//                            case 2: 
//                                pharmacy.displayCosmetic();
//                            break;
//                            case 3: 
//                                pharmacy.displayPrescription();
//                            break;
//                            case 4: 
//                                pharmacy.displayDrugs();
//                            break;
//                        }
//                        System.out.println("Order products list:");
//                        System.out.println("-----------------------------------");
//                        System.out.println("Enter product Name");
//                        String selectProduct ;
//                        String select = "yes";
//                        while(select.equals("yes")) {
//                            selectProduct = input.next();
//                            order.setCustomer(newCustomer);
//                            if(pharmacy.getProduct(selectProduct).getCategory()=="prescription") {
//                                System.out.print("Enter 8 digits Prescreption: ");
//                                pharmacy.getPrescription(selectProduct).setPrescription(input.next());
//                                order.addProduct(pharmacy.getPrescription(selectProduct)); 
//                            }
//                            else    
//                                order.addProduct(pharmacy.getProduct(selectProduct));                        
//
//                                System.out.print("Do you want to choose other item (yes/no): ");
//                                select = input.next();                                
//                        }
//                            System.out.println("Payment method :\n1-Cash on delivery\n2-Online payment\n-------------------------------");
//                            int paymentChoice = input.nextInt();
//                            
//                            String pChoice = "";
//                            switch (paymentChoice) {
//                                case 1:
//                                    pChoice = "Cash on delivery";
//                                    break;
//                                case 2:
//                                    System.out.print("Enter card number : ");
//                                    String cardNumber = input.nextLine();
//                                    System.out.print("CVV : ");
//                                    String cvv = input.nextLine();
//                                    System.out.println("Expiry date : ");
//                                    String expDate = input.nextLine();
//                                    newCustomer.setCreditCard(true);
//                                    newCustomer.setCreditCard(cardNumber, cvv, expDate);
//                                    pChoice = "Online payment through " + newCustomer.getCreditCard();  
//                                    
//                            }                       
//                        order.displayrecepit(); 
//                        System.out.println("Payment method : " + pChoice);
//                        //date
//                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//                        LocalDate localDate = LocalDate.now();
//                        order.setDate(dtf.format(localDate));
//                        newCustomer.addPreviousOrder(order);
//                        newReporter.addOrder(order);                   
//                        
//                try {
//                   ObjectOutputStream ordersOos; ordersOos = new ObjectOutputStream(new FileOutputStream("Orders.txt"));
//                    ordersOos.writeObject(pharmacy.getOrdersRecords());//report
//                } catch (IOException ex) {
//                    Logger.getLogger(OnlinePharmacy.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                        
//                    break;
//                    case 2: 
//                        newCustomer.displayPreviousOrders();
//                    break;
//                    case 3: 
//                        newCustomer.clearHistory();
//                    break;
//                    case 4:
//                       System.out.println("Enter Product name");
//                       String search = input.next();
//                       pharmacy.SearchProduct(search);
//                       System.out.print("Do you want to do you wabt to buy this objct (yes/no): ");
//                       String ordering = input.next();
//                       if (ordering.equals("yes")) {  
//                           order.setCustomer(newCustomer);
//                           order.addProduct(pharmacy.getProduct(search));
//                            System.out.println("Payment method :\n1-Cash on delivery\n2-Online payment\n-------------------------------");
//                            paymentChoice = input.nextInt();
//                            pChoice = "";
//                            switch (paymentChoice) {
//                                case 1:
//                                    pChoice = "Cash on delivery";
//                                    break;
//                                case 2:
//                                    System.out.print("Enter card number : ");
//                                    String cardNumber = input.nextLine();
//                                    System.out.print("CVV : ");
//                                    String cvv = input.nextLine();
//                                    System.out.println("Expiry date : ");
//                                    String expDate = input.nextLine();
//                                    newCustomer.setCreditCard(true);
//                                    newCustomer.setCreditCard(cardNumber, cvv, expDate);
//                                    pChoice = "Online payment through " + newCustomer.getCreditCard();
//                                    
//                            }      
//                            System.out.println("Payment method : " + pChoice);
//                            order.displayrecepit();
//                            //date
//                            dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//                            localDate = LocalDate.now();
//                            order.setDate(dtf.format(localDate));   
//                            newCustomer.addPreviousOrder(order);
//                            newReporter.addOrder(order);
//                            try {
//                                ObjectOutputStream ordersOos; ordersOos = new ObjectOutputStream(new FileOutputStream("Orders.txt"));
//                                ordersOos.writeObject(pharmacy.getOrdersRecords());//report
//                            }
//                            catch(FileNotFoundException e){
//                                 e.printStackTrace();
//                            }
//                            catch (IOException ex) {
//                                Logger.getLogger(OnlinePharmacy.class.getName()).log(Level.SEVERE, null, ex);
//                            }    
//                         }
//                    break;
//                    case 5: decision ="no";
//                }
//                System.out.println("--------------------------------------------");
//            }
//        }

    }

}
    