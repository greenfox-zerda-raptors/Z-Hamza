package Project;


import java.util.Scanner;

public class projecttest {
    public static void main(String[] args) {
        TodoList myList = new TodoList();
        myList.addToDoItem("Walk the dog");
        myList.addToDoItem("Cut the grass", "d");
        myList.addToDoItem("Kill a dragon");
        System.out.println(myList.size());
        myList.print();
        myList.change(0);
        System.out.println("");
        myList.print();
    }
}

