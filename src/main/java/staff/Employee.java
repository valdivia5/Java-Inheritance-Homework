package staff;

public abstract class Employee {

    private String name;
    private String NInumber;
    private int salary;

    public Employee(String name, String NInumber, int salary) {
        this.name = name;
        this.NInumber = NInumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNInumber() {
        return NInumber;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(double raise) {
        if (raise >= 0) {
            this.salary += raise;
        }
    }

    public double payBonus() {
        return this.salary * 0.01;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
}
