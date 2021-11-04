package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    public static void main(String[] args) {
        List<Dog> dogs1 = new ArrayList<>();
        List<Dog> dogs2 = new ArrayList<>();
        Dog dog1 = new Dog("Oscar", "black", 2);
        Dog dog2 = new Dog("Theodor", "brown", 3);
        Dog dog3 = new Dog("William", "white", 4);
        Dog dog4;
        Dog dog5;
        Dog dog6;
        Dog dog7;
        Dog dog8;
        Dog dog9;

        dogs1.add(dog1);
        dogs1.add(dog2);
        dogs1.add(dog3);
        System.out.println(dogs1);

        dog4 = dogs1.get(1);
        dog4.setColour("grey");
        System.out.println(dogs1);

        dog5 = new Dog("Charles", "red", 5);
        System.out.println(dog5);

        dog5 = dogs1.get(1);
        System.out.println(dog5);

        dogs1.add(dog5);
        System.out.println(dogs1);

        dog6 = dog4;
        dog6.setColour("yellow");
        System.out.println(dogs1);

        dogs2 = dogs1;
        dog7 = dog4;
        dog7.setColour("cream");
        System.out.println(dogs2);

        dog2.setColour("gold");
        System.out.println(dogs2);

        dog2 = null;
        System.out.println(dogs2);

        dog8 = dogs1.get(1);
        dog8 = null;
        System.out.println(dogs2);

        dog9 = dogs1.get(1);
        dog9.setColour("changing");
        System.out.println(dogs2);
    }
}