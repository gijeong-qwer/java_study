
// 스캐너의 동적할당을 한번만 하기
import java.util.*;

public class P34_improve {
    public static void main(String[] args) {
        int n, k;
        Scanner sc = new Scanner(System.in);
        String inputValue;

        while (true) {
            System.out.print("N의 값을 입력해주세요 :");
            inputValue = sc.nextLine();

            n = Integer.parseInt(inputValue); // 줄여쓰고싶으면 n=Integer.parseInt(sc.nextLine());
            if (n < 1 || n > 100000) {
                System.out.println("범위밖의 입력입니다( 1 <= N <= 100000)");
                inputValue = sc.nextLine();
                n = Integer.parseInt(inputValue);
            } else {
                break;
            }

        }
        while (true) {
            System.out.print("K의 값을 입력해주세요 :");
            inputValue = sc.nextLine();
            k = Integer.parseInt(inputValue);
            if (k < 2 || k > 100000) {
                System.out.println("범위밖의 입력입니다( 2 <= K <= 100000)");
                inputValue = sc.nextLine();
                k = Integer.parseInt(inputValue);
            } else {
                break;
            }

        }
        int count = 0;
        while (n != 2) { // *********n>1 쓰면됨 // n==1 이되는 순간 종료하고싶었음
            n -= 1;

            if (n % k == 0) {
                n = n / k;

            }
            count++;

        }
        System.out.println("수행결과 " + count + "번 수행했습니다");

    }
}
// Q.<문제> 1이 될 때까지: 문제 설명
// • 어떠한 수 N이 1이 될 때까지 다음의 두 과정 중 하나를 반복적으로 선택하여 수행하려고 합니다.
// 단, 두번째 연산은 N이 K로 나누어 떨어질 때만 선택할 수 있습니다.
// 1. N에서 1을 뺍니다.
// 2. N을 K로 나눕니다.
// • 예를 들어 N이 17, K가 4라고 가정합시다.
// 이때 1번의 과정을 한 번 수행하면 N은 16이 됩니다.
// 이후에 2번의 과정을 두 번 수행하면 N은 1이 됩니다.
// 결과적으로 이 경우 전체 과정을 실행한 횟수는 3이 됩니다.
// 이는 N을 1로 만드는 최소 횟수입니다.
// • N과 K가 주어질 때 N이 1이 될 때까지 1번 혹은 2번의 과정을 수행해야 하는
// 최소 횟수를 구하는 프로그램을 작성하세요.

// 입력 조건 : 1 <= N <= 100000 , 2 <= K <= 100000 , N과 K는 자연수
// [출처] 목표|작성자 s001lec
