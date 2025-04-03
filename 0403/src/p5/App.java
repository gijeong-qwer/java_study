package p5;

public class App {
    public static void main(String[] args) {
        // 람다식 문법
        YYY y1 = (v1, v2, v3) -> { // 인터페이스의 구현체만 반복되므로 구현을 해줘야함
            System.out.println(v1);
            System.out.println(v2);
            System.out.println(v3);
            return 3;
        };

        y1.method(1, "fff", false);
        y1.method(2, "11fff", false);
        y1.method(6, "ff222f", false);

    }
}

interface YYY {
    public int method(int a, String b, boolean c); // 타입에 따라 반환형도 생각해야함

}
