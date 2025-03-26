package p3;

public class App {
    public static void main(String[] args) {

    }
}

class AAA {

}

class BBB {
    AAA a;
}

/// AAA 클래스에ㅓㅅ BBB클래스가 한번도 호출된적없으면 >> UML기준으로 선을 안그림
/// 하나라도 생성되는 순간 선(Association)그려려야함
/// Association은 관계도 빠르게 그릴떄 씀 이유) AAA BBB중 한곳에서라 서로의 클래스에 대해 호출한 코드가 있으면 생기기
/// 때문에 방향이 없어서 알기어려움
/// Directed Association은 방향이 중요 // B가 A를 사용하면 , b->A 로 선 표기가됨
/// class BBB{ AAA a;}
/// aggregation : 집합 , composition : 구성
///