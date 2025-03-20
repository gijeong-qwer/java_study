public class P3 {
    // int a = 3; 가능
    // System.out.println(); 불가
    public static void main(String[] args) {
        BBB qwer = new BBB(); // 초기값 설정 보통 0 false null 임
        System.out.println(qwer.b1);

        // int qq; 스택영역은 초기화가 안됨
        // System.out.println(qq); 문법적오류

    }
}

// class = "정의" 문법
class BBB {
    // 속성, 필드 , 멤버변수 , 인스턴스 변수 (추상화 레벨에 따라 다르게 씀, 다비슷한 표현임)
    int b1 = 10; // 필드를 정의할 때 b1 = 10 이런식으로 정의하고 들어갈 수 있음 ,변수선언 문법을 사용할 수 있다
    int b2 = (int) (Math.random() * 100); // 메서드를 아얘 못쓰진 않음. 변수초기화 할때 사용할 수 있음
    int b3;
    // System.out.println(); // 클래스 열고 if문 for문 while문 과 print 등을 못씀 // 기능 정의 함수라서
    // 메서드 영역에만 가능

    // 생성자

    // 기능, 메서드

}
