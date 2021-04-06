package challenges.utilities;

public class Animal {
    private final String name;
    String species = "Animal";
    private String animal;

    public Animal(String name){
        this.name = name;
    }


    @Override
    public String toString(){
        return "Animal{" + "name" + name + '\'' + "}";
    }
}
