package methodchain;

public class ModifiedWord {

    public String modifyWord(String word) {
        return word
                .toUpperCase()
                .replace(word.toUpperCase().charAt(1), 'x')
                .substring(0, 3)
                .concat("y");
    }
}