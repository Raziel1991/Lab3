import ExerciseOne.Driver;
import ExerciseTwo.GameTester;
import ExerciseThree.ProcessMortgage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutt
public class Main {
    public static void main(String[] args) {

        //exercise one execution
        Driver.getDriverData();

        //Exercise Two Execution
        GameTester.runExerciseTwo();

        //Exercise Three Execution
        ProcessMortgage.runExerciseThree();
    }
}