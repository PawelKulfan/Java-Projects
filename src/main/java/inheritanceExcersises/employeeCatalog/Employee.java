package inheritanceExcersises.employeeCatalog;
//Stwórz klasę Employee, która posiada:
//    publiczne atrybuty:
//    id – atrybut zawierający informację o numerze identyfikacyjnym pracownika,
//    firstName – atrybut określający imię pracownika,
//    lastName – atrybut określający nazwisko pracownika,
//    wage – atrybut określający stawkę godzinową pracownika,
//    konstruktor przyjmujący: id, imię, nazwisko i stawkę za godzinę,
//    metodę raiseWage(percent), której rolą będzie zwiększenie wartości atrybutu wage o podany procent.
//    Pamiętaj o sprawdzeniu czy podana wartość jest większa lub równa 0.
public class Employee {
    public int id;
    public String firstName;
    public String lastName;
    public double wage;
    public Employee (int id, String firstName, String lastName, double wage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        if (wage > 0){
            this.wage = wage;
        } else {
            System.out.println("Please provide wage higher than ziobro!");
        }
    }
    String getEmployeeInfo() {
        String currentEmployeeWage = String.format("%.2f", this.wage);
        String employeeInfo = String.format("Employee %1$s %2$s have an wage per hour of: %3$s", this.firstName, this.lastName, currentEmployeeWage);
        return employeeInfo;
    }
    double raiseWage(double percent) {
        if (percent>0) {
            this.wage = this.wage + (this.wage*(percent/100));
        } else {
            System.out.println("Please increase wage by more than ziobro!");
        }
        return this.wage;
    }
}
