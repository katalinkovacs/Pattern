package animal;

public class Cat extends Animal{

    private String color;

    public Cat(String name, boolean veg, String food, int legs) {
        super(name, veg, food, legs);
        this.color="White";
    }

    public Cat(String name,boolean veg, String food, int legs,String color){
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
        System.out.println("Miau");
    }

}