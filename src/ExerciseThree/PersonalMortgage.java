package ExerciseThree;

public class PersonalMortgage extends Mortgage {
    // Constructor for PersonalMortgage, accepts prime rate and calculates interest rate
    public PersonalMortgage(int mortgageNumber, String customerName, double mortgageAmount, double primeRate, int term) {
        super(mortgageNumber, customerName, mortgageAmount, primeRate, term); // Call the superclass constructor first
        this.interestRate = primeRate + 2.0; // Set the interest rate after calling the superclass constructor
    }
}
