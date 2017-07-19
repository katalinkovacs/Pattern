package tutorialspoint2.inheritance2;


import java.util.ArrayList;
import java.util.List;

public class StartApp {

    public static void main(String[] args) {

        //AnimalIF animal1 = new AnimalIF("german sheppard", "Bogyo");
        Animal cat1 = new Cat("Cicuska", "sziami", "short");
        Cat cat2 = new Cat("Hobo", "perzsa", "long");

      /*
        cat1.eating();
        System.out.println(cat1.living());
        cat2.eating();
        System.out.println(cat2.living());
        System.out.println(cat1.drinking());
        System.out.println(cat2.drinking());
        cat1.drinking();
        cat2.purring();
*/

        Animal dog1 = new Dog("Hunter", "vizsla", "hunting");
        Dog dog2 = new Dog("Csicsi", "csivava", "toy");

        /*
        dog1.eating();
        dog2.eating();
        System.out.println(dog1.living());
        System.out.println(dog2.living());
        dog2.barking();
*/

        Cat cat3 = new Cat("Liderc", "hazi", "short");
        Cat cat4 = new Cat("Oliver", "hazi", "short");

        Dog dog3 = new Dog("Bogyo", "nemetjuhasz", "fun");
        Dog dog4 = new Dog("Topszli", "keverek", "fun");

        List<Animal> animalList = new ArrayList<Animal>();

        animalList.add(cat1);
        animalList.add(cat2);
        animalList.add(cat3);
        animalList.add(cat4);
        animalList.add(dog1);
        animalList.add(dog2);
        animalList.add(dog3);
        animalList.add(dog4);

        /*          ????????????????????????????????????????

        for (int counter = 0; counter < animalList.size(); counter++) {
            System.out.println(animalList.get(counter));

        }

*/

        System.out.println("----------------------------------------------------------");

        for (Animal animal : animalList) {
            //System.out.println(animal);

            if (animal instanceof Cat) {
                System.out.println("It's a cat and his name is: " + animal.getName());
                //((Cat) animal).purring();
            } else if (animal instanceof Dog) {
                System.out.println("It's a dog and his name is: " + animal.getName());
                //((Dog) animal).barking();

            } else {
                System.out.println("It's an animal");
            }
        }

        System.out.println("----------------------------------------------------------");

        People emp1 = new Employee("Katalin", true, 1);
        Employee emp2 = new Employee("Sebi", true, 2);

        People v1 = new Visitor("Krisztina", false, 10);
        Visitor v2 = new Visitor("Csanad", false, 20);


        List<People> peopleList = new ArrayList<People>();

        peopleList.add(emp1);
        peopleList.add(emp2);
        peopleList.add(v1);
        peopleList.add(v2);

        for (People people : peopleList) {

            if (people instanceof Visitor) {
                System.out.println("It's a visitor, name is: " + people.getName());
            } else if (people instanceof Employee) {
                System.out.println("It's a employee, name is: " + people.getName());
            } else {
                System.out.println("else");
            }
        }

        System.out.println("----------------------------------------------------------");

        List<Zoo> everybody = new ArrayList<Zoo>();

        everybody.add(dog1);
        everybody.add(dog2);
        everybody.add(dog3);
        everybody.add(cat1);
        everybody.add(cat2);
        everybody.add(cat3);
        everybody.add(emp1);
        everybody.add(emp2);
        everybody.add(v1);
        everybody.add(v2);

        for (Zoo z : everybody) {
            System.out.println("name is: " + z.getName());

        }

        System.out.println("----------------------------------------------------------");

        /*

        for (Zoo z : everybody) {
            //System.out.println("name is: " + z.getName());

            if (z instanceof Visitor) {
                ((Visitor) z).visiting();
            } else if (z instanceof Employee) {
                ((Employee) z).working();
            } else if (z instanceof Dog) {
                ((Dog) z).barking();
            } else if (z instanceof Cat) {
                ((Cat) z).purring();
            } else if (z instanceof Animal) {   //??????????????????????????????????
                ((Animal) z).living();
            } else {
                System.out.println("some");
            }



        }
        */

    }


}
