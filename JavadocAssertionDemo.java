5)assertions
/**
 * This class demonstrates Javadoc annotations and assertions in Java.
 * @author 
 * @version 
 */
public class JavadocAssertionDemo {

    /**
     * Calculates the square of a number.
     * @param number The number to be squared.
     * @return The square of the given number.
     */
    public static int square(int number) {
        assert number >= 0 : "Number must be non-negative"; // Assertion to check input validity
        return number * number;
    }

    /**
     * Main method to demonstrate assertions and Javadoc usage.
     * @param args Command-line arguments (unused).
     */
    public static void main(String[] args) {
        System.out.println("Square of 5: " + square(5));
        
        // Assertion example (enable with -ea JVM option)
        System.out.println("Square of -3: " + square(-3)); // This triggers assertion failure
    }
}


cmd for javadoc:
javadoc dir/filename.java
