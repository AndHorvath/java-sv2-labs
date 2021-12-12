package introinheritance.fruits;

public class FruitsMain {

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setName("Fruit");
        fruit.setWeight(0.5d);
        System.out.println(fruit.getName());
        System.out.println(fruit.getWeight());

        Grape grape = new Grape();
        grape.setName("Grape");
        grape.setWeight(0.4d);
        grape.setType("Cabernet");
        System.out.println(grape.getName());
        System.out.println(grape.getWeight());
        System.out.println(grape.getType());

        Apple apple = new Apple();
        apple.setName("Apple");
        apple.setWeight(0.6d);
        apple.setPieces(2);
        System.out.println(apple.getName());
        System.out.println(apple.getWeight());
        System.out.println(apple.getPieces());

        GoldenDelicious goldenDelicious = new GoldenDelicious();
        goldenDelicious.setName("GoldenDelicious");
        goldenDelicious.setWeight(0.2d);
        goldenDelicious.setPieces(1);
        System.out.println(goldenDelicious.getName());
        System.out.println(goldenDelicious.getWeight());
        System.out.println(goldenDelicious.getPieces());
        System.out.println(goldenDelicious.getColour());

        Starking starking = new Starking();
        starking.setName("Starking");
        starking.setWeight(0.3d);
        starking.setPieces(3);
        System.out.println(starking.getName());
        System.out.println(starking.getWeight());
        System.out.println(starking.getPieces());
        System.out.println(starking.getColour());
    }
}