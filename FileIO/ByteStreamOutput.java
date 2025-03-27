package FileIO;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class ByteStreamOutput {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        try{
            in = new FileReader("/Users/AliHasan/sem4/JA/FileIO/input.txt");
            out = new FileWriter("/Users/AliHasan/sem4/JA/FileIO/output.txt");
            int i = 0;
            while ((i = in.read()) != -1) {
                out.write((char)i);
            }
            System.out.println("Reading Done and Writind Done.");
        }finally{
            if(in != null){
                in.close();
                out.close();
            }
        }
    }
}
