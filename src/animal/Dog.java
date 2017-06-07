package animal;


import java.util.List;

public class Dog extends Animal {

    private String color;

    private List<Dog> dogs;


    public Dog (String name, boolean veg, String food, int legs) {
        super(name, veg, food, legs);
        this.color="Red";
    }

    public Dog (String name, boolean veg, String food, int legs,String color){
        super(name, veg, food, legs);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void talk(){
        System.out.println("Vau");
    }

    public List<Dog> getDogs() {
        return dogs;
    }


}
