
interface MathOperation {
    int operate(int a, int b);
}

public class Lambda {
    public static void main(String[] args) {
        
        MathOperation addition = (int a, int b) -> a + b;
        System.out.println("Addition: " + addition.operate(5, 3));

        
        MathOperation subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtraction.operate(5, 3));

       
        MathOperation multiplication = (a, b) -> {
            return a * b;
        };
        System.out.println("Multiplication: " + multiplication.operate(5, 3));

        
        MathOperation division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return a / b;
        };
        System.out.println("Division: " + division.operate(10, 2));
    }
}
