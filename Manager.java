/**
 * Manager class that extends Employee
 */
public class Manager extends Employee {
    private int teamSize;

    /**
     * Constructor using super()
     */
    public Manager(String name, int age, double salary, int teamSize) {
        super(name, age, salary);
        this.teamSize = teamSize;
    }

    /**
     * Overridden displaySalary() method
     */
    @Override
    public void displaySalary() {
        super.displaySalary();
        System.out.println("I manage a team of " + teamSize + " people.");
    }

    /**
     * Main method to test Employee and Manager
     */
    public static void main(String[] args) {
        Employee e = new Employee("David", 28, 60000);
        Manager m = new Manager("Emma", 40, 90000, 5);

        e.introduce();
        e.displaySalary();

        System.out.println();

        m.introduce();
        m.displaySalary();
    }
}
