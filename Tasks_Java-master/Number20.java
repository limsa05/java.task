import java.util.Scanner;

public class Number20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Введите трехзначное положительное число: ");
        int number = scanner.nextInt();

        int zeroCount = countZeros(number);

        if (zeroCount > 0) {
            System.out.println("Число содержит " + zeroCount + " нулей.");
        } else {
            System.out.println("В числе нет нулей.");
        }

        scanner.close();
    }

    public static int countZeros(int number) {
        int count = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit == 0) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
}

