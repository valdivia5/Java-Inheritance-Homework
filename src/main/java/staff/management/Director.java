package staff.management;

import staff.Employee;

public class Director extends Manager {

    private int budget;

    public Director(String name, String NInumber, int salary, String deptName, int budget) {
        super(name, NInumber, salary, deptName);
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }

    public double payBonus() {
        double salary = this.getSalary();
        return salary * 0.02;
    }
}
