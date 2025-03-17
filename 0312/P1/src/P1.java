public class P1 {
    public static void main(String[] args) {
        // 연산자..중요하지만 쉬워요 - 타입을 꼭 신경쓰면서 공부 (JAVA는 타입이 제일 중요)
        // 산술 연산자 + - * / >> 정수형 기본타입 int 실수형 기본타입 double
        int a1 = 10;
        int a2 = 20;
        // int a3 = a1 + a2; // 연산되는 타입을 항상 생각해보고 연산결과의 타입 생각해보기 **다른타입끼리 계산시
        int a3 = (int) 10.7 + 20;// 30, 캐스팅은 무조건 먼저함함 >> 타입캐스팅팅
        a3 = (int) (10.7 + 20.5); // 41
        // a3 = 10.0 + a3; //타입미스매치 >> 대입연산자에서 오류발생
        double a4 = a3 + 10.0;
        a4 = 20 + (a3 * 15); // 알면서 가독성때문에 괄호침침
        a3 = a1 + 20 + a2; // + 앞에서부터 연산, 연산순서 체크 및 암기
        System.out.println(a3);
        System.out.println(a4);
        System.out.printf("%s %10d %10d\n", a1, 2, a1);
        System.out.printf("%-10d\n", a1);

        int c1 = 5;
        int c2 = 2;
        int c3 = c1 / c2;
        double c4 = c1 / c2;
        double c11 = (double) c1 / c2; // 타입 변환 연습
        System.out.println("더블계산결과는: " + c11);
        System.out.println(c3); // syso >> 단축키
        System.out.println(c4);
        int c5 = 10;
        double c6 = 2.3;
        int c7 = (int) (c5 / c6);
        double c8 = (double) (c5 / c6);
        System.out.println("정수형 캐스팅의 결과값은 : " + c7);
        System.out.println("실수행 캐스팅의 결과값은 : " + c8);

        int e1 = 5;
        int e2 = 2;
        int e3 = e1 % e2;
        System.out.println("e3의 값은: " + e3);
    }
}
