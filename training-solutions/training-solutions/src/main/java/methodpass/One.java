package methodpass;

public class One {

    public static void main(String[] args) {
        int number;
        One one;

        number = 1;
        System.out.println(number);
        number++;
        System.out.println(number);

        number = 1;
        System.out.println(number);
        one = new One();
        System.out.println(one.addOne(number));
        System.out.println(number);
    }

    public int addOne(int number) {
        number++;
        return number;
    }
}