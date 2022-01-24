package collectionsqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vaccination {

    public Queue<Integer> getVaccinationOrder(List<Person> people) {
        Queue<Integer> vaccinationOrder = new PriorityQueue<>();
        for (Person person : people) {
            if (isVaccinable(person)) {
                vaccinationOrder.add(person.getAge());
            }
        }
        return vaccinationOrder;
    }

    public static void main(String[] args) {
        Vaccination vaccination = new Vaccination();
        List<Person> people = new ArrayList<>(List.of(
            new Person("Person A", 50), new Person("Person B", 40), new Person("Person C", 10),
            new Person("Person D", 20), new Person("Person E", 30), new Person("Person F", 70),
            new Person("Person G", 60), new Person("Person H", 50), new Person("Person I", 40)
        ));
        Queue<Integer> vaccinationOrder = vaccination.getVaccinationOrder(people);
        System.out.println(vaccinationOrder);

        System.out.println(vaccinationOrder.poll());
        System.out.println(vaccinationOrder.poll());
    }

    // --- private methods ----------------------------------------------------

    private boolean isVaccinable(Person person) {
        return 18 <= person.getAge() && person.getAge() <= 65;
    }
}