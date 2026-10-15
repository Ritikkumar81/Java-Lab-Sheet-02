import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting year: ");
        int start = sc.nextInt();

        System.out.print("Enter ending year: ");
        int end = sc.nextInt();

        for (int year = start; year <= end; year++) {
            if (year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a leap year");
            }
        }
    }
}
