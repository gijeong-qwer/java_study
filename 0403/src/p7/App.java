package p7;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {
        // 함수형 프로그래밍: 람다식 + 함수형 지원 인터페이스
        // Function , Consumer , Supplier , Predicate ...

        Function<Integer, Integer> f1 = (a) -> {
            return 1;
        }; // 왼쪽은 파라미터타입 오른쪽은 return타입

        Consumer<Integer> f2 = (a) -> {
        }; // return 타입이 void임 소비자

        Supplier<String> f3 = () -> {
            return "";
        };

        Predicate<Integer> f4 = (a) -> { // return타입은 무조건 boolean 무언가를 결정할때
            return false;
        };

    }
}
