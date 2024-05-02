import java.util.Scanner;

public class Number17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество учеников в классе: ");
        int students = scanner.nextInt();

        System.out.print("Введите количество стульев в классной комнате: ");
        int chairs = scanner.nextInt();

        if (students > chairs) {
            int extraChairs = students - chairs;
            System.out.println("В классе " + extraChairs + " лишних стула(-ов).");
        } else if (students == chairs) {
            System.out.println("В классе ровно столько стульев, сколько и учеников.");
        } else {
            int missingChairs = chairs - students;
            System.out.println("В классе не хватает " + missingChairs + " стула(-ов).");
        }
        scanner.close();
    }
}

