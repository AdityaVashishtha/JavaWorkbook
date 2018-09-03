public class LifeInsurance extends Insurance {
    private int minSumAssured;
    private int maxSumAssured;
    private String paymentMode;
    private String nominee;

    public LifeInsurance() {
        //Default Constructor
    }

    public LifeInsurance(
        int policyCode,
        String policyName,
        int policyTerm,
        int minSumAssured,
        int maxSumAssured,
        String paymentMode,
        String nominee
    ) {
        //assuming policy term to be 1year always
        super(policyCode,policyName,policyTerm);
        this.minSumAssured = minSumAssured;
        this.maxSumAssured = maxSumAssured;
        this.paymentMode = paymentMode;        
        this.nominee = nominee;
    }

    public void renewPolicy() {
        System.out.println("Renew Policy LifeInsurance Class");
    }

    public void displayPolicyDetails() {
        System.out.println("Policy Details LifeInsurance");
    }

}
