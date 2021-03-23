/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.Clock;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import onlinepharmacy.Customer;
import onlinepharmacy.Order;
import onlinepharmacy.Product;
import onlinepharmacy.Staff;

/**
 *
 * @author Abdelrahman
 */
public class AbstractFileReader {
    
    private final String StaffFile = "Staff.txt";
    private final String customersFile = "Customers.txt";
    private final String productsFile = "products.txt";
    private final String OrdersFile = "orders.txt";
    
    
    public List<Order> getAllOrders() {
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(this.OrdersFile))) {
            List<Order> orders = (List<Order>) stream.readObject();
            return orders;
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
         } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
 
    
    
    public List<Staff> getPeople() {
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(StaffFile))) {
            List<Staff> people = (List<Staff>) stream.readObject();
            return people;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public List<Customer> getCustomers() {
        try (ObjectInputStream stream2 = new ObjectInputStream(new FileInputStream(this.customersFile))) {
           List<Customer> customers = (List<Customer>) stream2.readObject();
            return customers;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
           return null;
    }
    public Hashtable<String,Product> getProduct(){
        try (ObjectInputStream stream3 = new ObjectInputStream(new FileInputStream(this.productsFile))) {
            Hashtable<String,Product> products = (Hashtable<String,Product>) stream3.readObject();
            return products;
        } 
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
           return null;
    }
    public void saveOrders(List<Order> orders){
          try{
            ObjectOutputStream StaffOos = new ObjectOutputStream(new FileOutputStream(this.OrdersFile));
            StaffOos.writeObject(orders);
          } 
          catch(FileNotFoundException e)
          {
              e.printStackTrace();
          }
          catch(IOException e)
          {
              e.printStackTrace();
          }   
        
    }
    
    public void savePeople(List<Staff> people) {
         try{
            ObjectOutputStream StaffOos = new ObjectOutputStream(new FileOutputStream(StaffFile));
            StaffOos.writeObject(people);
          } 
          catch(FileNotFoundException e)
          {
              e.printStackTrace();
          }
          catch(IOException e)
          {
              e.printStackTrace();
          }   
    }
    
    public void saveCustomer(List<Customer> customers) {
         try{
             // clear file content
            ObjectOutputStream ordersOos = new ObjectOutputStream(new FileOutputStream(this.customersFile));
            ordersOos.writeObject(customers);
          } 
          catch(FileNotFoundException e)
          {
              e.printStackTrace();
          }
          catch(IOException e)
          {
              e.printStackTrace();
          }   
    }
    
    public void saveStock(Hashtable<String,Product> products) {
        try{
            ObjectOutputStream productOos = new ObjectOutputStream(new FileOutputStream(this.productsFile));
            productOos.writeObject(products);
        }
          catch(FileNotFoundException e)
          {
              e.printStackTrace();
          }
          catch(IOException e)
          {
              e.printStackTrace();
          }  
    }
        
    
    
}
