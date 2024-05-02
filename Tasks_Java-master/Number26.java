import java.util.Scanner;

public class Number26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое имя: ");
        String name1 = scanner.nextLine();
        System.out.print("Введите второе имя: ");
        String name2 = scanner.nextLine();
        
        if (areNamesEqual(name1, name2)) {
            System.out.println("Эти люди тезки.");
        } else {
            System.out.println("Эти люди не тезки.");
        }
    }
    
    public static boolean areNamesEqual(String name1, String name2) {
        return name1.equalsIgnoreCase(name2);
    }
}
