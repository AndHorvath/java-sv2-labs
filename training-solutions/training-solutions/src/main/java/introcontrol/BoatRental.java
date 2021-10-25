package introcontrol;

import java.util.Scanner;

public class BoatRental {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resultString = "";
        int groupSize;

        System.out.println("Please, specify the group size!");
        groupSize = scanner.nextInt();

        if (groupSize >= 5) {
            resultString += "5-boat is taken\n";
            groupSize -= 5;
            if (groupSize >= 3) {
                resultString += "3-boat is taken\n";
                groupSize -= 3;
                if (groupSize > 0) {
                    resultString += "2-boat is taken\n";
                    groupSize -= 2;
                    if (groupSize > 0) {
                        resultString += (groupSize + " of the group could not go.");
                    }
                } else {
                    resultString += "2-boat is free";
                }
            } else {
                resultString += "3-boat is free\n";
                if (groupSize > 0) {
                    resultString += "2-boat is taken";
                } else {
                    resultString += "2-boat is free";
                }
            }
        } else {
            resultString += "5-boat is free\n";
            if (groupSize >= 3) {
                resultString += "3-boat is taken\n";
                groupSize -= 3;
                if (groupSize > 0) {
                    resultString += "2-boat is taken";
                } else {
                    resultString += "2-boat is free";
                }
            } else {
                resultString += "3-boat is free\n";
                if (groupSize > 0) {
                    resultString += "2-boat is taken";
                } else {
                    resultString += "2-boat is free";
                }
            }
        }
        System.out.println(resultString);
    }
}
