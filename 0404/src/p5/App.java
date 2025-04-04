package p5;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        // 중요 - 숫자 <-> 날짜 <-> 문자 <-> 숫자

        // 숫자 -> 문자
        int a1 = 20;
        String a2 = a1 + ""; // 좋은방식은 아님 , 문법적으로 가능
        String a3 = String.valueOf(a1); // 내부에서 new String해서 문자로 변환 toString 사용
        String a4 = Integer.toString(a1);

        // 문자 -> 숫자
        String b1 = "213";
        int b2 = Integer.parseInt(b1);

        // 숫자 -> 날짜
        long c1 = 132412142;
        Date c2 = new Date(c1);
        LocalDateTime c3 = LocalDateTime.ofInstant(Instant.ofEpochSecond(c1), ZoneOffset.UTC);

        // 날짜 -> 숫자
        Date d1 = new Date();
        long d2 = d1.getTime();

        LocalDateTime d3 = LocalDateTime.now();
        System.out.println(d3);
        long d4 = d3.atZone(ZoneId.of("Asia/Seoul")).toInstant().toEpochMilli();
        System.out.println(new Date(d4));

        // 문자 -> 날짜
        // "2024/04/04" - "2024-04-04"
        // String e1 = "2024-04-04"; // 예전에는 yyyy/MM/dddd 만지원했음 >> 예외처리됨 해당 행처럼 쓰면
        // // JavaScript부터 2024-04-04 기준으로 사용
        // // Date e2 = new Date(e1);
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // 시분초 때문에 M 대문자로
        // 사용
        // // Date e2 = sdf.parse(e1); // 문법적으로는 옳음 , 근데 예외처리 해야되는 경우

        // LocalDateTime e3 = LocalDateTime.parse(e1); // 날짜만 처리시 Date , 경우에 따라
        // LocalDateTime 사용하면좋음
        // // System.out.println(e2);
        // System.out.println(e3);

        // 날짜 -> 문자 >>> 고민할 부분들이 있다 ** Spring 프레임워크에서는 알아서 처리해주는데 동작을 알면 도움이 되니까
        Date f1 = new Date();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년MM월dd일");
        String f2 = sdf2.format(f1);
        String f3 = sdf3.format(f1);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        LocalDateTime f11 = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String f4 = f11.format(dtf); // parse 문자를 분석해서 계산 >>
        // String f4 =f11.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")); 이코드가 더 예쁨

        System.out.println(f4);

        System.out.println("프로그램 끝");

    }
}
