/**
 * Demonstrates polymorphism using Person array
 */
public class PolymorphismDemo {

    public static void main(String[] args) {

        // Array of Person references
        Person[] people = new Person[3];

        people[0] = new Person("Alice", 25);
        people[1] = new Student("Bob", 19, "Middlesex College");
        people[2] = new Employee("Charlie", 35, 70000);

        // Loop through and call introduce()
        for (Person p : people) {
            p.introduce();
            System.out.println();
        }
    }
}
