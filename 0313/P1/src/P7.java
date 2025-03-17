public class P7 {
    public static void main(String[] args) {
        // 반복문: for while - continue ,break >> 문법은 별거 없는데 로직짜는게 어려움 // do- while은 거의 안써서
        // 사실상 신경안써도됨 어떤경우에도 한번은 실행하고 지나감

        int a = 10;
        while (a != 15) { // a<15와 같은말// if문처럼 {} 한줄코드시 생략 가능 - 비추 ()안은 boolean만 가능 예)while(a) 불가- java에서만
                          // 다른문법은 0일때만
                          // false
                          // while 무한반복의 무서운점은 실제로 작성시 print문이 없어서 cpu 갉아먹히는거 인지를 못하는 상황 발생 >> 항상 유의

            int b; // 생명주기동안 생성되고 사라짐
            System.out.println("hihi" + a);
            a++; // a++; 주석처리시 무한반복문 >> 제한을 달아놓은것
        } // ; 세미클론 찍어도 되는데 안찍어도됨 while은
        System.out.println(a); // 출력은 14까지 나왔지만 a= 15인상태로 종료
        System.out.println("프로그램 종료");
    }
}

// while(a < 15); 이거 문법적으로 틀린거 X
// while(a< 15)
// ; 이렇게 해석해서 무한 반복됨