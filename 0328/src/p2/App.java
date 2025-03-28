package p2;

public class App {
    public static void main(String[] args) {
        // SOLID 원칙 : L, I
        // LSP , ISP

        // LSP 리스코프 치환 원칙 >> 부모의 객체에서 자식의 객체로 바뀌어도 같은 기능을 썼을 때 예측가능한 결과가 나와야함 !!!
        // ex) 오버로딩할때 class AAA extends SomeCalculator return값처럼 말도안되는식으로 하지 말라는것

        SomeCalculator sc = new SomeCalculator();
        int result = sc.plus(10, 2);
        System.out.println(result);

    }
}

class SomeCalculator {
    public int plus(int a, int b) {
        // 마구마구.. 로직 실행 ...

        return a + b;

    }
}

class AAA extends SomeCalculator {
    @Override
    public int plus(int a, int b) {
        // 더 멋진 로직 실행..
        return a * b;

    }
}
