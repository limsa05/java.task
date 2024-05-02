import java.util.Scanner;

public class Number16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (number < 0) {
            int square = number * number;
            System.out.println("Квадрат введенного числа: " + square);
        } else {
            System.out.println("Ошибка: введено неотрицательное число.");
        }

        scanner.close();
    }
}

