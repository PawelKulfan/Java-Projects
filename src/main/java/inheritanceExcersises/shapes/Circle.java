package inheritanceExcersises.shapes;

//Stwórz klasę Circle, która spełnia następujące wymogi:
//    dziedziczy po klasie definiującej kształt (Shape),
//    ma dodatkowy atrybut radius,
//    posiada konstruktor, przyjmujący zmienne określające wartości x, y, color i radius,
//    nadpisuje metodę kształtu – getDescription(),
//    ma metodę o nazwie getArea(), zwracającą pole powierzchni typu double,
//    posiada metodę o nazwie getCircuit(), zwracającą obwód typu double.
//Przetestuj metodę getDistance(Shape shape) na obiektach typu Circle.
public class Circle extends Shape {
    double radius;
    /*private double x;
    private double y;
    private String color;*/
    public Circle (double x, double y, String color, double radius){
        super (x, y, color);
        this.radius = radius;
    }
    @Override
    String getDescription() {
        //return String.format("X axis: %1$a, Y axis: %2$a; color: %3$s", this.x, this.y, this.color);//zwraca hashe
        return "Circle{" + "x=" + this.x + ", y=" + this.y + ", color='" + this.color + '\'' + ", radius=" + this.radius + '}';
        //return "Shape{" + "x=" + this.x + ", y=" + this.y + ", color='" + this.color + '\'' +'}';
    }
    double getArea(){
        double area = Math.PI * (Math.pow(radius, 2));
        return area;
    }
    double getCircuit(){
        double circuit = 2 * Math.PI * radius;
        return circuit;
    }
}
