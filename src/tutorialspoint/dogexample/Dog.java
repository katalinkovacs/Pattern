package tutorialspoint.dogexample;


public class Dog {

    //VARIABLES
    private String name;
    private  String color;
    private int age;


    //CONSTRUCTORS
    public Dog(){

    }

    public Dog(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;

    }

    public Dog(String color, int age){
        this.name = "John Doe";
        this.color = color;
        this.age = age;

    }


    /*public Dog(String name, int age){
        this.name = name;
        this.color = "white";
        this.age = age;

    }*/





    //GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //METHODS

    public void barking() {
        System.out.println("I am barking");
    }

    public void hungry() {
        System.out.println("Hungry");
    }


    //??????????????????????????????????
    public String sleeping() {

        return "is sleeping";
    }


    public void printDogDetails(){
        System.out.println("Name is " +name);
        System.out.println("Color is " +color);
        System.out.println("Age is " +age);
    }

}
