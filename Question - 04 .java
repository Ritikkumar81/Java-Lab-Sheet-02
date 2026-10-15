import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter visitor count: ");
        int count = sc.nextInt();

        System.out.println("Original count = " + count);
        System.out.println("Postfix value = " + count++);
        System.out.println("After postfix = " + count);
        System.out.println("Prefix value = " + ++count);
        System.out.println("Final count = " + count);
    }
}
