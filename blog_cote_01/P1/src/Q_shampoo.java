import java.util.Scanner;

public class Q_shampoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int k = v % (a + b + c);
        if (k >= a + b) {
            System.out.println("T");
        } else if (k >= a) {
            System.out.println("M");
        } else {
            System.out.println("F");
        }

    }
}
