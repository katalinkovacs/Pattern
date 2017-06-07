package tutorialspoint2.inheritance;


import java.util.ArrayList;
import java.util.List;

public class StartApp {

    public static void main( String[] args){

        Animal animal1 = new Animal(false, "bone", 4);
        Animal cat1 = new Cat(false, "chicken", 4 );
        Cat cat2 = new Cat(false, "chicken", 4 );

        animal1.eating();
        cat1.eating();
        cat2.purring();
        System.out.println(animal1.drinking());
        System.out.println(cat1.drinking());
        System.out.println(cat2.drinking());

        Animal dog1 = new Dog(false, "bones", 4, "Buksika");
        dog1.eating();

        Dog dog2 = new Dog(false, "bones", 4, "Topszli");
        dog2.getName();
        dog2.barking();

        List<Animal> animalList = new ArrayList<Animal>();

        animalList.add(animal1);
        animalList.add(cat1);
        animalList.add(cat2);
        animalList.add(dog1);
        animalList.add(dog2);













    }



}
