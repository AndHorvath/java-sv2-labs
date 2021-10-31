package looptypes;

public class Sum {

    public void printSums(int[] numbers) {
        String resultString = "";

        for (int i = 1; i < numbers.length; i++) {
            resultString += (numbers[i - 1] + numbers[i]) + (i != numbers.length - 1 ? ", " : "");
        }
        System.out.println(resultString);
    }
}