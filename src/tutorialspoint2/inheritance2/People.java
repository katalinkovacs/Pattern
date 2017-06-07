package tutorialspoint2.inheritance2;


public class People extends Zoo {

    private String name;

    public People(){

    }

    public People(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
