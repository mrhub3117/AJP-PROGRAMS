import java.util.*;

public class LambdaDemo {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        MathOperation multiplication = (a, b) -> a * b;

        System.out.println("Addition: " + addition.operate(10, 5));
        System.out.println("Multiplication: " + multiplication.operate(10, 5));

        
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println("Hello, " + name));

        
        names.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted names: " + names);
    }
}



interface MathOperation {
    int operate(int a, int b);
}
