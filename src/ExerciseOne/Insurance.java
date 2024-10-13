package ExerciseOne;

abstract class Insurance {
    protected String insuranceType;
    protected double monthlyCost;

    //no constructor required by the lab document

    // Get methods for instance variables
    public String getInsuranceType() {
        return insuranceType;
    }
    public double getMonthlyCost() {
        return monthlyCost;
    }

    // Abstract methods
    abstract public void setInsuranceCost(double cost);
    abstract public String displayInfo();

}


