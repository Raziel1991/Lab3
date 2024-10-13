package ExerciseThree;

public class BusinessMortgage extends Mortgage {

    public BusinessMortgage(int mortgageNumber, String customerName, double mortgageAmount, double primeRate, int term) {
        super(mortgageNumber, customerName, mortgageAmount, primeRate, term); // Call the superclass constructor first
        this.interestRate = primeRate + 1.0; // Set the interest rate after calling the superclass constructor
    }
}
