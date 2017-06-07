package tutorialspoint2.inheritance2;


import java.util.ArrayList;
import java.util.List;

public class StartAnimal2 {

    public static void main( String[] args){

        //Animal animal1 = new Animal("german sheppard", "Bogyo");
        Animal cat1 = new Cat("sziami", "Cicuska", "short" );
        Cat cat2 = new Cat("perzsa", "Hobo", "long" );

        cat1.eating();
        System.out.println(cat1.living());
        cat2.eating();
        System.out.println(cat2.living());
        System.out.println(cat1.drinking());
        System.out.println(cat2.drinking());
        cat1.drinking();
        cat2.purring();


        Animal dog1 = new Dog("vizsla", "vadasz", "hunting" );
        Dog dog2 = new Dog("csivava", "Csicsi", "toy" );

        dog1.eating();
        dog2.eating();
        System.out.println(dog1.living());
        System.out.println(dog2.living());
        dog2.barking();


        Cat cat3 = new Cat("hazi", "Liderc", "short" );
        Cat cat4 = new Cat("hazi", "Oliver", "short" );

        Dog dog3 = new Dog("nemetjuhasz", "Bogyo", "fun" );
        Dog dog4 = new Dog("keverek", "Topszli", "fun" );

        List<Animal> animalList = new ArrayList<Animal>();

        animalList.add(cat1);
        animalList.add(cat2);
        animalList.add(cat3);
        animalList.add(cat4);
        animalList.add(dog1);
        animalList.add(dog2);
        animalList.add(dog3);
        animalList.add(dog4);

        for (int counter = 0; counter < animalList.size(); counter++) {
            System.out.println(animalList.get(counter));

            



        }

        System.out.println();

        for (Animal animal : animalList) {
            //System.out.println(animal);

            if (animal instanceof  Cat) {
                System.out.println("It's a cat and his name is: " + animal.getName());
                //((Cat) animal).purring();
            }

            if (animal instanceof  Dog) {
                System.out.println("It's a dog and his name is: " + animal.getName());
                //((Dog) animal).barking();

            }

        }





















    }


}
