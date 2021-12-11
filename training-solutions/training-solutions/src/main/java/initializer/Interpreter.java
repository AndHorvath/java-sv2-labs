package initializer;

public class Interpreter {

    private String field;

    public Interpreter() {
        System.out.print(1);
    }

    {
        System.out.print(2);
    }

    {
        System.out.print(3);
    }

    static {
        System.out.print(4);
    }

    public Interpreter(String field) {
        System.out.print(5);
    }

    {
        System.out.print(6);
    }

    static {
        System.out.print(7);
    }

    public static void main(String[] args) {
        Interpreter interpreterOne = new Interpreter();
        Interpreter interpreterTwo = new Interpreter("");
    }

    /*
    A várt sorrend: 4, 7, 2, 3, 6, 1, 2, 3, 6, 5
    */
}