package tutorialspoint2.inheritance2;

/**
 * Created by kati on 7/06/2017.
 */
public class Cat extends Animal {

    private String furCoat;


    public Cat(String breed, String name, String furCoat){
        super(breed, name);
        this.furCoat=furCoat;
    }


    public String getFurCoat() {
        return furCoat;
    }

    public void setFurCoat(String furCoat) {
        this.furCoat = furCoat;
    }

    @Override
    public void eating(){
        System.out.println("Cat is eating");
    }

    @Override
    public String drinking(){
        return ("Cat is drinking");
    }

    public void purring(){
        System.out.println("purring purring");
    }


}
