import java.util.*;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class SortingStructures {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 20));
        people.add(new Person("Charlie", 30));

        System.out.println("Original list: " + people);

        // Sorting by age using a comparator
        Collections.sort(people, Comparator.comparingInt(person -> person.age));

        System.out.println("Sorted by age: " + people);
    }
}
