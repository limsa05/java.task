import java.util.Scanner;

public class Number24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное трехзначное число: ");
        int number = scanner.nextInt();
        
        int differentDigits = countDifferentDigits(number);
        System.out.println("Число различных цифр: " + differentDigits);
    }
    
    public static int countDifferentDigits(int number) {
        if (number < 100 || number > 999) {
            System.out.println("Введено неверное число.");
            return -1;
        }
        
        int[] digits = new int[10]; 
        int count = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digits[digit] == 0) {
                count++;
            }
            digits[digit]++;
            number /= 10;
        }
        
        return count;
    }
}

