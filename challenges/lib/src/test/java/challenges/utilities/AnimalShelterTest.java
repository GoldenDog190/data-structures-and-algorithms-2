package challenges.utilities;

import org.junit.Test;

public class AnimalShelterTest {
    @Test
    public void testAnimalShelter = new AnimalShelter();
    Dog dogTest = new Dog("Ginger");
    Cat catTest = new Cat("Lucy");
    Dog dogTest2 = new Dog("Ginger2");
    Cat catTest2 = new Cat("Lucy2");
    Dog dogTest3 = new Dog("Ginger3");
    Cat catTest3 = new Cat("Lucy3");

    testAnimalShelter.enqueue(dogTest);
    testAnimalShelter.enqueue(catTest);
    testAnimalShelter.enqueue(dogTest2);
    testAnimalShelter.enqueue(catTest2);
    testAnimalShelter.enqueue(dogTest3);
    testAnimalShelter.enqueue(catTest3);

    System.out.println(testAnimalShelter.dequeue("DOG"));
    System.out.println(testAnimalShelter);


}
