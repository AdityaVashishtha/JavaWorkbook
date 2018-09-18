interface ATMCard {
    boolean verifyPIN(int pin);
    void withdrawMoney(int amount,int pin);
    void checkBalance(int pin);
    void changePIN(int oldPIN,int newPIN);
}