package ExerciseTwo;

import javax.swing.*;

abstract public class GameTester {
    protected String name;
    protected Boolean isFullTime;
    protected int Salary;

    // creating abstract method as per exercise instructions, but it does now seem the best approach.
    abstract public void setSalary();

    // creating overloading since it takes less code than using the abstract class.
    public void setSalary(Boolean isFullTime) {
        this.isFullTime = isFullTime;

        //Sets salary accordant to game tester
        if (isFullTime){
            this.Salary = 3000;
        }
        else{
            this.Salary = 20;
        }
    }

    // declaring as static just for fun, is a challenge as we cannot use "this"
    public static void runExerciseTwo(){
        //Current Options for selection
        String selectedOption;
        String[] options = {"Full Time", "Part Time"};
        selectedOption = (String) JOptionPane.showInputDialog(null, "Choose an option:", "Title", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        // full time selection
        if(selectedOption.equals("Full Time")){
            GameTester gameTester = new FullTimeGameTester();
            gameTester.setSalary();
            gameTester.name =  JOptionPane.showInputDialog(null, "Game Tester name?");
            JOptionPane.showMessageDialog(null, "Game tester: " + gameTester.name + "\n Total Salary: " + gameTester.Salary);
        }
        // part-time selection
        else if(selectedOption.equals("Part Time")){

            int workedHours;
            //Will get user input  for total of worked hours while-try will check correct inputs.
            while(true){
                try{
                    workedHours = Integer.parseInt(JOptionPane.showInputDialog(null,"Total Hours worked:"));
                    break;
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Invalid Input!\nUse only integers");
                }
            }
            GameTester gameTester = new PartTimeGameTester();
            gameTester.setSalary();
            gameTester.name =  JOptionPane.showInputDialog(null, "Game Tester name?");
            JOptionPane.showMessageDialog(null, gameTester.name + "\n Total Salary: " + (gameTester.Salary * workedHours)) ;
        }
    }
}
