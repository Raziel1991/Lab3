public class Health extends Insurance {
    //Constructor
    public Health() {
        this.type = "Health Insurance";
        //sets insurance cost default
        setInsuranceCost(150);
    }

    //Sets insurance cost
    public void setInsuranceCost(double cost) {
        this.cost = cost;
    }

    //Override from Insurance parent
    @Override
    public String displayInfo(){
        return this.type + " " + this.cost;
    }

}
