package objectclass.ancestor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonAncestor {

    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();

        Fruit fruit = new Fruit();
        objects.add(fruit);

        Apple apple = new Apple();
        objects.add(apple);

        Starking starking = new Starking();
        objects.add(starking);

        Vegetable vegetable = new Vegetable();
        objects.add(vegetable);

        String anyString = "alma";
        objects.add(anyString);

        int anyInteger = 12;
        objects.add(anyInteger);

        char anyCharacter = 'x';
        objects.add(anyCharacter);

        LocalDate localDate = LocalDate.now();
        objects.add(localDate);

        int[] integerArray = new int[] { 1, 2, 3 };
        objects.add(integerArray);

        List<String> stringList = new ArrayList<>(Arrays.asList("this", "that"));
        objects.add(stringList);

        System.out.println(objects);
    }
}