package challenges.utilities;

public class Dog {
    public String name;
    String species = "Dog";

    public Dog(String name){
        super(name);
    }

    public String getSpecies(String species){
        this.species = species;
    }
    @Override
    public String toString(){
        return "Dog{" + "species" + '\'' + "}";
    }
}
