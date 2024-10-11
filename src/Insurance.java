abstract public class Insurance {
    protected String type;
    protected double cost;

    //no constructor required by the lab document

    // Get methods for instance variables
    public String getType() {
        return type;
    }
    public double getCost() {
        return cost;
    }

    // Abstract methods
    abstract public void setInsuranceCost(double cost);
    abstract public String displayInfo();

}
