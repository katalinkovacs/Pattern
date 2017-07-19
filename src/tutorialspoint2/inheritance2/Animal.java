package tutorialspoint2.inheritance2;


public abstract class Animal extends Zoo implements AnimalInterFace{

    private String breed;

    public Animal(String name, String breed){
        super(name);
        this.breed = breed;
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public abstract void talk();


}
