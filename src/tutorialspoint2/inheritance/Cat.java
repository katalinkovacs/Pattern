package tutorialspoint2.inheritance;


public class Cat extends Animal{

    private String color;

    public Cat(boolean veg, String food, int legs) {
        super(veg, food, legs);
        this.color="White";
    }

    public Cat(boolean veg, String food, int legs,String color){
        super(veg, food, legs);
        this.color=color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
