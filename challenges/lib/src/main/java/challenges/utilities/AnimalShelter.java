package challenges.utilities;

import challenges.stacksandqueues.Queue;

import java.util.Locale;

public class AnimalShelter<T> {
    Queue dogs = new Queue<T>();
    Queue cats = new Queue<T>();

    public void enqueue(T animal) throws ClassNotFoundException {
        if(animal instanceof Dog){
            dogs.enqueue(animal);
            System.out.println(((Dog)animal).name + " dog has been added");
        } else if (animal instanceof Cat){
            cats.enqueue(animal);
            System.out.println(((Cat)animal).name + " cat has been added");
        }
        return;

    }

    public T dequeue(String critter){
        String lower = critter.toLowerCase(Locale.ROOT);

        if(lower.equals("dog")){
            return dogs.dequeue();
        }else if(lower.equals("cat")){
            return cats.dequeue();
        }else{
            return null;
        }
    }
}
@Override
public String toString() {
    String s = "Animal Shelter{" + "dogs" + dogs + "cat" + cats + '\'' + "}";
    return s;
}
}
