package introexceptionwritefile;

import java.util.Scanner;

public class ToDoMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDo toDo = new ToDo();
        String entry;
        boolean isExit;

        do {
            System.out.println("Please, enter a task or press \"x\" to exit.");
            entry = scanner.nextLine();
            isExit = "x".equals(entry);
            if (!isExit) {
                toDo.addEntry(entry);
            }
        } while (!isExit);

        toDo.writeToDoListToFile();
    }
}