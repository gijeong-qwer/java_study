import java.util.*;

public class App {
    public static void main(String[] args) {
        // 조깅 입력세팅
        String string = new String();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        int x = scanner.nextInt();

        System.out.println(a);
        System.out.println(x);
        double taka = b / (double) (a + c) * x;
        double Aoh = d / (double) (e + f) * x;

        if (taka > Aoh) {
            System.out.println("taka win");
        } else if (taka == Aoh) {
            System.out.println("same same");
        } else {
            System.out.println("Aoh win");
        }

    }
}
// x,y 2명
// x b미터 *a초 , 시간 a+c
// y e미터 *d초 , 시간 d+f
// X 초가 지난후 둘중 누가 더 앞인가
