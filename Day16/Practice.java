package Day16;
class DivideByZeroException extends RuntimeException {
    public DivideByZeroException(String m) {
        super(m);
    } 
}
public class Practice {
    public static void divide(int a, int b) {
        if (b == 0) {
            throw new DivideByZeroException("Division by zero is not allowed.");
        }
        System.out.println("Result: " + (a / b));
    }

    public static void main(String[] args) {
        divide(10,0);
    }
}
