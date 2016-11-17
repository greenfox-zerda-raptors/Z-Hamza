package Project;

import java.util.ArrayList;

public class TodoList {
    ToDoItems toDoItem;
    ArrayList<ToDoItems> toDoList = new ArrayList<>();

    public TodoList() {

    }

    public TodoList(ArrayList<ToDoItems> toDoList) {
        this.toDoList = toDoList;
    }

    public void settoDoItem(String toDoItem) {
        this.toDoItem.settoDoItem(toDoItem);
    }

    public String gettoDoItem() {
        return toDoItem.gettoDoItem();
    }

    public int size() {
        return toDoList.size();
    }

    public ToDoItems get(int i) {
        return toDoList.get(i);
    }

    public void addToDoItem(String toDoItem) {
        toDoList.add(new ToDoItems(toDoItem));
    }

    public void addToDoItem(String toDoItem, String truefalse) {
        toDoList.add(new ToDoItems(toDoItem, truefalse));
    }

    public void removeToDoItem(int element) {
        toDoList.remove(element - 1);
    }

    public void change(int number) {
        toDoList.get(number).Done();
    }

    public String toString() {
        return toDoList.toString();
    }

    public void print() {
        int i = 0;
        String a = "";
        for (ToDoItems itoDoList : toDoList) {
            i++;

            System.out.println(itoDoList.getDone() + "    " + i + ") " + itoDoList.toString());
        }
    }

    public String converttoList() {
        int i = 0;
        String a = "";
        for (ToDoItems itoDoList : toDoList) {
            i++;
            a = a + itoDoList.getDone() + "    " + i + ") " + itoDoList.toString() + " \n";
        }
        return a;
    }
}
