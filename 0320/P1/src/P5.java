public class P5 {
    public static void main(String[] args) { // 코드의 실행순서에 집중중
        System.out.println("Hi~");

        // new AAAP5(); // 인스턴스가 생기면서 메모리 안에 할당되면서 생성자를 즉시 호출함
        AAAP5 aaa = null; // 생성자가 호출이 안됨 >> 인스턴스가 생성되야 생성자가 호출됨 new 없이는 생성자 호출이 안됨
        AAAP5 bbb = new AAAP5();
        AAAP5 ccc = new AAAP5(); // 생성자가 또 호출됨 new 당 한번이라 생각하면 됨
        System.out.println("반갑습니다");

        AAAP5 ddd = new AAAP5();

        System.out.println("Bye~");
    }
}

class AAAP5 {
    // 속성 정의 구간
    int a1;
    int a2;

    // 생성자 정의 구간 - ********* 인스턴스 생성시 자동으로 실행됨
    AAAP5() {
        // 실행 코드 작성 .. 우리가 main안에 작성했던것 처럼 논리코드를 작성할 수 있다.
        // 인스턴스 생성할 때 실행이 됨
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("sum=" + sum);
    }

}