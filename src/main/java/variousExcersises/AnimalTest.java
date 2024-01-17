package variousExcersises;

public class AnimalTest {
    public static void main(String[] args) {
        Animal someAnimal = new Animal();
        someAnimal.breathe();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();
        dog.breathe();
        dog.ageInSeconds = 45;
        System.out.println(dog.ageInSeconds);
        cat.breathe();
        cat.feedMilk();
        fish.breathe();
        cat.meow();

        //polymorphism //rzutowanie klas w górę
        Mammals someMammal = cat;//rzutowanie w górę(upcasting), ten obiekt nie będzie mógł używać parametrów z cat
        Mammals mammal2 = new Dog();//Java zna realny typ obiektu mammal2 czyli mammal i animal
        Animal animal2 = new Dog();//rzutowanie w górę, ten obiekt nie będzie mógł używać parametrów z dog, a tylko Animal
        //to wszystko działa, bo cat i dog należą i do animali i do mammali
        if (cat instanceof Cat){
            System.out.println("Cat is a cat");
        }
        if (cat instanceof Animal){
            System.out.println("Cat is a animal");
        }
        if (cat instanceof Mammals){
            System.out.println("Cat is a mammal");
        }
        if (animal2 instanceof Cat){
            System.out.println("animal2 is a Cat");
        }
        else {
            System.out.println("animal2 is not a Cat!");
        }
        if (animal2 instanceof Mammals){
            System.out.println("animal2 is a Mammal");
        }
        if (animal2 instanceof Animal){
            System.out.println("animal2 is a Animal");
        }
        System.out.println("-------- zoo example");
        Animal[] animalsInZoo1 = {dog, cat, dolphin, fish, new Spider()};
        zooMakeAnimalsBreatheAndShowTheirAge(animalsInZoo1);
    }

    static void zooMakeAnimalsBreatheAndShowTheirAge(Animal[] animals) {
        for (int i=0; i< animals.length; i++) {
            System.out.println("animal #" + i);
            Animal a = animals[i];
            System.out.println("type is: " + a.getClass().getSimpleName());
            a.breathe(); // calls breathe() overriden in the REAL inheriting type
            System.out.println("age=" + a.ageInSeconds);
        }
    }
}
