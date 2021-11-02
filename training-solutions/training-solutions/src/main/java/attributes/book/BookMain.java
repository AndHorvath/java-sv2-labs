package attributes.book;

public class BookMain {

    public static void main(String[] args) {
        String title;
        Book book = new Book("Good Title");

        title = book.getTitle();
        System.out.println(title);

        book.setTitle("Better Title");
        title = book.getTitle();
        System.out.println(title);
    }
}