public interface Insurance {

    void calculatePremium();

    void fileClaim();

    void setPremium(double premium);
    double getPremium();
    
    void setClaimStatus(boolean claimStatus);
    boolean getClaimStatus();
}
