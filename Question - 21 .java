import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        int i = 1;

        if (num > 0) {
            do {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
                i++;
            } while (i <= num);
        } else {
            System.out.println("Enter a positive number.");
        }
    }
}
