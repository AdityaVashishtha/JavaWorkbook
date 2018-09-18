public class HDFCCard implements ATMCard {
    private int pin;
    private int atmNumber;
    private int balance;
    private String customerName;

    public HDFCCard(int atmNumber,int pin) {
        this.atmNumber = atmNumber;
        this.pin = pin;
    }

    public HDFCCard(int atmNumber, int pin,String customerName, int balance) {
        this(atmNumber,pin);
        this.customerName=customerName;
        this.balance=balance;
    }


    public boolean verifyPIN(int pin) {
        if(pin == this.pin) {
            System.out.println("PIN IS CORRECT");
            return true;
        } else {
            System.out.println("PIN IS INCORRECT");
            return false;
        }
    }

    public void withdrawMoney(int amount,int pin) {
        if(verifyPIN(pin)) {
            if(this.balance >= amount) {
                this.balance -= amount;
                System.out.println("Amount "+amount+" is Withdrawn, Remaining Bal: "+this.balance);
            } else {
                System.out.println("INSUFFICIENT BALANCE");
            }
        }        
    }

    public void checkBalance(int pin) {
        if(verifyPIN(pin)) {
            System.out.println("YOUR CURRENT BALANCE IS :"+this.balance);
        }
    }

    public void changePIN(int oldPIN,int newPIN) {
        if(verifyPIN(oldPIN)) {
            this.pin = newPIN;
        }
    }

}