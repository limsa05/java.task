import java.util.Scanner;

public class Number10{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое положительное число: ");
        int number = scanner.nextInt();

        if (number >= 100) {
            number -= 1;
            System.out.println("Результат: " + number);
        } else {
            System.out.println("Число не является трехзначным и/или положительным.");
        }
        
        scanner.close();
    }
}
