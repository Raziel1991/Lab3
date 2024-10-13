package ExerciseOne;

import javax.swing.JOptionPane;

public class Driver {
    private static Insurance[] insuranceArray = new Insurance[2]; // Adjust the size based on your needs

    // Static method to run logic in the main method.
    public static void getDriverData() {
        String insuranceType;
        double monthlyCost;
        String selectedOption;
        String[] options = {"Life", "Health"};

        // chooses an option for insurance type as a drop-down menu
        for (int i = 0; i < insuranceArray.length; i++) {
            selectedOption = (String) JOptionPane.showInputDialog(null, "Choose an option:", "Title", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            // while with try and catch to validate user input
            while (true) {
                try {
                    monthlyCost = Double.parseDouble(JOptionPane.showInputDialog("Enter monthly cost"));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid monthly cost. Please enter a numeric value.");
                }
            }

            // Create the appropriate insurance object based on user's choice
            if (selectedOption.equals("Life")) {
                insuranceArray[i] = new Life(); // Create ExerciseOne.Life insurance object
            } else if (selectedOption.equals("Health")) {
                insuranceArray[i] = new Health(); // Create ExerciseOne.Health insurance object
            }

            // Set the user-defined monthly cost
            insuranceArray[i].setInsuranceCost(monthlyCost);
        }

        displayInsuranceInfo();
    }

    // Method to display insurance information
    public static void displayInsuranceInfo() {
        System.out.println("\nProcessing all insurance policies...");
        for (Insurance insurance : insuranceArray) {
            insurance.displayInfo();
            StringBuilder output = new StringBuilder();
            output.append("ExerciseOne.Insurance Type: ").append(insurance.getInsuranceType())
                    .append("\nMonthly Cost: $").append(String.format("%.2f", insurance.getMonthlyCost()));
            JOptionPane.showMessageDialog(null, output.toString());
        }
    }

    public static void main(String[] args) {
        getDriverData();
    }
}