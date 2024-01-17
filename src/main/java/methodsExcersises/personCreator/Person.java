package methodsExcersises.personCreator;
//Utwórz klasę Person, dodaj w niej atrybuty:
//    name,
//    surname,
//    age,
//    gender.
//Wszystkie atrybuty mają być prywatne i mają mieć ustawione wartości domyślne.
//Dodaj metody:
//    setName,
//    setSurname,
//    setAge,
//    setGender,
//które ustawią atrybuty klasy zgodnie z nazwą, na którą wskazują. Np. setName – ustawia atrybut name.
//
class Person {
    private String name = "Imię domyślne";
    private String surname = "Nazwisko domyślne";
    private int age = 45;
    private char gender = 'M';
    public void setName (String name){
        this.name = name;
    }
    public void setSurname (String surname){
        this.surname = surname;
    }
    public void setAge (int age){
        this.age = age;
    }
    public void setGender (char gender){
        this.gender = gender;
    }
    public void getFullName (){
        System.out.println(this.name + " " + this.surname);
    }
    public int increaseAge (){
        this.age++;
        return age;
    }
    public String toString () {
        return this.name + " " + this.surname + " of age: " + this.age + " , of sex: " + this.gender;
    }
}
