public class BankClient {
    public static void main(String args[]) {
        BankAccount c1 = new BankAccount();
        //setData() is static method
        BankAccount.setData(c1,1001,"ABHINAV JAIN",1000);
        BankAccount c2 = new BankAccount(1002,"AMEYA JAIN");
        BankAccount c3 = new BankAccount(1003,"SURJAN JAIN",2000);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        BankAccount.calculateAverage(c1);
        BankAccount.calculateAverage(c1,c2);
        BankAccount.calculateAverage(c1,c2,c3);

        c1.deposit(150);
        c2.deposit(1000);
        c1.withdraw(150);
        c3.withdraw(150);
        c1.withdraw(15000);

        System.out.println("c1==c2 : "+c1.toEquals(c2));
        System.out.println("c1==c1 : "+c1.toEquals(c1));
    }
}