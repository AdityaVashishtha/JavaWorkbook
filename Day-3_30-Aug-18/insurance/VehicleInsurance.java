public class VehicleInsurance extends Insurance {
    private int sumAssured;
    private String registrationNumber;
    private String engineNumber;    

    public VehicleInsurance() {
        //Default Constructor
    }

    public VehicleInsurance(
        int policyCode,
        String policyName,        
        int sumAssured,
        String registrationNumber,
        String engineNumber
    ) {
        //assuming policy term to be 1year always
        super(policyCode,policyName,1);
        this.sumAssured = sumAssured;
        this.engineNumber = engineNumber;        
        this.registrationNumber = registrationNumber;
    }

    public void renewPolicy() {
        System.out.println("Renew Policy VehicleInsurance Class");
    }

    public void displayPolicyDetails() {
        System.out.println("Policy Details VehicleInsurance");
    }

}
