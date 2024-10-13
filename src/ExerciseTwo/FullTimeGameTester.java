package ExerciseTwo;

public class FullTimeGameTester extends GameTester {
    Boolean isFullTime = true;

    //Sets Salary
    @Override
    public void setSalary() {
        super.setSalary(isFullTime);
    }
}
