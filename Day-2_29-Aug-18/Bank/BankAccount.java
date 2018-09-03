public class BankAccount {
    private int accountNumber;
    private String name;
    private int balance;
    private static int totalBalance;
         
    public BankAccount() {
        //Default Constructor
    }

    public BankAccount(int accountNumber,String name) {
        this.accountNumber = accountNumber;
        this.name = name;        
    }

    public BankAccount(int accountNumber,String name,int balance) {
        this(accountNumber,name);
        this.balance = balance;
        this.totalBalance += balance;
    }

    /** 
     * Method to set all the data
     * static method
     */
    public static void setData(BankAccount account,int accountNumber,String name,int balance) {
        account.accountNumber = accountNumber;
        account.name = name;
        account.balance = balance;
        totalBalance += balance;
    }

    /**
     * Method to print average of n accounts
     */
    public static void calculateAverage(BankAccount...accounts) {
        int sum=0;
        int num=0;
        int avg=0;
        for (BankAccount account : accounts) {
            sum += account.balance;
            num++;
        }
        avg = sum/num;
        System.out.println("Average of all "+num+" Customers: "+avg);
    }

    /**
     * deposit method to deposit amount into the account
     */
    public void deposit(int amount) {
        this.balance += amount;
        System.out.println("Amount Deposited: "+amount+" Current balance: "+this.balance);
    }

    /**
     * withdraw method to withdraw amount from the account
     */
    public void withdraw(int amount) {
        if(amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Amount Withdrawn: "+amount+" Current balance: "+this.balance);
        } else {
            System.out.println("Insufficient Amount to withdrawn");
        }         
    }

    /**
     * toEquals Method to check weather objects are equal
     */
    public boolean toEquals(BankAccount account) {
        if(
            this.accountNumber==account.accountNumber &&
            this.name == account.name &&
            this.balance == account.balance
        ) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * toString override to print customer data
     */
    public String toString() {
        return "ANO.: "+this.accountNumber+" CustomerName: "+this.name+" Balance: "+this.balance;
    }
}