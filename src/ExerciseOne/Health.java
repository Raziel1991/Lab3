package ExerciseOne;

class Health extends Insurance {

    public Health(){
        this.insuranceType = "Health";
        double monthlyCost = 150.00;
    }

    @Override
    public void setInsuranceCost(double cost) {
        monthlyCost = cost;
    }

    @Override
    public String displayInfo() {
        return "Insurance Type: " + insuranceType + " Monthly Cost: " + monthlyCost;
    }
}
