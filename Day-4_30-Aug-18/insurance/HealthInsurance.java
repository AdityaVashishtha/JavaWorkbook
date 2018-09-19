public class HealthInsurance extends Insurance {
    private int sumAssured;
    private int rentPerDay;
    private int preHospital;
    private int postHospital;

    public HealthInsurance() {
        //Default Constructor
    }

    public HealthInsurance(
        int policyCode,
        String policyName,
        int policyTerm,
        int sumAssured,
        int rentPerDay,
        int preHospital,
        int postHospital
    ) {
        super(policyCode,policyName,policyTerm);
        this.sumAssured = sumAssured;
        this.rentPerDay = rentPerDay;
        this.preHospital = preHospital;
        this.postHospital = postHospital;
    }

    public void renewPolicy() {        
        System.out.println("HealthInsurance Renew");
    }

    public void displayPolicyDetails() {
        System.out.println("Policy Details HealthInsurance");
        super.displayPolicyDetails();
        System.out.println(                        
            "\nSum Assured: " + this.sumAssured +
            "\nPre Hospital: " + this.preHospital
        );
    }

}
