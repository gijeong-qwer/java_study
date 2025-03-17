import java.util.*;

public class P33_improve {
    public static void main(String[] args) {
        int change;
        Scanner sc = new Scanner(System.in); // 힙영역에 메모리를 할당하는것이므로 while문 밖에 쓰는게 좋음음
        while (true) {

            String inputValue = sc.nextLine();
            change = Integer.parseInt(inputValue);
            System.out.println("잘못된 입력입니다, 10의배수로 입력해주세요");
            if (change % 10 == 0) {
                break;
            }
            // Scanner sc = new Scanner(System.in);
            // String inputValue = sc.nextLine();
            // int change = Integer.parseInt(inputValue); // Integer.parseInt();
            // while (true) {
            // if (change % 10 != 0) {
            // System.out.println("입력하신 " + change + "는 10의 배수가 아닙니다");
            // System.out.println("다시 입력해 주세요");
            // inputValue = sc.nextLine(); // 다시 받으려면 이렇게 넣어야 하는건가?
            // change = Integer.parseInt(inputValue);
            // } else {
            // break;
            // }
        }
        int count = 0;
        if (change >= 500) {
            count += change / 500;
            change = change % 500;
        }
        if (change >= 100) {
            count += change / 100;
            change = change % 100;
        }
        if (change >= 50) {
            count += change / 50;
            change = change % 50;
        }
        count += change / 10;

        System.out.println("동전의 개수는 " + count + "개입니다");
    }

}
// Q.<문제> 거스름 돈: 문제 설명
// 당신은 음식점의 계산을 도와주는 점원입니다.
// 카운터에는 거스름돈으로 사용할 500원, 100원, 50원,10원짜리 동전이
// 무한히 존재한다고 가정합니다.
// 손님에게 거슬러 주어야 할 돈이 N원일 때 거슬러 주어야 할 동전의 최소 개수를 구하세요.
// 단, 거슬러 줘야 할 돈 N은 항상 10의 배수입니다.
// [출처] 목표|작성자 s001lec
// 최소 동전개수 = 최대한 큰돈 동전으로 줘야함 500 100 50 10으로 돈을 나눠야함 1원
// 연산을 연쇄적으로 할때는 어떤 문법을써야하지??