package introexceptiontrycatch;

import java.util.Arrays;
import java.util.List;

public class FirstLetterMain {

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "cheese", "empty", null, "left", "", "volume"
        );
        FirstLetter firstLetter = new FirstLetter(words);

        System.out.println(Arrays.asList(firstLetter.getFirstLetterArray()));
    }
}