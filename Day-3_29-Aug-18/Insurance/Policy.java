 public class Policy {
    private int pCode;
    private String pName;
    private String pType;
    private int minAmount;
    private int maxAmount;
    private int lowAge;
    private int maxAge;

    /**
     * Constructors
     */
    public Policy() {
        //Default Constructors
    }

    public Policy(int pCode,String pName) {
        this.pCode = pCode;
        this.pName = pName;
    }

    public Policy(int pCode,String pName,String pType) {
        this(pCode,pName);
        this.pType = pType;
    }

    public Policy(int pCode, String pName, String pType, int maxAmount, int minAmount ) {
        this(pCode,pName,pType);
        this.maxAmount=maxAmount;
        this.minAmount=minAmount;
    }

    public Policy(int pCode, String pName, String pType, int maxAmount, int minAmount, int lowAge, int maxAge ) {
        this(pCode,pName,pType,maxAmount,minAmount);
        this.lowAge=lowAge;
        this.maxAge=maxAge;
    }

    public static void printPolicies(Policy...policies) {
        for (Policy policy : policies) {
            System.out.println(
                "PCode: "+policy.pCode+
                " PName: "+policy.pName+
                " PType: "+policy.pType+
                " MinAmount: "+policy.minAmount+
                " MaxAmount: "+policy.maxAmount+
                " LowAge: "+policy.lowAge+
                " MaxAge: "+policy.maxAge
            );
        }
    }

    /**
     * Setters for all properties
     */
    public void setPCode(int pCode) {
        this.pCode=pCode;
    }
    public void setPName(String pName) {
        this.pName=pName;
    }
    public void setPType(String pType) {
        this.pType=pType;
    }
    public void setMinAmount(int minAmount) {
        this.minAmount=minAmount;
    }
    public void setMaxAmount(int maxAmount) {
        this.maxAmount=maxAmount;
    }
    public void setLowAge(int lowAge) {
        this.lowAge=lowAge;
    }
    public void setMaxAge(int maxAge) {
        this.maxAge=maxAge;
    }

    /**
     * Getters for all properties
     */
    public int getPCode(int pCode) {
        return this.pCode;
    }
    public String getPName(String pName) {
        return this.pName;
    }
    public String getPType(String pType) {
        return this.pType;
    }
    public int getMinAmount(int minAmount) {
        return this.minAmount;
    }
    public int getMaxAmount(int maxAmount) {
        return this.maxAmount;
    }
    public int getLowAge(int lowAge) {
        return this.lowAge;
    }
    public int getMaxAge(int maxAge) {
        return this.maxAge;
    }


 }