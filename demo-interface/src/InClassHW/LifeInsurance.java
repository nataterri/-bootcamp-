public class Insurance implements LifeInsurance {

    void calculatePremium();

    void fileClaim();
    
    void setPremium(double premium);
    double getPremium();
    
    void setClaimStatus(boolean claimStatus);
    boolean getClaimStatus();
}

public class LifeInsurance implements Insurance {
    private double premium;
    private boolean claimStatus;

    @Override
    public void calculatePremium() {
        System.out.println("Calculating life insurance premium.");
    }

    @Override
    public void fileClaim() {
        System.out.println("Filing a life insurance claim.");
    }

    @Override
    public void setPremium(double premium) {
        this.premium = premium;
    }

    @Override
    public double getPremium() {
        return premium;
    }

    @Override
    public void setClaimStatus(boolean claimStatus) {
        this.claimStatus = claimStatus;
    }

    @Override
    public boolean getClaimStatus() {
        return claimStatus;
    }

    public static void main(String[] args) {
        Insurance lifeInsurance = new LifeInsurance();
        lifeInsurance.calculatePremium();
        lifeInsurance.fileClaim();

        lifeInsurance.setPremium(1000.0);
        double premium = lifeInsurance.getPremium();
        System.out.println("Premium: " + premium);

        lifeInsurance.setClaimStatus(true);
        boolean claimStatus = lifeInsurance.getClaimStatus();
        System.out.println("Claim Status: " + claimStatus);
    }
}

