package classstructuremethods;

import java.util.Scanner;

public class NoteMain {

    public static void main(String[] args) {
        String noteText;
        Note note = new Note();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the author's name!");
        note.setAuthor(scanner.nextLine());

        System.out.println("Enter the note's topic!");
        note.setTopic(scanner.nextLine());

        System.out.println("Enter the note's text!");
        note.setText(scanner.nextLine());

        noteText = note.getNoteText();

        System.out.println(noteText);
    }
}
