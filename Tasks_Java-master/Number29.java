import java.util.Scanner;
import java.util.Random;

public class Number29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите нижний диапазон: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Введите верхний диапазон: ");
        int upperBound = scanner.nextInt();
        if (upperBound <= lowerBound) {
            System.out.println("Ошибка: Верхний диапазон должен быть больше нижнего.");
            return;
        }
        Random random = new Random();
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        System.out.println("Сгенерированное случайное число: " + randomNumber);
        
        System.out.print("Введите число: ");
        int userNumber = scanner.nextInt();
        if (userNumber == randomNumber) {
            System.out.println("Поздравляем! Вы угадали число.");
        } else {
            System.out.println("К сожалению, вы не угадали число.");
        }
    }
}
