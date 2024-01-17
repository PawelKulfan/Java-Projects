package inheritanceExcersises.employeeCatalog;
//Stwórz klasę HourlyEmployee, reprezentującą pracownika, któremu pracodawca płaci za godziny. Klasa ma spełniać następujące wymogi:
//    ma dziedziczyć po klasie Employee,
//    posiadać dodatkową metodę calculatePayment(hours), która będzie zwracała kwotę do wypłacenia pracownikowi za liczbę wypracowanych godzin.
public class HourlyEmployee extends Employee {
    public HourlyEmployee(int id, String firstName, String lastName, double wage){
        super(id, firstName, lastName, wage);
    }
    double calculatePayment(int hours) {
        double payment = hours * wage;
        return payment;
    }
}
