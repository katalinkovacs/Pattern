package tutorialspoint.dogexample;

/**
 * Created by kati on 5/06/2017.
 */
public class DogTest {

    public  static void main(String[] args){

        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Buksika", "black", 4);
        Dog dog3 = new Dog("mixed", 8);

        System.out.println("dog1 name: " + dog1.getName());
        System.out.println("dog1 color: " + dog1.getColor());
        System.out.println("dog1 age: " + dog1.getAge());

        System.out.println("dog2 name: " + dog2.getName());
        System.out.println("dog2 color: " + dog2.getColor());
        System.out.println("dog2 age: " + dog2.getAge());

        dog1.setName("Bogyo");
        dog1.setColor("Red");
        dog1.setAge(11);

        System.out.println("dog1 name: " + dog1.getName());
        System.out.println("dog1 color: " + dog1.getColor());
        System.out.println("dog1 age: " + dog1.getAge());

        System.out.println("dog3 name: " + dog3.getName());
        System.out.println("dog3 color: " + dog3.getColor());
        System.out.println("dog3 age: " + dog3.getAge());

        dog1.barking();
        //dog1.sleeping();
        //System.out.println(dog1.getName() + " is ");
        //dog1.sleeping();
        System.out.println(dog1.getName() + "  " + dog1.sleeping());  //????????????????????
        dog1.printDogDetails();   //SYSOUT?????????   -->
        //System.out.println(dog1.printDogDetails());



}

}
