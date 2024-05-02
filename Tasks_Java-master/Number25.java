import java.util.Scanner;

public class Number25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символ: ");
        char symbol = scanner.next().charAt(0);
        
        if (isLatinAlphabet(symbol)) {
            System.out.println("Введенный символ является буквой латинского алфавита.");
        } else {
            System.out.println("Введенный символ не является буквой латинского алфавита.");
        }
    }
    
    public static boolean isLatinAlphabet(char symbol) {
        return (symbol >= 'A' && symbol <= 'Z') || (symbol >= 'a' && symbol <= 'z');
    }
}

