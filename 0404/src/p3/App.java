package p3;

import java.util.Date;
import static java.lang.System.out;

public class App {
    public static void main(String[] args) {
        // Date (날짜)
        // 코드가 실행되는 날짜
        // out.println(dfdfd);
        out.println("hihi"); // import를 정적으로 받음

        Date now = new Date(); // 현재시각 나옴
        // sql 말고 util패키지 써야함!!
        System.out.println(now);

        // ... 수많은 코드가 지난뒤
        Date now2 = new Date(); // 이 줄이 실행되는 순간의 시스템 시간을 가져와서 Date 객체로 저장함
        System.out.println(now2);

        // 날짜는 사실 long 타입의 숫자이다
        Date d1 = new Date(0L);
        System.out.println(d1); // UTC 표준 KST 한국시간 (UTC에 비해 9시간 느림)

        long kVaule = now.getTime();
        int iValue = now.getDate();
        out.println(iValue);
        iValue = now.getDay(); // 요일
        out.println(iValue);
        iValue = now.getMonth();
        out.println(iValue); // 달은 전달 나옴 >> gpt 검색

    }
}
