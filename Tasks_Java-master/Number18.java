import java.util.Scanner;

public class Number18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Первое число (" + num1 + ") больше второго числа (" + num2 + ").");
        } else if (num1 < num2) {
            System.out.println("Второе число (" + num2 + ") больше первого числа (" + num1 + ").");
        } else {
            System.out.println("Оба числа (" + num1 + " и " + num2 + ") равны.");
        }

        scanner.close();
    }
}
