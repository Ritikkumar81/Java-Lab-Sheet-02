import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        boolean powerOfFour = false;

        if (temp > 0 && (temp & (temp - 1)) == 0) {
            int position = 0;

            while (temp > 1) {
                temp >>= 1;
                position++;
            }

            if (position % 2 == 0) {
                powerOfFour = true;
            }
        }

        System.out.println("Power of 4: " + powerOfFour);

        int toggled = num ^ (1 << 2);
        System.out.println("After toggling third bit = " + toggled);

        System.out.print("Enter number for multiplication table: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % 6 == 0) {
                continue;
            }

            if (i % 48 == 0) {
                break;
            }

            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
