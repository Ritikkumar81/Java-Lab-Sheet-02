import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter four numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int smallest = (a < b ? a : b);
        smallest = (smallest < c ? smallest : c);
        smallest = (smallest < d ? smallest : d);

        System.out.println("Smallest = " + smallest);
    }
}
