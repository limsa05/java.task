import java.util.Scanner;

public class Number12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();

        int digit1 = number / 100; // Получаем первую цифру числа
        int digit2 = (number / 10) % 10; // Получаем вторую цифру числа
        int digit3 = number % 10; // Получаем третью цифру числа

        if (digit1 % 2 == 0 && digit2 % 2 == 0 && digit3 % 2 == 0) {
            System.out.println("Число является четнокрасивым.");
        } else {
            System.out.println("Число не является четнокрасивым.");
        }
        scanner.close();
    }
}
