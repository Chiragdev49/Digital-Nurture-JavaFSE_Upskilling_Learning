import java.util.List;

record Person(String name, int age) {}

public class Q29_PersonRecordDemo {

    public static void main(String[] args) {

        Person p1 = new Person("Chirag", 20);
        Person p2 = new Person("Rahul", 17);
        Person p3 = new Person("Aman", 22);

        System.out.println("All Persons:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        List<Person> persons = List.of(p1, p2, p3);

        System.out.println("\nPersons age >= 18:");

        persons.stream()
               .filter(p -> p.age() >= 18)
               .forEach(System.out::println);
    }
}
