/* import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите вес: ");
        double operand1 = scanner.nextDouble();
        System.out.print("Введите рост в метрах (например 1,70): ");
        double operand2 = scanner.nextDouble();
        double result = (operand1 / (operand2*operand2));

        System.out.println("Ваш индекс массы: " + result);
        scanner.close();
        if (result < 16) System.out.println("Выраженный дефицит массы тела");
        else if (result > 16 && result < 18.5) System.out.println("Недостаточная (дефицит) масса тела");
        else if (result > 18.5 && result < 25) System.out.println("Норма");
        else if (result > 25) System.out.println("Ожирение");
        else System.out.println("Данные введены некорректно");
    }
}


*/