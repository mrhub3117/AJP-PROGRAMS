public class Main {
    public static void main(String[] args) {
        
        int primitiveValue = 10;
        Integer wrapperValue = primitiveValue;  
        System.out.println("Autoboxed Integer: " + wrapperValue);

        Integer anotherWrapper = 20;
        int anotherPrimitive = anotherWrapper;  
        System.out.println("Unboxed int: " + anotherPrimitive);
    }
}
