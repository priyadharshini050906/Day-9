,
class Calculator {

    void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    void sub(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    void division(int a, int b) {
        System.out.println("Division: " + (a / b));
    }

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        obj.add(10, 5);
        obj.sub(10, 5);
        obj.multiply(10, 5);
        obj.division(10, 5);
    }
}
