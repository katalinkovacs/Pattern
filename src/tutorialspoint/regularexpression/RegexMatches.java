package tutorialspoint.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kati on 5/06/2017.
 */
public class RegexMatches {

    // Counts the number of times the word "cat" appears in the input string

    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattie cat catalin";

    public static void main( String args[] ) {


        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);   // get a matcher object
        int count = 0;

        while(m.find()) {
            count++;
            System.out.println("Match number "+count);
            System.out.println("start(): "+m.start());
            System.out.println("end(): "+m.end());
        }
    }



}
