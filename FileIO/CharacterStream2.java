package FileIO;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
class CharacterStream2 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new FileInputStream("/Users/AliHasan/sem4/JA/FileIO/input.txt");
            out = new FileOutputStream("/Users/AliHasan/sem4/JA/FileIO/output.txt");
            int i = 0;
            while ((i = in.read()) != -1) {
                out.write((char)i);
            }
            System.out.println("Reading and Writting ends.");
        }finally{
            if(in != null){
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
