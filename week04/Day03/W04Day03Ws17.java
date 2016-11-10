/**
 * File I/O: The copy command exercise
 *
 * This is just standard I/O and it's usually given as an early IT assignment.
 *
 * Given all that you've already seen and done, this should be fairly easy.
 *
 * This is how it should work, but NOTE ...
 * >>> means that what the computer does; and
 * <<< is what you the user does.
 *
 * >>> Enter the Source filename (assuming reading from C:\TEMP\) or give a different path name to?
 * <<< TestA.txt
 * >>> File does not exist, try again or blank to exit
 * <<< Test.txt
 * >>> Enter the Target filename (assuming writing to C:\TEMP\) or give a different path name?
 * <<< NewTest.txt
 * >>> Writing from C:\TEMP\Test.txt to C:\TEMP\NewTest.txt.  Press Y to confirm, N to abort.
 * <<< Y
 * >>> Done, wrote 102 Characters to C:\TEMP\NewTest.txt.
 *
 * Note that you should compute the working directory (e.g. C:\TEMP\).
 */

import java.io.File;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
public class W04Day03Ws17 {

    static String filePath,parentDirectory;
    static  Scanner input = new Scanner(System.in);
    static File randomDir, randomFile, randomFile2;
    public static void main(String[] args) {
        System.out.println("Enter the Source filename (assuming reading from C:\\TEMP\\) or give a different path name to?");
        String path;
        while (input.hasNext()){
            path = input.next();
            randomFile = new File(path);


            if (path.equals("q")){
                System.out.println("K0cs0g!");
                break;
            }
            if (!randomFile.exists()) {
                System.out.println("File does not exist, try again or blank to exit");
            }
            if (randomFile.exists()){

            }
        }
    }
}

