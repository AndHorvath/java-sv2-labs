package aslist;

import java.util.Scanner;

public class SequenceMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = {1, 2};
        int numberOfIterations;
        Sequence sequence;

        sequence = new Sequence(elements[0], elements[1]);
        sequence.printElements();

        System.out.println(
                "How many times do you want to add " +
                "the product of the two last elements to the sequence?");
        numberOfIterations = scanner.nextInt();

        sequence.addProductOfTwoLast(numberOfIterations);
        sequence.printElements();

        System.out.println(
                "Now, the list contains " + sequence.getElements().size() + " elements.");
    }
}