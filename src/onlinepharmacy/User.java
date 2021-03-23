package onlinepharmacy;
import java.util.Scanner;
public class User implements java.io.Serializable {
    transient Scanner input = new Scanner(System.in);
    protected String firstName;
    protected char middleNameInit;
    protected String lastName;
    protected String emailAddress;
    protected String password;
    protected String phoneNum;
    protected Address address;
    protected int age;
    
    // Default Constructor
    public User() {
        this.firstName = "";
        this.middleNameInit = ' ';
        this.lastName = "";
        this.emailAddress = "";
        this.password = "";
        this.phoneNum = "";
        this.address = new Address();
        this.age = 0;
    }
    // Overloading Constructor
    public User(String firstName, char middleNameInit, String lastName, String emailAddress, String password, String phoneNum, Address address,int age) {
        setFirstName(firstName);
        setMiddleNameInit(middleNameInit);
        setLastName(lastName);
        setEmailAddress(emailAddress);
        setPassword(password);
        setPhoneNum(phoneNum);
        setAddress(address);
        setAge(age);
    }
    
    // Setters
    public void setAge(int age) {
        this.age = age;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setMiddleNameInit(char middleNameInit) {
        this.middleNameInit = middleNameInit;

    }
    public void setLastName(String lastName) {
       
        this.lastName = lastName;

    }
    public void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;

    }
    public void setPassword(String password) {  
        this.password = password;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;

    }
    public void setAddress(String streetName, int BuildingNum, String area, int apartmentNum) {
        this.address.setStreetName(streetName);
        this.address.setBuildingNum(BuildingNum);
        this.address.setArea(area);
        this.address.setApartmentNum(apartmentNum);
        }
    public void setAddress(Address address) {
        this.address = address;
    }
    // Getters
    public String getFirstName() {
        return this.firstName;
    }
    public char getMiddleNameInit() {
        return this.middleNameInit;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getEmailAddress() {
        return this.emailAddress;
    }
     public String getPassword() {
        return this.password;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }
    public Address getAddress() {
        return this.address;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return " First Name: " + firstName + "  Middle NameInit: " + middleNameInit + "  LastName: " + lastName + "  Email: " + emailAddress + "  Phone Number: " + phoneNum +"\n"+ address.toString();
    }
    
}
