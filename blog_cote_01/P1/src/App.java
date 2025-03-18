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

        // System.out.println(a);
        // System.out.println(x);

        double timet = (a+c)*x;
        double taka = b * a / (double) (a + c) * x;
        double Aoh = d * e / (double) (e + f) * x;

        if (taka > Aoh) {
            System.out.println("Takahashi");
        } else if (taka == Aoh) {
            System.out.println("Draw");
        } else {
            System.out.println("Aoki");
        }

    }
}
// x,y 2명
// x b미터 *a초 , 시간 a+c
// y e미터 *d초 , 시간 d+f
// X 초가 지난후 둘중 누가 더 앞인가
// 문제 설명
// 타카하시와 아오키는 조깅을 하기로 결정했다.
// 다카하시는 다음을 반복한다: "초속 B미터로 A초간 걷고 C초간 휴식한다.”
// 아오키는 다음을 반복한다: "초속 E미터로 D초 동안 걷고 F초 동안 휴식한다."
// 동시에 조깅을 시작한 지 X초가 지났을 때, 다카하시와 아오키 중 누가 앞서고 있는가?
