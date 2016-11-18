package Project;

import java.io.*;
import java.util.*;
public class ScannerProject {
    Scanner scan = new Scanner(System.in);
    TodoList myList = new TodoList();
    int inputInt;
    String fileName;

    public void ListScanner() {
        fileName = "list.txt";
        Getfromfile();
        help();

        while (scan.hasNext()) {

            String scanned = scan.next();

            if (scanned.equals("add") || scanned.equals("a")) {
                myList.addToDoItem(scan.nextLine());
                System.out.println("Added task");
            } else if(scanned.equals("replace")){
                try {
                    myList.replace(scan.nextInt() - 1, scan.nextLine());
                    System.out.println("Replaced");
                }catch(InputMismatchException e){
                    System.out.println("Something went wrong");
                }
            }
                else if (scanned.equals("remove") || scanned.equals("r")) {
                try {
                    myList.removeToDoItem(scan.nextInt());
                    System.out.println("Removed task");
                }catch(IndexOutOfBoundsException e12){
                    System.out.println("There is no such item");
                }catch (InputMismatchException e13){
                    System.out.println("This is not valid, please type in a number");
                }

            } else if (scanned.equals("list") || scanned.equals("l")){

                if (myList.size() == 0) {
                    System.out.println("No to-do`s for today! :)");
                } else {
                    System.out.println("To-do`s for today:");
                    myList.print();
                }

            } else if (scanned.equals("complete") || scanned.equals("c")) {
                myList.change(scan.nextInt()-1);
                System.out.println("Checked");
            } else if (scanned.equals("help") || scanned.equals("h")) {
                help();

            } else if (scanned.equals("exit")) {
                System.out.println("ToDoList exits");
                break;

            } else {
                System.out.println("I could not get that!    (type `help` or `h` for help");
            }

        }

        String savefile = myList.converttoList();
        System.out.println(savefile);
        Putintofile(myList);

    }

    private void Getfromfile(){

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("C:/Users/Zoltán/Desktop/test/"+fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            String line = br.readLine();
            while (line != null) {
                // reading the next line
                myList.addToDoItem(convertlineFile(line));
                line = br.readLine();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void Putintofile(TodoList content){
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("C:/Users/Zoltán/Desktop/test/"+fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
//            bw.write(content);
            for(int i =0; i<content.size(); i++) {
                bw.write(myList.converttoLines(i));
                bw.newLine();
            }
                // close up and flush
                bw.flush();
                bw.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static ToDoItems convertlineFile(String line){
        String a[] = line.split("  ", 4);
        String aa = a[0];
        String cc = a[3];
        return new ToDoItems(cc, aa);
    }
    private void help() {
        System.out.println("CLI Todo application");
        System.out.println("====================\n");
        System.out.println("Available commands:");
        System.out.println("list       Lists all the tasks");
        System.out.println("l          shorthand for list");
        System.out.println("add        Adds a new task");
        System.out.println("a          shorthand for add");
        System.out.println("remove     Removes an task");
        System.out.println("r          shorthand for remove");
        System.out.println("complete   Completes an task");
        System.out.println("c          shorthand for complete");
        System.out.println("help       Print out this list again");
        System.out.println("h          shorthand for help");
        System.out.println("exit       to exit");
    }
}


