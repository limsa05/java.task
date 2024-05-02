import java.util.Random;

public class Number28 {
    public static void main(String[] args) {
        int firstNumber = generateRandomNumber();
        System.out.println("Случайное положительное двузначное число: " + firstNumber);
        System.out.println("Три случайных положительных числа, меньших " + firstNumber + ":");
        for (int i = 0; i < 3; i++) {
            int randomNumber = generateRandomNumberLessThan(firstNumber);
            System.out.println(randomNumber);
        }
    }
    public static int generateRandomNumber() {
        Random random = new Random();
        // Генерируем случайное число в диапазоне от 10 до 99 (включительно)
        return random.nextInt(90) + 10;
    }
    public static int generateRandomNumberLessThan(int maxNumber) {
        Random random = new Random();
        // Генерируем случайное число в диапазоне от 1 до (maxNumber - 1)
        return random.nextInt(maxNumber - 1) + 1;
    }
}
