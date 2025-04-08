package FileIO;
import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        File infile = new File("FileIO/input.txt");
        File outfile = new File("FileIO/output.txt");

        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader(infile);
            out = new FileWriter(outfile);

            int ch;
            ch = in.read();

            while (ch != -1) {
                System.out.print((char) ch);  // Use print to avoid extra newline
                out.write(ch);
                ch = in.read();
            }

            in.close();
            out.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }
    }
}
