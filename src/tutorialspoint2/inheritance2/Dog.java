package tutorialspoint2.inheritance2;


public class Dog extends Animal{

    private String usedFor;



    public  Dog (String name, String breed, String usedFor ){
        super(name, breed);
        this.usedFor = usedFor;

    }

    public String getUsedFor() {
        return usedFor;
    }

    public void setUsedFor(String usedFor) {
        this.usedFor = usedFor;
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
