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


    // MUST IMPLEMENT EAT DRINK AND TALK METHODS

    public void eat(){
        System.out.println("Dog is eating");
    }

    public String drink(){
        return ("Dog is drinking");
    }

    // MUST IMPLEMENT ABSTRACT METHOD TALK
    @Override
    public void talk(){
        System.out.println("Vau vau");
    }
}
