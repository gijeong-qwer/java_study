import java.util.*;

public class P2 {
    public static void main(String[] args) {
        // stack= 지역변수 값또는 주소 저장
        // heap =
        Scanner scanner = new Scanner(System.in);
        String str = "stafe";

        int[] aaa = new int[3]; // 변수 aaa의 타입은 int가 아님 참조형 타입
        // int 타입의 변수를 3개 선언 X, 메모리를 3개 할당
        // 0 으로 초기화됨 // 0을 왜 나쁜값이라고하지?
        // *** 힙영역은 항상 초기화됨

        aaa[1] = 70; // [] : 배열 '접근' 연산자

        System.out.println(aaa[2]);

        int c; // 메모리안에 아무것도 없음

        // new 는 힙(Heap)영역에 메모리를 할당
        // 힙은 붙어서 메모리에 할당
        // 변수 표현방식이 아니므로 stack
        // 변수만!!! stack !!

        // 배열의 타입은 참조형
        // stack = 지역변수를 다루는영역.. 블록(스코프)를 빠져나가면 소멸
        // 모든 변수는 2가지로 나뉜다(메모리의 형태). 기본타입과 참조타입으로 나뉨
        // stack의 핵심은 소멸 , heap과 스택 동시에 연결해서 생각
        // heap =

        int b = 30; // 직접 값을 저장
        // 스택 메모리에 두개가 쌓여있음 aaa , b
        // 언제 소멸되냐가 핵심 (생성은 신경덜 써도됨, 메모리가 언제 해제되느냐에 집중)
        // {} 이 영역을 벗어나면 소멸됨

    }
}
