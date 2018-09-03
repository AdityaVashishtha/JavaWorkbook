public class Insurance {
    private int policyCode;
    private String policyName;    
    private int policyTerm;

    public Insurance() {
        //Default Constructor
    }

    public Insurance(int policyCode, String policyName, int policyTerm) {
        this.policyCode = policyCode;
        this.policyName = policyName;
        this.policyTerm = policyTerm;
    }

    public void displayPolicyDetails() {
        System.out.println(
            "Policy Details: " + this.policyCode +
            "\nPolicy Name: " + this.policyName +
            "\nPolicy Term: " + this.policyTerm 
        );
    }
    public void renewPolicy() {
        System.out.println("Renew Policy Insurance Class");
    }

}
