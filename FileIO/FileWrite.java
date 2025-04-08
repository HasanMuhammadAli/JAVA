package FileIO;
import java.io.*;
public class FileWrite {
    public static void main(String[] args) {
        String source = "Hello Dears";
        byte buff[] = source.getBytes();
        System.out.println(buff[0]);
        try{
            OutputStream fw = new FileOutputStream("FileIO/test.txt");
            //option 1: using for loop
            for(int i=0; i<buff.length; i++){
                fw.write(buff[i]);
            }
            //option 2: using object
            //fw.write(buff);
            fw.close();
        }
        catch(IOException err){
            System.out.println("Something is wrong: " + err);
        }
        
    }    
}
