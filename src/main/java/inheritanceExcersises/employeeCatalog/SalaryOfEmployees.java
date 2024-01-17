package inheritanceExcersises.employeeCatalog;

public class SalaryOfEmployees {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Paweł", "Kulfan", 15.23);
        System.out.println("Wage after increase: " + String.format("%.2f", employee1.raiseWage(1.5)));
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee(2, "Andrzej", "Grabowski", 12.98);
        System.out.println("Wage of employee for hours is: " + String.format("%.2f", hourlyEmployee1.calculatePayment(68)));
        System.out.println(employee1.getEmployeeInfo());
        System.out.println(hourlyEmployee1.getEmployeeInfo());
        SalariedEmployee salariedEmployee1 = new SalariedEmployee(3, "Stefan", "Nowotko", 9.99);
        salariedEmployee1.calculatePayment();
    }
}
