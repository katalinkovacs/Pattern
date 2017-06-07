package tutorialspoint2.inheritance;

/**
 * Created by kati on 7/06/2017.
 */
public class Dog extends Animal {

    private String name;

    public  Dog (){

    }

    public  Dog (boolean veg, String food, int legs, String name ){
        super(veg, food, legs);
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void eating(){
        System.out.println("Dog is eating");
    }

    @Override
    public String drinking(){
        return ("Dog is drinking");
    }

    public void barking(){
        System.out.println("Vau vau");
    }
}
