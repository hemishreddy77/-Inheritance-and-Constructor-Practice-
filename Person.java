/**
 * Base class representing a generic person
 */
public class Person {
    protected String name;
    protected int age;

    /**
     * Constructor to initialize name and age
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Method to introduce the person
     */
    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }

    /**
     * Main method to test Person class
     */
    public static void main(String[] args) {
        Person p = new Person("Alice", 20);
        p.introduce();
    }
}
