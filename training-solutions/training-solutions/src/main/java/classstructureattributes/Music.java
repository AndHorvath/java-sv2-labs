package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song song = new Song();

        System.out.println("Please, enter your favourite song!");
        song.title = scanner.nextLine();

        System.out.println("Enter the band that made or performs the song!");
        song.band = scanner.nextLine();

        System.out.println("How many minutes long is the song?");
        song.lengthInMin = scanner.nextInt();

        System.out.println(
            "Your favourite song is: " + song.band + " - " + song.title + " (" + song.lengthInMin + " minutes)");
    }
}
