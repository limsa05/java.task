import java.util.Scanner;

public class Number14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число учеников: ");
        int numberOfStudents = scanner.nextInt();

        System.out.print("Введите число стульев: ");
        int numberOfChairs = scanner.nextInt();

        if (numberOfStudents > numberOfChairs) {
            System.out.println("Стульев больше, чем от учеников");
        } else if (numberOfStudents == numberOfChairs) {
            System.out.println("Стульев столько же, сколько и учеников");
        } else {
            System.out.println("Учеников больше, чем стульев");
        }
        scanner.close();
    }
}
