import java.util.Scanner;

public class Number22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите шестизначный номер билета: ");
        String ticketNumber = scanner.nextLine();
        
        if (isLuckyTicket(ticketNumber)) {
            System.out.println("Этот билет - счастливый!");
        } else {
            System.out.println("Этот билет не является счастливым.");
        }
    }
    
    public static boolean isLuckyTicket(String ticketNumber) {
        if (ticketNumber.length() != 6 || !ticketNumber.matches("\\d{6}")) {
            return false;
        }
        
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;
        
        for (int i = 0; i < 6; i++) {
            int digit = Character.getNumericValue(ticketNumber.charAt(i));
            if (i < 3) {
                sumFirstHalf += digit;
            } else {
                sumSecondHalf += digit;
            }
        }
        
        return sumFirstHalf % 2 == 0 && sumSecondHalf % 2 == 0 && sumFirstHalf == sumSecondHalf;
    }
}
