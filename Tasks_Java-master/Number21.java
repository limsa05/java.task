import java.util.Scanner;

public class Number21 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное целое число: ");
        int num = scanner.nextInt();
        
        int nearestRound = findNearestRoundNumber(num);
        System.out.println("Ближайшее круглое число: " + nearestRound);
    }
    
    public static int findNearestRoundNumber(int num) {
        int lowerRound = (num / 10) * 10;
        int higherRound = lowerRound + 10;
        if (num - lowerRound < higherRound - num) {
            return lowerRound;
        } else {
            return higherRound;
        }

        // Находим остаток от деления на 10
        // int remainder = num % 10;
        // Если остаток меньше или равен 5, то ближайшее круглое число - это num - remainder
        // Если остаток больше 5, то ближайшее круглое число - это num + (10 - remainder)
        // if (remainder <= 5) {
        //     return num - remainder;
        // } else {
        //     return num + (10 - remainder);
        // }
    }
}
