public class Calculator {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.add(5, 3));
    }
}
