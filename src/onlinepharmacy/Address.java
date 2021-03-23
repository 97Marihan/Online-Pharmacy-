package onlinepharmacy;
import java.util.Scanner;

public class Address implements java.io.Serializable {
    transient private Scanner input = new Scanner(System.in);
    private String streetName;
    private int buildingNum;
    private String area;
    private int apartmentNum;
    //default constructor
    public Address() {
        this.streetName = "";
        this.buildingNum = 1;
        this.area = "";
        this.apartmentNum = 1;
    } 
    //overloading constructor
    public Address(String streetName, int buildingNum, String area, int apartmentNum) {
        setStreetName(streetName);
        setBuildingNum(buildingNum);
        setArea(area);
        setApartmentNum(apartmentNum);
    } // Overloading Constructor
    // Getters
    public String getStreetName() {
        return streetName;
    }
    public int getBuildingNum() {
        return buildingNum;
    }
    public String getArea() {
        return area;
    }
    public int getApartmentNum() {
        return apartmentNum;
    }
    // Setters
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public void setBuildingNum(Integer buildingNum) {
       // if (buildingNum.intValue()> 0)
            this.buildingNum = buildingNum;
       // else {
        //    System.out.println("Invalid building number!");
         //   System.out.print("Enter again: ");
          //  setBuildingNum(input.nextInt());
        //}
    }
    public void setArea(String area) {
        this.area = area;
    }
    public void setApartmentNum(Integer apartmentNum) {
     //  if (apartmentNum.intValue()> 0)
            this.apartmentNum = apartmentNum;
     //  else { 
     //      System.out.println("Invalid appartment number!");
    //       System.out.print("Enter again: ");
    //       setApartmentNum(input.nextInt());
     //  }
    } 

    @Override
    public String toString() {
        return "Address: " + streetName + ", Building Number " + buildingNum + ", at " + area + ", Apartment Number " + apartmentNum + "\n";
    }
}

