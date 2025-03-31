package p6;

import java.util.*;

public class App {
    public static void main(String[] args) { // 컬렉션 프레임워크 (자료구조) 만든 사람 때문에 나왔다고 생각해도됨 - 제네릭은
        // 제네릭 <> : 응용 프로그래머를 위해서 나온 문법이 아님.. 응용프로그래머는 타입이 명확해야 좋음
        QWER<String> s2yoen = new QWER<>(); // 자바 1.8이후로는 <String> 안에있는거 빼고 쓰는게 관례임 // 컴파일시에 결정됨 타입이
        // QWER<String> s2yoen = new QWER<>();
        s2yoen.a = "...";

        QWER<Integer> magenta = new QWER();
        magenta.a = 10;

        YYYY<Integer, String> yyy2 = new YYYY();
        YYYY<Scanner, System> yyy3 = new YYYY();

    }

}

class QWER<S2yoming> { // <T> 보통 T로 정의를 많이함 K ,V 등도 많이 씀
    S2yoming a; // 클래스를 정의하는 사람이 무슨 타입일지 잘 모르겠을때 만듬
    S2yoming b;
    double c;

}

class QWER2 {
    double a;
    double b;
    String c;
}

class YYYY<K, V> { //
    K v1;
    V v2;
    int v3;

    public V test(K value) {
        return v2;
    }

}

class YYYYDD<K extends Integer> { // 상속도 받을 수 있음
    K v1;

    int v3;

}