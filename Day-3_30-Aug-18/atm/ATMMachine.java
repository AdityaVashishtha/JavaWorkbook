public class ATMMachine {
    private ATMCard atmCard;

    void insertATM(ATMCard atmCard) {
        this.atmCard = atmCard;
    }

    public static void main(String args[]) {
        //Initializing new ATM Machine
        ATMMachine atmMachine = new ATMMachine();

        //Getting new Card of SBI
        SBICard card = new SBICard(456789, 1234,123,2020, "ADITYA" , 5000);

        atmMachine.insertATM(card);
        
        int pin = 1234;
        card.checkBalance(pin);
        card.withdrawMoney(100,1325);


    }
}