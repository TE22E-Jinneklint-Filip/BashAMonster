import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 3;
        int max = 10;
        int randomNumber = random.nextInt(max - min + 1) + min;
    }
}
