import java.util.Random;

public class Number27 {
    public static void main(String[] args) {
        int randomNumber = generateRandomNumber();
        System.out.println("Случайное положительное двузначное число: " + randomNumber);
    }
    
    public static int generateRandomNumber() {
        Random random = new Random();
        // Генерируем случайное число в диапазоне от 10 до 99 (включительно)
        return random.nextInt(90) + 10;
    }
}
