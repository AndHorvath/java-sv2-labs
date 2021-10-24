package javaapi;

import java.util.Scanner;

public class Upper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;

        System.out.println("Specify any text! It will be returned in capitals.");
        text = scanner.nextLine();

        System.out.println(text.toUpperCase());
    }
}