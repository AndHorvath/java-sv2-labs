package array;

public class ArrayHandlerMain {

    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();
        int[] numbers = { 7, 11, 94, 1020, 1 };
        String[] words = { "John Doe", "123 Main Street", "Anytown", "Anyland" };

        arrayHandler.addIndexToNumber(numbers);
        arrayHandler.concatenateIndexToWord(words);

        for (int number: numbers) {
            System.out.println(number);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + arrayHandler.createSeparator(i, numbers.length - 1));
        }
        for (String word: words) {
            System.out.println(word);
        }
        for (int i = 0; i < words.length; i ++) {
            System.out.print(words[i] + arrayHandler.createSeparator(i, words.length - 1));
        }
    }
}
