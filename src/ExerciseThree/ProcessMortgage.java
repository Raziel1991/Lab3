package ExerciseThree;
import javax.swing.JOptionPane;

public class ProcessMortgage {
    public static void runExerciseThree() {
        final int NUM_MORTGAGES = 3;
        Mortgage[] mortgages = new Mortgage[NUM_MORTGAGES];

        // Prompt the user for the current prime interest rate
        double primeRate;
        while (true) {
            try {
                primeRate = Double.parseDouble(JOptionPane.showInputDialog("Enter the current prime interest rate (e.g., 5.0):"));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a numeric value for the interest rate.");
            }
        }

        // Loop to create 3 mortgages
        for (int i = 0; i < NUM_MORTGAGES; i++) {
            String customerName = JOptionPane.showInputDialog("Enter customer name:");

            // Prompt for mortgage amount
            double mortgageAmount;
            while (true) {
                try {
                    mortgageAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter the mortgage amount (max $300,000):"));
                    if (mortgageAmount <= MortgageConstants.MAX_MORTGAGE_AMOUNT) {
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Mortgage amount exceeds the maximum limit of $300,000.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a numeric value for the mortgage amount.");
                }
            }

            // Prompt for mortgage term
            int term;
            String[] termOptions = {"1 Year", "3 Years", "5 Years"};
            String selectedTermOption = (String) JOptionPane.showInputDialog(null, "Choose mortgage term:", "Term Selection",
                    JOptionPane.PLAIN_MESSAGE, null, termOptions, termOptions[0]);
            if (selectedTermOption.equals("1 Year")) {
                term = MortgageConstants.SHORT_TERM;
            } else if (selectedTermOption.equals("3 Years")) {
                term = MortgageConstants.MEDIUM_TERM;
            } else {
                term = MortgageConstants.LONG_TERM;
            }

            // Prompt for mortgage type
            String[] mortgageTypes = {"Business Mortgage", "Personal Mortgage"};
            String selectedMortgageType = (String) JOptionPane.showInputDialog(null, "Choose mortgage type:", "Mortgage Type Selection",
                    JOptionPane.PLAIN_MESSAGE, null, mortgageTypes, mortgageTypes[0]);

            // Create the appropriate mortgage object based on user's choice
            if (selectedMortgageType.equals("Business Mortgage")) {
                mortgages[i] = new BusinessMortgage(i + 1, customerName, mortgageAmount, primeRate + 1, term);
            } else if (selectedMortgageType.equals("Personal Mortgage")) {
                mortgages[i] = new PersonalMortgage(i + 1, customerName, mortgageAmount, primeRate, term);
            }
        }

        // Display all mortgage information
        StringBuilder allMortgageInfo = new StringBuilder("All Mortgage Information:\n");
        for (Mortgage mortgage : mortgages) {
            allMortgageInfo.append(mortgage.getMortgageInfo()).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, allMortgageInfo.toString());
    }
}
