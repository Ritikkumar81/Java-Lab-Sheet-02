import java.util.Random;

public class Q29 {
    public static void main(String[] args) {
        Random random = new Random();
        int num;

        while (true) {
            num = random.nextInt(100) + 1;
            System.out.println("Generated number: " + num);

            if (num % 7 == 0 && num % 13 == 0) {
                break;
            }
        }

        System.out.println("Found number = " + num);
    }
}
