public class HomeInsurance extends Insurance {
    private int sumAssured;
    private int buildingCost;
    private int applianceCost;
    private String address;

    public HomeInsurance() {
        //Default Constructor
    }

    public HomeInsurance(
        int policyCode,
        String policyName,
        int policyTerm,
        int sumAssured,
        int buildingCost,
        int applianceCost,
        String address
    ) {
        //assuming policy term to be 1year always
        super(policyCode,policyName,1);
        this.sumAssured = sumAssured;
        this.buildingCost = buildingCost;        
        this.applianceCost = applianceCost;
        this.address = address;
    }

    public void renewPolicy() {
        System.out.println("Renew Policy HomeInsurance Class");
    }

    public void displayPolicyDetails() {
        System.out.println("Policy Details HomeInsurance");
    }

}
