package variousExcersises;

public class Fish extends Animal{
    private String gills = "GILS";
    @Override
    public void breathe(){
        System.out.println("assimilate oxygen from athmosphere using " + this.gills);
    }//
}
