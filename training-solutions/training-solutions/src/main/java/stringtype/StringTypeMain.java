package stringtype;

public class StringTypeMain {

    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        String empty = "";
        String abcde = "Abcde";
        String emptyTwoTimes;
        boolean b;
        boolean c;

        message += 444;
        b = message.equals("Hello John Doe");
        c = message.equals("Hello John Doe444");

        System.out.println(prefix);
        System.out.println(name);
        System.out.println(message);
        System.out.println(b);
        System.out.println(c);

        emptyTwoTimes = empty + empty;

        System.out.println(emptyTwoTimes);
        System.out.println(emptyTwoTimes.length());

        System.out.println("The length of the String Abcde is: " + abcde.length());
        System.out.println(
                "First and third letter of Abcde: " + abcde.substring(0, 1) + ", " + abcde.substring(2, 3));
        System.out.println("Its substring from the first letter to the third: " + abcde.substring(0, 3));
    }
}