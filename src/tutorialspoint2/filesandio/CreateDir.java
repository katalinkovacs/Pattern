package tutorialspoint2.filesandio;


import java.io.File;

public class CreateDir {

    public static void main(String args[]) {

        String dirname = "C:/Katalin/Technical/JavaPractise/TestDir";
        File d = new File(dirname);

        // Create directory now.
        d.mkdirs();
    }
}


