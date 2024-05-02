import java.util.Scanner;

public class Number23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите порядковый номер месяца: ");
        int monthNumber = scanner.nextInt();
        
        String season = getSeason(monthNumber);
        if (season != null) {
            System.out.println("Этот месяц относится к сезону: " + season);
        } else {
            System.out.println("Введенное значение не является порядковым номером месяца.");
        }
    }
    
    public static String getSeason(int monthNumber) {
        String season = null;
        switch(monthNumber) {
            case 1:
            case 2:
            case 12:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                break;
        }
        return season;
    }
}

