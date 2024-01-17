package methodsExcersises.personCreator;
//Utwórz klasę Product, dodaj w niej atrybut name.
//Dodaj metody setName (ustawiającą name) oraz getName (zwracającą name).
public class Product {
    static String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
