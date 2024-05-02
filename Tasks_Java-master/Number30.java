import java.util.Random;
import java.util.Scanner;

public class Number30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int computerChoice = random.nextInt(3) + 1;
        
        System.out.print("Введите свой выбор (1 - камень, 2 - ножницы, 3 - бумага): ");
        int userChoice = scanner.nextInt();
        
        String computerChoiceStr = "";
        switch (computerChoice) {
            case 1:
                computerChoiceStr = "камень";
                break;
            case 2:
                computerChoiceStr = "ножницы";
                break;
            case 3:
                computerChoiceStr = "бумага";
                break;
        }
        System.out.println("Выбор компьютера: " + computerChoiceStr);
        
        if (userChoice == computerChoice) {
            System.out.println("Ничья!");
        } else if ((userChoice == 1 && computerChoice == 2) ||
                   (userChoice == 2 && computerChoice == 3) ||
                   (userChoice == 3 && computerChoice == 1)) {
            System.out.println("Вы выиграли!");
        } else {
            System.out.println("Вы проиграли!");
        }
    }
}
