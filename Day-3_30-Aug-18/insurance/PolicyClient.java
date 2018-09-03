public class PolicyClient {
    public static void main(String[] args) {
        Insurance insurance = new Insurance(1,"BirlaLife",10);
        HomeInsurance homeInsurance = new HomeInsurance(
                2,
                "EFCO-TOKIO-HOME-INSURANCE",
                15,
                2500000,
                125000,
                520000,
                "Indore"
            );
        VehicleInsurance vehicleInsurance = new VehicleInsurance(
                3,
                "HERO-CORP-VEHICLE-INSURANCE",        
                50000,
                "MP095623",
                "ABC123-5698"
            );

        LifeInsurance lifeInsurance = new  LifeInsurance(
                5,
                "ORIENTAL-INSURANCE",
                5,
                50000,
                500000,
                "COD",
                "ABHINAV"
            );

        HealthInsurance healthInsurance = new HealthInsurance(
                6,
                "LIC-HEALTH-INSURANCE",
                3,
                350000,
                3000,
                5000,
                0
            );


        // Printing policy details
        insurance.displayPolicyDetails();
        healthInsurance.displayPolicyDetails();
        vehicleInsurance.displayPolicyDetails();
        homeInsurance.displayPolicyDetails();
        lifeInsurance.displayPolicyDetails();

        // Renew policy function
        insurance.renewPolicy();
        healthInsurance.renewPolicy();
        vehicleInsurance.renewPolicy();
        homeInsurance.renewPolicy();
        lifeInsurance.renewPolicy();
    }
}