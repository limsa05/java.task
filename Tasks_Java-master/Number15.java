import java.util.Scanner;

public class Number15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            System.out.print(num1 + ", ");
            if (num2 <= num3) {
                System.out.print(num2 + ", ");
                System.out.println(num3);
            } else {
                System.out.print(num3 + ", ");
                System.out.println(num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.print(num2 + ", ");
            if (num1 <= num3) {
                System.out.print(num1 + ", ");
                System.out.println(num3);
            } else {
                System.out.print(num3 + ", ");
                System.out.println(num1);
            }
        } else {
            System.out.print(num3 + ", ");
            if (num1 <= num2) {
                System.out.print(num1 + ", ");
                System.out.println(num2);
            } else {
                System.out.print(num2 + ", ");
                System.out.println(num1);
            }
        }

        scanner.close();
    }
}
