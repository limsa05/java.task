import java.util.Scanner;
public class Number13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number > 10) {
            System.out.println(number + ">10");
        } else if (number == 10) {
            System.out.println(number + "==10");
        } else {
            System.out.println(number + "<10");
        }

        scanner.close();
    }       
}
