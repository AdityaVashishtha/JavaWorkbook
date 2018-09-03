public class PolicyClient {
    public static void main(String args[]) {
        Policy p1 = new Policy();
        p1.setPCode(1);
        p1.setPName("BirlaLife");
        p1.setPType("HeathInsurance");
        p1.setLowAge(18);
        p1.setMaxAge(50);
        p1.setMinAmount(15000);
        p1.setMaxAmount(150000);
        
        Policy p2 = new Policy(2,"Efco Tokio");
        Policy p3 = new Policy(3,"LIC","Vehicle Insurance");
        Policy p4 = new Policy(4,"Max Secure","Health Insurance",20000,45000);

        Policy.printPolicies(p1);
        System.out.println("__________________________");
        Policy.printPolicies(p1,p2,p3,p4);
    }
}