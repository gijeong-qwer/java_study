package p6;

public class App {
    public static void main(String[] args) {
        // 람다식: 최대한 줄인다...
        // AAA a1 = a -> System.out.println("dsfaf");; // 파라미터가 하나인 경우에 한해서()소괄호를 뺄 수 있음
        // AAA a1 = (a) -> {}; ;생략가능 안쪽에 있는 세미콜론이 사라지는것 >> 밖의 세미클론이 아님
        // AAA a1 = a -> System.out.println("dsfaf"); // 권장방식
        AAA a1 = a -> {
            System.out.println(a);
        }; // 중괄호 쓰는순간 람다식 안쓰는게 좋은 코드일 확률 높음 , 주석 부분까지 다 같은 코드
        BBB b1 = (a, b) -> a + b;
        // CCC c1 = (a) -> {
        // return a*2;
        // };
        CCC c1 = a -> a * 2;

        // 메서드 참조 연산자 ::
        // AAA a2 = a -> System.out.println(a);
        AAA a2 = System.out::println; // 윗줄이랑같은거임

        // BBB로 모두 구현해보자
        CCC c2 = new CCCImpl();
        CCC c3 = (a) -> {
            return Math.abs(a);
        };

        CCC c4 = a -> Math.abs(a);
        CCC c5 = Math::abs;

        int result = c2.method(-3);
        System.out.println(result);

        // 람다 사용하면서 인스턴스도 생성할 수 있음

        // CCC absConvertor = a -> Math.abs(a); // 핵심은 콜백

    }
}

class BBBImpl implements BBB {
    public int method(int a, int b) {
        return 0;
    }
}

class CCCImpl implements CCC {
    public int method(int a) {
        return Math.abs(a);
    }
}

interface AAA {
    public void method(int a);
}

interface BBB {
    public int method(int a, int b);
}

interface CCC {
    public int method(int a);
}
