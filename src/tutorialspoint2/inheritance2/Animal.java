package tutorialspoint2.inheritance2;


public abstract class Animal extends Zoo{

    private String breed;
    //private String name;
    //private String eats;
    //private int noOfLegs;

    //public Animal(){}


    public Animal(String name, String breed){
        super(name);
        this.breed = breed;

    }


/*
    public Animal(String name, String breed){
        this.breed = breed;

    }

*/
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }






    public void eating(){
        System.out.println("Animal is eating");
    }

    public String drinking(){
        return "Animal is drinking";
    }

    public String living(){
        return "Animal is living";
    }
}
