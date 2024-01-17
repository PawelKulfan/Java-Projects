package inheritanceExcersises.employeeCatalog;
//Stwórz klasę SalariedEmployee reprezentującą pracownika, z którym pracodawca ma umowę miesięczną. Klasa powinna:
//    dziedziczyć po klasie Employee,
//    mieć dodatkową metodę calculatePayment(), która będzie zwracała kwotę do wypłacenia pracownikowi za miesiąc
//    (dla uproszczenia możemy założyć, że w każdym miesiącu jest 190 godzin pracujących – użyj final static).
public class SalariedEmployee extends Employee {
    final static int hoursPerMonth = 190;

    public SalariedEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }
    void calculatePayment() {
        double payment = this.wage * hoursPerMonth;
        String currentEmployeePayment = String.format("%.2f", payment);
        System.out.println(String.format("Employee %1$s %2$s have a monthly salary of: %3$s", this.firstName, this.lastName, currentEmployeePayment));
    }
}