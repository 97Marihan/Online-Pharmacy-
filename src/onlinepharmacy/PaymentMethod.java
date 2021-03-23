package onlinepharmacy;
public class PaymentMethod implements java.io.Serializable {
    private String cvv;
    private String cardNumber;
    private String expDate;
    private enum CardType {
        MASTERCARD, VISA, AMERICANEXPRESS
    }
    private CardType cardType;
    public void setCvv(String cvv) {
        if (cvv.length() == 4 || cvv.length() == 3) {
            if (Integer.parseInt(cvv) == 270 || Integer.parseInt(cvv) == 365 || Integer.parseInt(cvv) == 467 || Integer.parseInt(cvv) == 648 || Integer.parseInt(cvv) == 967) {
                this.cardType = CardType.MASTERCARD;
                this.cvv = cvv;
            }
            else if (cvv == "048" || Integer.parseInt(cvv) == 707 || cvv == "094" || Integer.parseInt(cvv) == 198 || Integer.parseInt(cvv) == 122) {
                this.cardType = CardType.VISA;
                this.cvv = cvv;
            }
            else if (Integer.parseInt(cvv) == 932 || Integer.parseInt(cvv) == 556 || Integer.parseInt(cvv) == 489 || Integer.parseInt(cvv) == 620) {
                this.cardType = CardType.AMERICANEXPRESS;
                this.cvv = cvv;
            }
            else System.out.println("Invalid Card Verfication Value!");
        }
    }
    
    public void setCardNumber(String cardNumber) {
        if (cardNumber.startsWith("528") || cardNumber.startsWith("547") || cardNumber.startsWith("549") || cardNumber.startsWith("537") || cardNumber.startsWith("519")) {
            this.cardType = CardType.MASTERCARD;
            this.cardNumber = cardNumber;
        } else if (cardNumber.startsWith("455") || cardNumber.startsWith("498") || cardNumber.startsWith("491") || cardNumber.startsWith("471") || cardNumber.startsWith("448")) {
            this.cardType = CardType.VISA;
            this.cardNumber = cardNumber;
        } else if (cardNumber.startsWith("378") || cardNumber.startsWith("376") || cardNumber.startsWith("377") || cardNumber.startsWith("341") || cardNumber.startsWith("379")) {
            this.cardType = CardType.AMERICANEXPRESS;
            this.cardNumber = cardNumber;
        } else System.out.println("Invalid Card Number!");
    }
    
    public void setExpDate(String expDate) {
        if (expDate.contains("/")) {
            boolean flag = true;
            char [] expDateArray = expDate.toCharArray();
            char [] expDateValidArray = new char[5];
            if (flag) {
                if (((Integer.parseInt(String.valueOf(expDateArray[0])) == 0 && Integer.parseInt(String.valueOf(expDateArray[0])) == 0)) || ((Integer.parseInt(String.valueOf(expDateArray[3])) == 0 && Integer.parseInt(String.valueOf(expDateArray[4])) == 0))) {
                    System.out.println("Invalid Expiration Date!");
                } else
                    flag = false;
                if (Integer.parseInt(String.valueOf(expDateArray[0])) == 0 || Integer.parseInt(String.valueOf(expDateArray[0])) == 1) {
                    expDateValidArray[0] = expDateArray[0];
                } else
                    flag = false;
                if (Integer.parseInt(String.valueOf(expDateArray[1])) >= 0 && Integer.parseInt(String.valueOf(expDateArray[1])) <= 2) {
                    expDateValidArray[1] = expDateArray[1];
                } else 
                    flag = false;
                if (expDateArray[2] == '/') {
                    expDateValidArray[2] = expDateArray[2];
                } else
                    flag = false;
                if (Integer.parseInt(String.valueOf(expDateArray[3])) >= 0 && Integer.parseInt(String.valueOf(expDateArray[3])) <= 9) {
                    expDateValidArray[3] = expDateArray[3];
                } else
                    flag = false;
                if (Integer.parseInt(String.valueOf(expDateArray[4])) >= 0 && Integer.parseInt(String.valueOf(expDateArray[4])) <= 9) {
                    expDateValidArray[4] = expDateArray[4];
                } else
                    flag = false;
            }
        } else System.out.println("Invalid Expiration Date!");
    }
    
    public String getCardType() {
        String card = "";
        if (this.cardType == CardType.MASTERCARD)
            card = "Master Card";
        else if (this.cardType == CardType.VISA)
            card = "VISA";
        else if (this.cardType == CardType.AMERICANEXPRESS)
            card = "American Express";
        else System.out.println("Card type not found!");
        return card;
    }    
}
