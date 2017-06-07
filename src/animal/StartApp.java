package animal;

import java.util.ArrayList;
import java.util.List;

public class StartApp {

    public static void main(String[] args) {


        Cat cat = new Cat("Hobo", false, "milk", 4, "black");
        Dog dog = new Dog("Bogyo", false, "meat", 4);

        System.out.println("Cat is Vegetarian?" + cat.isVegetarian());
        System.out.println("Cat eats " + cat.getEats());
        System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
        System.out.println("Cat color is " + cat.getColor());

        System.out.println("Dog is Vegetarian?" + dog.isVegetarian());
        System.out.println("Dog eats " + dog.getEats());
        System.out.println("Dog has " + dog.getNoOfLegs() + " legs.");
        System.out.println("Dog color is " + dog.getColor());

        //cat.talk();
        dog.talk();


        List<Dog> dogList = new ArrayList<Dog>();
        Dog d1 = new Dog("Buksi", false, "bone", 4);
        dogList.add(d1);
        dogList.add(new Dog("Beno", false, "chicken", 4, "grey"));
        dogList.add(new Dog("Jeno", false, "beef", 4, "red"));


        System.out.println(dogList.get(0).getName());
        System.out.println(dogList.get(0).isVegetarian());
        System.out.println(dogList.get(0).getEats());
        System.out.println(dogList.get(0).getNoOfLegs());
        System.out.println(dogList.get(0).getColor());
/*
        for (Dog d : dogList.getDogs()){

            System.out.println(d.getName());
        }
*/

    }


}
