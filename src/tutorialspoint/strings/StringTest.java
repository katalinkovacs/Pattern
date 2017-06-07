package tutorialspoint.strings;


public class StringTest {

    public static void main(String args[]) {

        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
        String helloString = new String(helloArray);
        System.out.println( helloString );

        char[] sebastian = { 's', 'e', 'b', 'a', 's', 't', 'i', 'a', 'n' };
        String sebastianString = new String(sebastian);
        System.out.println( sebastianString );

        System.out.println("-------------------------------------------------");


        String sebiFullName = "Sebastian Kovacs";
        int lengthOfName = sebiFullName.length();
        System.out.println( "String Length is : " + lengthOfName );
        System.out.println( "String Length is : " + sebiFullName.length() );  // ????????????????????????????

        System.out.println("-------------------------------------------------");

        String Str1 = new String("Welcome to Tutorialspoint.com");
        String Str2 = new String("Tutorials" );

        System.out.print("String Length :" );
        System.out.println(Str1.length());

        System.out.print("String Length :" );
        System.out.println(Str2.length());

        System.out.println("-------------------------------------------------");

        String Str = new String("Welcome to Tutorialspoint.com");
        String SubStr1 = "Tutorials";
        System.out.print("Found Last Index :" );
        System.out.println( Str.lastIndexOf( SubStr1, 15 ));

        System.out.println("-------------------------------------------------");

        // String lastIndexOf() fromIndex   -->  ??????????????????????????????????????????????????????????????
        String katalin = new String("Aki elment az erdobe Katalinnal annak elment az esze.");
        String subKatalin = "Katalin";
        System.out.print("Found Last Index :" );
        System.out.println( katalin.lastIndexOf( subKatalin));

        System.out.println("-------------------------------------------------");


        String String1 = new String("Katalin Kovacs");

        System.out.print("Return Value :" );
        System.out.println(String1.replace('a', 'U'));

        System.out.print("Return Value :" );
        System.out.println(String1.replace('K', 'j'));




    }
}
