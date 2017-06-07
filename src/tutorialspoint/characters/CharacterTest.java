package tutorialspoint.characters;


public class CharacterTest {

    public static void main(String args[]) {

        // Escape Sequences
        System.out.println("She said \"Hello!\" to me.");

        // isUpperCase
        System.out.println(Character.isUpperCase('c'));
        System.out.println(Character.isUpperCase('C'));
        System.out.println(Character.isUpperCase('\n'));
        System.out.println(Character.isUpperCase('\t'));


        // isLowerCase
        System.out.println(Character.isLowerCase('c'));
        System.out.println(Character.isLowerCase('C'));
        System.out.println(Character.isLowerCase('\n'));
        System.out.println(Character.isLowerCase('\t'));

        // toLowerCase
        System.out.println(Character.toLowerCase('c'));
        System.out.println(Character.toLowerCase('C'));

        // toUpperCase
        System.out.println(Character.toUpperCase('c'));
        System.out.println(Character.toUpperCase('C'));

        // toString
        System.out.println(Character.toString('c'));
        System.out.println(Character.toString('C'));

    }



}
