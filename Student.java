/**
 * Student class that extends Person
 */
public class Student extends Person {
    private String school;

    /**
     * Constructor using super() to initialize inherited fields
     */
    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    /**
     * Overridden introduce() method
     */
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I attend " + school + ".");
    }

    /**
     * Main method to test Student class
     */
    public static void main(String[] args) {
        Student s = new Student("Bob", 18, "Middlesex College");
        s.introduce();
    }
}
