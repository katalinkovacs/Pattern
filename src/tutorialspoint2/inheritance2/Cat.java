package tutorialspoint2.inheritance2;


public class Cat extends Animal {

    private String furCoat;


    public Cat(String name, String breed, String furCoat){
        super(name, breed);
        this.furCoat=furCoat;
    }


    public String getFurCoat() {
        return furCoat;
    }

    public void setFurCoat(String furCoat) {
        this.furCoat = furCoat;
    }


    // MUST IMPLEMENT EAT DRINK AND TALK METHODS

    public void eat(){
        System.out.println("Cat is eating");
    }

    public String drink(){
        return ("Cat is drinking");
    }

    // MUST IMPLEMENT ABSTRACT METHOD TALK

    @Override
    public void talk(){
        System.out.println("Miau miau");
    }


}
