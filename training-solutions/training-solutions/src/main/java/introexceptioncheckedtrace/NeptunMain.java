package introexceptioncheckedtrace;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NeptunMain {

    public static void main(String[] args) {
        Neptun neptun = new Neptun();
        List<String> codes = new ArrayList<>();
        List<String> namesAndCodes = new ArrayList<>();

        try {
            namesAndCodes = neptun.readNamesAndCodes();
        } catch (IOException exception) {
            System.out.println("Cannot read file.");
            exception.printStackTrace();
        }
        for (String nameAndCodePaar : namesAndCodes) {
            codes.add(nameAndCodePaar.split(",")[1]);
        }
        System.out.println(codes);
    }
}