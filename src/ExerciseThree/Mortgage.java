package ExerciseThree;

abstract class Mortgage implements MortgageConstants {
    protected int mortgageNumber;
    protected String customerName;
    protected double mortgageAmount;
    protected double interestRate;
    protected int term;

    // Constructor to initialize the mortgage details
    public Mortgage(int mortgageNumber, String customerName, double mortgageAmount, double interestRate, int term) {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        this.mortgageAmount = mortgageAmount;

        // Ensure mortgage amount does not exceed $300,000
        if (this.mortgageAmount > MAX_MORTGAGE_AMOUNT) {
            this.mortgageAmount = MAX_MORTGAGE_AMOUNT;
        }

        // Set the term to SHORT_TERM if the given term is not in the constants
        if (term != SHORT_TERM && term != MEDIUM_TERM && term != LONG_TERM) {
            this.term = SHORT_TERM; // default to 1-year if not valid
        } else {
            this.term = term;
        }

        // Set interest rate based on the specific mortgage type (handled in subclasses)
        this.interestRate = interestRate;
    }

    // Method to display mortgage information
    public String getMortgageInfo() {
        return "Mortgage Number: " + mortgageNumber +
                "\nCustomer Name: " + customerName +
                "\nMortgage Amount: $" + String.format("%.2f", mortgageAmount) +
                "\nInterest Rate: " + String.format("%.2f", interestRate) + "%" +
                "\nTerm: " + term + " year(s)";
    }
}
