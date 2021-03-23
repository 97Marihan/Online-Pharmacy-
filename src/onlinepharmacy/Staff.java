package onlinepharmacy;
import java.util.Scanner;
public class Staff extends User implements java.io.Serializable {
    private enum Shift {
        DAY, NIGHT
    }
    private enum Position {
        Delivery, Administrative
    }
    private Shift shift;
    private Position position;
    
    // Default Constructor
    public Staff () {
           shift = Shift.DAY;
           position = Position.Administrative;
    }
    transient Scanner input = new Scanner(System.in);
    
    // Setters
    public void setShift(String shift) {
        if (shift == "DAY" || shift == "day" || shift == "d" || shift == "D")
            this.shift = Shift.DAY;
        else if (shift == "NIGHT" || shift == "night" || shift == "n" || shift == "N")
            this.shift = Shift.NIGHT;
        else{
            System.out.println("Please choose either DAY or NIGHT!");
            setShift(input.next());
        }
    }
    public void setPosition(String position) {
        if (position == "delivery" || position == "Delivery" || position == "DELIVERY")
            this.position = Position.Delivery;
        else if (position == "Administrative" || position == "administrative" || position == "Admin" || position == "admin" || position == "ADMINISTRATIVE")
            this.position = Position.Administrative;
        else{
            System.out.println("Please choose either MANAGER or DOCTOR!");
            setPosition(input.next());
        }
    }
    
    // Getters
    public String getShift() {
        if (this.shift == Shift.DAY)
            return "Day";
        else return "Night";
    }
    public String getPosition() {
        if (this.position == Position.Administrative)
            return "Administrative";
        else return "Delivery";
    }
    
}

