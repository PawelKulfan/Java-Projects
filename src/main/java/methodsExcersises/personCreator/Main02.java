package methodsExcersises.personCreator;
//W pliku Main02.java umieść w metodzie main kod, który utworzy obiekt klasy Person
// o nazwie person, a następnie ustawi za pomocą wcześniej utworzonych metod wszystkie
// atrybuty klasy.
public class Main02 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Paweł");
        person1.setSurname("Kulfan");
        person1.setAge(23);
        person1.setGender('F');
        person1.getFullName();
        System.out.println(person1);
        person1.increaseAge();
        System.out.println(person1);
        Person person2 = new Person();
        person2.getFullName();
        System.out.println(person2);
    }
}
