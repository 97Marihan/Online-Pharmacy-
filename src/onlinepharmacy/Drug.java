package onlinepharmacy;
public class Drug extends Product{
    
    public Drug(String productName, String id, double price, int quantity, int singleOrderQuantity,String category) {
        super(productName, id, price, quantity, singleOrderQuantity,category);       
    }
  
    public Drug() {
        super(); 
        category = Category.DRUGS;
          
    }
}