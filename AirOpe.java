public class AirOpe{
    public static void main(String[] args) {
        // Declare variables
        int a = 10, b = 3;
        double x = 10.5, y = 3.2;
        
        // Addition
        int sum = a + b;
        double sumDouble = x + y;
        System.out.println("Addition (int): " + a + " + " + b + " = " + sum);
        System.out.println("Addition (double): " + x + " + " + y + " = " + sumDouble);

        // Subtraction
        int difference = a - b;
        double differenceDouble = x - y;
        System.out.println("Subtraction (int): " + a + " - " + b + " = " + difference);
        System.out.println("Subtraction (double): " + x + " - " + y + " = " + differenceDouble);

        // Multiplication
        int product = a * b;
        double productDouble = x * y;
        System.out.println("Multiplication (int): " + a + " * " + b + " = " + product);
        System.out.println("Multiplication (double): " + x + " * " + y + " = " + productDouble);

        // Division
        int quotient = a / b;
        double quotientDouble = x / y;
        System.out.println("Division (int): " + a + " / " + b + " = " + quotient);
        System.out.println("Division (double): " + x + " / " + y + " = " + quotientDouble);

        // Modulus (remainder)
        int remainder = a % b;
        double remainderDouble = x % y;
        System.out.println("Modulus (int): " + a + " % " + b + " = " + remainder);
        System.out.println("Modulus (double): " + x + " % " + y + " = " + remainderDouble);
    }
}

