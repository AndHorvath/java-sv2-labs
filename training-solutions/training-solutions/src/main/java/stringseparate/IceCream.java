package stringseparate;

public class IceCream {

    public static void main(String[] args) {
        String[] iceCreamArray = { "chocolate", "vanilla", "strawberry", "lemon", "punch" };
        StringBuilder stringBuilder = new StringBuilder("Today's offer: ");

        for (int i = 0; i < iceCreamArray.length; i++) {
            stringBuilder.append(i != 0 ? ", " : "");
            stringBuilder.append(iceCreamArray[i]);
        }
        stringBuilder.append(". Special offers for kids!");

        System.out.println(stringBuilder);
    }
}