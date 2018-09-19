public class SBICard implements ATMCard {
    private int pin;
    private int cardNumber;
    private int balance;
    private String customerName;
    private int cvv;
    private int expiryYear;

    public SBICard(int cardNumber,int pin,int cvv,int expiryYear) {
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    public SBICard(int cardNumber, int pin,int cvv,int expiryYear,String customerName, int balance) {
        this(cardNumber,pin,cvv,expiryYear);
        this.customerName=customerName;
        this.balance=balance;
    }


    public boolean verifyPIN(int pin) {
        if(pin == this.pin) {
            System.out.println("CORRECT PIN");
            return true;
        } else {
            System.out.println("INCORRECT PIN");
            return false;
        }
    }

    public void withdrawMoney(int amount,int pin) {
        if(verifyPIN(pin)) {
            if(this.balance >= amount) {
                this.balance -= amount;
                System.out.println("AMOUNT DEBITED "+amount+", CURRENT BALANCE: "+this.balance);
            } else {
                System.out.println("INSUFFICIENT BALANCE");
            }
        }        
    }

    public void checkBalance(int pin) {
        if(verifyPIN(pin)) {
            System.out.println("BALANCE : "+this.balance);
        }
    }
    
    public void changePIN(int oldPIN,int newPIN) {
        if(verifyPIN(oldPIN)) {
            this.pin = newPIN;
        }
    }

}