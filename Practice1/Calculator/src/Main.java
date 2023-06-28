import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double b = scanner.nextDouble();
        System.out.println("Введите операцию (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println("Результат сложения: " + (a + b));
                break;

            case '-':
                System.out.println("Результат вычитания: " + (a - b));
                break;

            case '*':
                System.out.println("Результат умножения: " + (a * b));
                break;

            case '/':
                if (b != 0) {
                    System.out.println("Результат деления: " + (a / b));
                } else {
                    System.out.println("Ошибка: Деление на ноль невозможно.");
                }
                break;

            default:
                System.out.println("Ошибка: Неверная операция. Используйте одну из следующих операций: +, -, *, /");
                break;
        }
    }
}
