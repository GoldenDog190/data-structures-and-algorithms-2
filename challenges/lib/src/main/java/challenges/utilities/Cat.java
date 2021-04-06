package challenges.utilities;

public class Cat {
    public String name;
    String species = "Cat";

    public Cat(String name){
        super(name);
    }

    public String getSpecies(String species){
        this.species = species;
    }
    @Override
    public String toString(){
        return "Cat{" + "species" + '\'' + "}";
    }
}
