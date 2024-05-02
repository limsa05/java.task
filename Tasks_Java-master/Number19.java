import java.util.Scanner;

public class Number19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите трехзначное положительное число: ");
        int number = scanner.nextInt();

        // Проверяем, что число трехзначное и положительное
        if (number >= 100 && number <= 999) {
            // Вычисляем сумму цифр числа
            int digit1 = number / 100;          // Первая цифра числа
            int digit2 = (number / 10) % 10;    // Вторая цифра числа
            int digit3 = number % 10;           // Третья цифра числа
            int sum = digit1 + digit2 + digit3; // Сумма цифр числа

            // Проверяем, является ли число и его сумма четными
            if (number % 2 == 0 && sum % 2 == 0) {
                System.out.println("Число является дважды четным.");
            } else {
                System.out.println("Число не является дважды четным.");
            }
        } else {
            System.out.println("Ошибка: Введено не трехзначное положительное число.");
        }

        scanner.close();
    }
}

