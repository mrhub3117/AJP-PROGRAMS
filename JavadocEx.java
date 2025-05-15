/**
 * A simple program demonstrating basic arithmetic operations.
 */
public class Calculator {

    /**
     * Adds two numbers.
     * @param a First number
     * @param b Second number
     * @return The sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts one number from another.
     * @param a First number
     * @param b Second number
     * @return The result of a - b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     * @param a First number
     * @param b Second number
     * @return The product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides one number by another.
     * @param a Numerator
     * @param b Denominator
     * @return The quotient of a / b
     * @throws ArithmeticException if b is zero
     */
    public double divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return (double) a / b;
    }

    /**
     * Main method to demonstrate calculations.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
        System.out.println("Division: " + calc.divide(10, 5));
    }
}
