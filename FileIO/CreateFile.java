/* 
Author: Ali Hasan
Date: 8/4/25
Topic: Creating new file
*/
package FileIO;
import java.io.*;
import java.io.File;
import java.io.IOException;
/* 
Class: File
Method: createNewFile()  -> creates new file
*/
public class CreateFile {
    public static void main(String[] args) {
        try{
            File file = new File("FileIO/test.txt");//File class object is created.
            if (file.createNewFile()){
                System.out.println("New file is created : " + file.getName());
            }
            else{
                System.out.println("File already created.");
            }
        }catch(IOException err){
            System.out.println("Something went wrong: " + err);
        }
    }
}
