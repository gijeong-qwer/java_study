package p1;

import java.util.ArrayList;
import java.util.*;

public class App {
    public static void main(String[] args) {
        // API
        String str1 = "AAA , bbb , ccc ,   아이유"; // 띄어쓰기도 하나의 문자열로 생각
        int iValue = str1.length();

        str1.charAt(iValue); // 해당 인덱스의 문자가져오기
        String sValue = str1.substring(5);
        iValue = str1.indexOf(",");
        iValue = str1.lastIndexOf(",");

        str1.replaceAll(",", ""); // 좌변의 내용을 우변의 내용으로 바꿈
        str1.replaceAll(" ", ""); // 띄어쓰기 다 붙이기

        sValue = str1.replaceAll(str1, sValue);

        if (str1.contains("아이유")) {
        } // return 타입이 true false면 조건문으로 자주씀

        if (str1.startsWith("안녕")) {
        }

        sValue = str1 + "야호!!";
        sValue = str1.concat("야호~~");

        str1.isEmpty(); // length가 0인거 아무것도 없는것
        str1.isBlank(); // 글자가 없어도 whitespace

        str1.split(","); // Java에서 나오면 위험한 코드 , 왜지? 도메인이 원자값이여야한다는데 하나씩이여야된다?

        String[] sArr = str1.split(",");

        sValue = str1.toLowerCase(); // 대문자를 다 소문자로 바꿔줌
        sValue = str1.toUpperCase(); // 소문자를 다 대문자로 바꿔줌

        str1.toLowerCase();

        str1.trim(); // noise를 제거 Ex) " 박기정" 앞,뒤에 빈공간 (화이트 스페이스) 제거 "박기정" , "이시연 대시연" 둘사이 공백은 빈공간이라
                     // 생각안함(노이즈 아님)
        // 사용자 실수에 의한 노이즈를 제거한다고 표현

        sValue = str1.trim(); // 사용자와 관련이 될때는 항상 사용해야함 실수할 수 이씅니까

        int x = 4;
        int y = 7;
        int result = x * y;
        sValue = x + "X" + y + "=" + result;
        sValue = String.format("4 X 7 = 28"); // format
        sValue = String.format("%d X %d = % d", 1, 1, 1); // 위랑 같음
        sValue = String.format("야호!!! %f 하하하 %s", 33.3333, "dfdfd");

        List<String> list = new ArrayList<>();
        list.add("시연");
        list.add("히나");
        list.add("마젠타");
        list.add("쵸단");

        String.join(",", list); // java쪽에선 이런 코드 잘안씀 ui에서나 씀

        System.out.println(sValue);
        System.out.println(iValue);

    }
}
