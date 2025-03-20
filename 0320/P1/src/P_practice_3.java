public class P_practice_3 {
    public static void main(String[] args) { // 코드의 실행 순서에 집중
        System.out.println("hi");

        AAAP3 aaa = null; // 생성자 호출이 안됨
        // 인스턴스가 생겨야 생성자가 호출됨, new 없이는 생성자 호출이 안됨
        AAAP3 bbb = new AAAP3();
        // new AAAP5(); : 인스턴스가 생기면서 메모리 안에 할당되면서 생성자를 즉시 호출함
        System.out.println("hello~");

        AAAP3 ccc = new AAAP3();
        System.out.println("Bye~");

    }

}

class AAAP3 {
    // 속성 정의 구간
    int a1;
    int a2;

    // 생성자 정의 구간 ********* 인스턴스 생성시 자동으로 실행됨
    AAAP3() {
        // 실행 코드 작성
        // 인스턴스 생성할 때 실행이 됨
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("sum= " + sum);

    }
}