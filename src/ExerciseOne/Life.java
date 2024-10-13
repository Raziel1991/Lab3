package ExerciseOne;

class Life extends Insurance{

    public Life(){
        this.insuranceType = "Life";
        double monthlyCost = 100.0;
    }


    //overrides fom ExerciseOne.Insurance
    @Override
    public void setInsuranceCost(double cost){
        monthlyCost = cost;
    }

    //overrides fom ExerciseOne.Insurance
    @Override
    public String displayInfo() {
        return  "Insurance Type: " + this.insuranceType + " Monthly Cost: " + monthlyCost;
    }
}