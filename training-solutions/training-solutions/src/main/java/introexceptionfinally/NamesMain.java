package introexceptionfinally;

import java.nio.file.Paths;

public class NamesMain {

    public static void main(String[] args) {
        String pathWithDr = "src/main/resources/nameswithdr.txt";
        String pathWithoutDr = "src/main/resources/nameswithoutdr.txt";
        String pathWrong = "src/main/resources/namesdr.txt";
        Names names = new Names();

        System.out.println(names.collectDrs(Paths.get(pathWithDr)));
        System.out.println(names.collectDrs(Paths.get(pathWithoutDr)));
        System.out.println(names.collectDrs(Paths.get(pathWrong)));
    }
}