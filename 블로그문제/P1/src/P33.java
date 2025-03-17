import java.util.*; //  Scanner Random ArrayList Collections 등을 쓸 수 있음음

public class P33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // int command = Integer.parseInt(inputValue); 스캐너와 통채로 외우기기
        String inputValue = sc.nextLine();
        int change = Integer.parseInt(inputValue); // 스캐너는 문자열이기 때문에 정수형으로 쓰고싶으면 Integer써야함
        boolean Real = true;
        if (change % 10 != 0) {
            System.out.println("입력하신" + change + "원은 10의 배수가 아닙니다");
            // return; >> 잘못 입력하면 다시입력하게 해야하나 아니면 프로그램이 종료되게 해야하나
        } else {
            System.out.println("입력하신 금액은" + change + "입니다");
        }
        int count = 0;

        while (Real) {
            if (change >= 500) {
                count += change / 500;
                change = change % 500;
                count += change / 100;
                change = change % 100;
                count += change / 50;
                change = change % 50;
                count += change / 10;
            } else if (change >= 100) {
                count += change / 100;
                change = change % 100;
                count += change / 50;
                change = change % 50;
                count += change / 10;
            } else if (change >= 50) {
                count += change / 50;
                change = change % 50;
                count += change / 10;
            } else {
                count += change / 10;

            }
            System.out.println("동전의 갯갯수는 " + count + "개입니다");
            break;
        }

        sc.close(); // 잊지말기기
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
// 5000