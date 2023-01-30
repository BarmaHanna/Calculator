import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        double number1;
        double number2;
        double result;
        char operator;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        number1 = scanner.nextDouble();
        number2 = scanner.nextDouble();
        System.out.println("Enter an operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);
        switch (operator) {
            case '+': result = number1 + number2;
                break;
            case '-': result = number1 - number2;
                break;
            case '*': result = number1 * number2;
                break;
            case '/': result = number1/number2;
                if (number2 == 0) {
                    System.out.println("You have NullPointerException");
                }
                else
                    break;
            default:
                System.out.println("Enter correct operator");
                return;
        }
        System.out.println("The result is:" + result);
    }

    public double addition(double number1, double number2) {
        return number1+number2;}

    public double subtraction(double number1, double number2) {
        return number1-number2;
    }

    public double multiplication(double number1, double number2) {
        return number1*number2;
    }

    public double division(double number1, double number2) {
        return number1/number2;
    }
}



