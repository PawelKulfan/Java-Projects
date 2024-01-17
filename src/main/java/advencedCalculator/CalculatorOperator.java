package advencedCalculator;

public class CalculatorOperator {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator("First Calc");
        Calculator calculator2 = new Calculator("Second Calc");
        calculator1.add(3, 5);
        calculator1.subtraction(9, 5);
        calculator2.add(6, 1);
        calculator2.subtraction(3, 7);
        calculator1.printOperations();
        calculator2.printOperations();
        calculator1.multiply(3, 3);
        calculator1.divide(4, 2);
        calculator1.divide(5, 0);
        calculator2.multiply(5, 3);
        calculator2.divide(9, 4);
        calculator2.divide(4, 0);
        calculator1.printOperations();
        calculator2.printOperations();
        AdvencedCalculator calculator3 = new AdvencedCalculator("First Advenced Calculator");
        calculator3.add(5, 8);
        calculator3.divide(4, 2);
        calculator3.power(3, 2);
        calculator3.root(125, 3);
        calculator3.printOperations();
    }
}
