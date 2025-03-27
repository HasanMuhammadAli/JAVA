package FileIO;
import java.io.FileReader;
import java.io.IOException;

class ByteStreamInput {
    public static void main(String[] args) throws IOException{
        FileReader in = null;
        try{
            in = new FileReader("/Users/AliHasan/sem4/JA/FileIO/input.txt");
            int i = 0;
            while ((i = in.read()) != -1) {
                System.out.print((char)i);
            }
        }finally{
            if(in != null){
                in.close();
            }
        }
    }
}