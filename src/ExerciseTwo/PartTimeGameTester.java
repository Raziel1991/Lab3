package ExerciseTwo;

public class PartTimeGameTester extends GameTester {
    Boolean isFullTime = false;

    //Sets Salary
    @Override
    public void setSalary() {
        super.setSalary(isFullTime);
    }
}
