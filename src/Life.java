class Life extends Insurance{

    //Constructor
    public Life() {
        // No call to super() anymore, we set the type here
        this.type = "Life Insurance";
        //Default set
        setInsuranceCost(200);
    }

    //Constructor overloading - what for ???? --- only a deity will know
    public Life(String type, int cost) {}

    //sets insurance cost
    public void setInsuranceCost(double cost) {
        this.cost = cost;
    }


    @Override
    public String displayInfo() {
        return this.type + " " + this.cost;
    }
}
