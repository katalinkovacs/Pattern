package tutorialspoint2.inheritance2;

public abstract  class Zoo {

    private String name;

    public Zoo(){

    }


    public Zoo(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
