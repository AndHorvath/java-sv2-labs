package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {
        Person personA;
        Person personB;
        int a;
        int b;

        personA = new Person("Jack Doe", 2000);
        personB = personA;
        personB.setName("James Doe");
        System.out.println("Person A's name: " + personA.getName() + ", person A's age: " + personA.getAge());
        System.out.println("Person B's name: " + personB.getName() + ", person B's age: " + personB.getAge());
        // A és B referenciája azonos, ezért az attribútumértékeik megegyeznek.

        a = 24;
        b = a;
        b++;
        System.out.println(a);
        System.out.println(b);
        // a nem referenciát tárol, hanem értéket, b tehát a értékét kapja meg, így b módosításakor a nem változik.

        personA = new Person("Jim Doe", 2001);
        System.out.println("Person A's name: " + personA.getName() + ", person A's age: " + personA.getAge());
        System.out.println("Person B's name: " + personB.getName() + ", person B's age: " + personB.getAge());
        // A és B refenciája eltér, így attribútumérékeik is eltérhetnek.
    }
}
