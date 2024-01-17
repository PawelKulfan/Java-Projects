package inheritanceExcersises.shapes;
//Stwórz klasę Shape, która będzie posiadała:
//    prywatne atrybuty x i y (określające środek tego kształtu) oraz color,
//    konstruktor, przyjmujący zmienne określające wartości x, y i color,
//    metodę o nazwie getDescription(), wypisującą informacje o tym kształcie, zwracającą wartość typu String,
//    metodę o nazwie getDistance(Shape shape), zwracającą odległość od środka innego kształtu, wynik ma być typu double.
//Sprawdź, co się dzieje, kiedy zmieniasz dostęp do poszczególnych funkcji z publicznego na prywatny.
public class Shape {
    double x;
    double y;
    String color;
    public Shape (double x, double y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }
    String getDescription() {
        //return String.format("X axis: %1$a, Y axis: %2$a; color: %3$s", this.x, this.y, this.color);//zwraca hashe
        return "Shape{" + "x=" + this.x + ", y=" + this.y + ", color='" + this.color + '\'' +'}';
    }
    protected double getDistance(Shape shape){
        double xDistance = this.x - shape.x;
        double yDistance = this.y - shape.y;
        return xDistance + yDistance;
    }

}
