package variousExcersises;

public class Mammals extends Animal {
    private String lungs = "LUNG";
    @Override//to jest tylko zasygnalizowanie, że tu się coś będzie zmieniać
    public void breathe(){//to przykrywa użycie metody breath na klasę o jeden wyższej, bez tego szliśmyby od najbardziej specjalistycznej do najbardziej ogólnej metody
        System.out.println("assimilate oxygen from athmosphere using " + this.lungs);
    }//możemy dodać elementy rozszerząjące, ale nie możemy wyłączyć parametrów z klasy bardziej ogólnego poziomu
    public void feedMilk(){
        System.out.println("Pije mleko matki");
    }
}
