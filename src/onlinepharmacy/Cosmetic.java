package onlinepharmacy;
public class Cosmetic extends Product{

    //overloading constructor
    public Cosmetic(String productName, String id, double price, int quantity, int singleOrderQuantity,String category) {
        super(productName, id, price, quantity, singleOrderQuantity, category);

    }
    //constructor
    public Cosmetic() {
        super();

    }   
}

