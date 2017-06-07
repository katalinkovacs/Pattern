package tutorialspoint2.filesandio;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

    public static void main(String args[]) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            //in = new FileReader("input.txt");
            in = new FileReader("C:/Katalin/Technical/JavaPractise/input.txt");

            out = new FileWriter("C:/Katalin/Technical/JavaPractise/output.txt");

            int c;

            while ((c = in.read()) != -1) {
                out.write( c );
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
