import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter power of 2: ");
        int power = sc.nextInt();

        System.out.println("Multiplication = " + (num << power));
        System.out.println("Division = " + (num >> power));
    }
}
