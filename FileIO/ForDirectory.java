/* 
Author: Ali Hasan
Date: 8/4/25
Topic: Creating new file
*/
/* 
Class: File
Method: isDirectory()
        list()
*/
package FileIO;
import java.io.*;
public class ForDirectory {
    public static void main(String[] args) {
        String dirname = "/Users/AliHasan/sem4/JA/FileIO";
        File f1 = new File(dirname);
        if(f1.isDirectory()){
            System.out.println("\nContents of " + dirname + ": \n");
            System.out.println("--------------------------------------------");
            String files[] = f1.list();
            for(int i=0; i< files.length; i++){
                File f = new File(dirname + "/" + files[i]);
                if (f.isDirectory()) {
                    System.out.println((i+1) + "." + files[i] + " is a directory.");
                }
                else{
                    System.out.println((i+1) + "." + files[i] + " is a file.");
                }
            }
        }
        else{
            System.out.println("There is no such directory.");
        }
    }
}