/**
 * Employee class that extends Person
 */
public class Employee extends Person {
    protected double salary;

    /**
     * Constructor using super()
     */
    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    /**
     * Method to display salary
     */
    public void displaySalary() {
        System.out.println("My salary is $" + salary);
    }

    /**
     * Main method to test Employee class
     */
    public static void main(String[] args) {
        Employee e = new Employee("Charlie", 30, 55000);
        e.introduce();
        e.displaySalary();
    }
}
