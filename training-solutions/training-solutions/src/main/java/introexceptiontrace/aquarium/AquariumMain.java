package introexceptiontrace.aquarium;

public class AquariumMain {

    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        Fish fishA = new Fish("tropical fish", "blue");
        Fish fishB = new Fish("goldfish", "yellow");

        aquarium.addFish(fishA);
        aquarium.addFish(fishB);

        aquarium.getNumberOfFish();/*

        Az Aquarium osztály AquariumMain osztály által hívott addFish() metódusában
        az ornamentalFish.add(fish) metódushívás NullPointerException kivételt dob,
        mert a List<Fish> típusú ornamentalFish attribútum értéke null.

        Exception in thread "main" java.lang.NullPointerException:
        Cannot invoke "java.util.List.add(Object)" because "this.ornamentalFish" is null
        at introexceptiontrace.aquarium.Aquarium.addFish(Aquarium.java:14)
        at introexceptiontrace.aquarium.AquariumMain.main(AquariumMain.java:10)*/
    }
}