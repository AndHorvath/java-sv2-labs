package introexceptionmoreexceptions;

public class PersonMain {

    public static void main(String[] args) {
        Person person = new Person(null, 32);

        System.out.println(person);
        System.out.println(person.getName());

        System.out.println(person.getName().toUpperCase());/*

        Null értékű referencia típusú változón metódushíváskor NullPointerException:
        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toUpperCase()"
        because the return value of "introexceptionmoreexceptions.Person.getName()" is null*/
    }
}