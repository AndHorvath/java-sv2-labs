package objects;

public class NumberOfObjectsMain {

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = book1;
        Book book5 = book1;
        Book book6 = book3;
        Book book7 = null;
        book4 = book6;
        new Book();
        book5 = new Book();
        book6 = null;
        book5 = book4;

        System.out.println("The code above creates 5 objects.");
        System.out.println("When the code has been executed, there are 3 objects to reach.");
    }
}
