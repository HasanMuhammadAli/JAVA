package FileIO;
import java.io.IOException;
import java.io.FileInputStream;
class CharacterStreamInput {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        try{
            in = new FileInputStream("/Users/AliHasan/sem4/JA/FileIO/input.txt");
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
