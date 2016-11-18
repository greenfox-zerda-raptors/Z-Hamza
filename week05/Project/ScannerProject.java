package Project;

import java.io.*;
import java.util.*;
public class ScannerProject {
    Scanner scan = new Scanner(System.in);
    TodoList myList = new TodoList();
    String inputString;
    int inputInt;

    public void ListScanner() {
//        PrintWriter Listoutput = createFile("C:/Users/Zoltán/Desktop/test/list.txt");
        Getfromfile();

        while (scan.hasNext()) {
            String scanned = scan.next();
            if (scanned.equals("add") || scanned.equals("a")) {
                myList.addToDoItem(scan.next());
                System.out.println("added");
            } else if (scanned.equals("remove") || scanned.equals("r")) {
                myList.removeToDoItem(scan.nextInt());
                System.out.println("removed");
            } else if (scanned.equals("list") || scanned.equals("l")) {

                if (myList.size() == 0) {
                    System.out.println("No to-do`s for today! :)");
                } else {
                    System.out.println("To-do`s for today:");
                    myList.print();
                    System.out.println("listed");
                }

            } else if (scanned.equals("complete") || scanned.equals("c")) {
                myList.change(scan.nextInt()-1);
            } else if (scanned.equals("help") || scanned.equals("h")) {
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

    private static PrintWriter createFile(String fileName) {
        try {
            File Listoutput = new File(fileName);
            PrintWriter infoToWrite = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter(Listoutput)));
            return infoToWrite;
        } catch (IOException e) {
            System.out.println("An I/O Error Occurred");
            System.exit(0);
        }
        return null;
    }
    private void Getfromfile(){
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:/Users/Zoltán/Desktop/test/list.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            String line = br.readLine();
            while (line != null) {
                System.out.println("This line is read from file:" + line);
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
            bw = new BufferedWriter(new FileWriter("C:/Users/Zoltán/Desktop/test/list.txt"));
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


//    private static void getFileInfo(){
//        System.out.println("Info Written to File\n");
//        File Listoutput = new File("C:/Users/Zoltán/Desktop/test/list.txt");
//        try {
//            BufferedReader getInfo = new BufferedReader(
//            new FileReader(Listoutput));
//            String custInfo = getInfo.readLine();
//            while(custInfo != null){
//                System.out.print("Customer");
//            }
//        }
//        catch (FileNotFoundException e) {
//            System.out.println("Couldn't Find the File");
//            System.exit(0);
//        }
//        catch(IOException e){
//            System.out.println("An I/O Error Occurred");
//            System.exit(0);
//        }
//    }



}


