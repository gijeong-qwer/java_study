package p2;

public class App {
    public static void main(String[] args) {
        Days day = Days.MON; // 참조변수를 enum 타입으로 넣을 수 있다 7 가지 설정한값 외엔 넣지 못하므로 타입안정성이 확보됨 + 가독성도 좋음
        // ...

        if (day == Days.MON) {

        } else if (day == Days.WED) {

        }
    }
}

// enum -도메인 제약 (값 범위 제약 - 타입 안정성 확보)

class Day2 {
    public static final int MON = 1;
    public static final int WED = 3;
}