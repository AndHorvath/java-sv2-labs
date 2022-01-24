package collectionsqueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ToDoList {

    // --- attributes ---------------------------------------------------------

    List<ToDo> toDos;

    // --- constructors -------------------------------------------------------

    public ToDoList() {
        toDos = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<ToDo> getToDos() { return toDos; }

    // --- public methods -----------------------------------------------------

    public void addToDo(ToDo toDo) {
        toDos.add(toDo);
    }

    public Deque<ToDo> getToDosInUrgencyOrder() {
        ArrayDeque<ToDo> toDosInUrgencyOrder = new ArrayDeque<>();
        for (ToDo toDo : toDos) {
            if (toDo.isUrgent()) {
                toDosInUrgencyOrder.addFirst(toDo);
            } else {
                toDosInUrgencyOrder.addLast(toDo);
            }
        }
        return toDosInUrgencyOrder;
    }

    // --- main method --------------------------------------------------------

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        toDoList.addToDo(new ToDo("ToDo A", false));
        toDoList.addToDo(new ToDo("ToDo B", true));
        toDoList.addToDo(new ToDo("ToDo C", true));
        toDoList.addToDo(new ToDo("ToDo D", false));
        toDoList.addToDo(new ToDo("ToDo E", false));
        toDoList.addToDo(new ToDo("ToDo F", true));

        Deque<ToDo> toDosInUrgencyOrder = toDoList.getToDosInUrgencyOrder();
        System.out.println(toDosInUrgencyOrder);

        System.out.println(toDosInUrgencyOrder.pop());
        System.out.println(toDosInUrgencyOrder.pop());
    }
}