public class Practice {
    public static void main(String[] args) {
        practice1 st1 = new practice1(); // st1 스택에 할당 힙영역에 practice1관련 인스턴스 생성
        int a = st1.test1;
        System.out.println(a);
        st1.test1 = 3;

        a = st1.test1;
        System.out.println(a);

        st1.testing1();
        st1.testing1(7);
        a = st1.testing1(a, a);
        System.out.println(a);

    }
}

class practice1 {

    String name;
    int test1 = 7;
    int test2;

    void testing1() {
        System.out.println("11111111");
    }

    void testing1(int a) {
        System.out.println("222222222");
    }

    int testing1(int a, int b) {
        System.out.println("333333333");

        return 2;

    }

}
// 메서드
// 자바에서 오버로딩이 가능하려면 "메서드 시그니처(Method Signature)"가 달라야 해.
// 메서드 시그니처는 메서드 이름 + 매개변수의 타입 & 개수를 의미하고, 반환 타입은 포함되지 않아.