package p11;

import java.util.*;

public class App {
    public static void main(String[] args) {
        // 사실... 몸에 익음
        // List = 배열 대신 사용
        // Dto와 Map은 비슷하다
        // Dto vs Map 
        // Dto : 정석 , 좋은코드 ,  설계 명확해야하는 조건 , 생산성 떨어질 수 있음
        // Map : 비정석 , 상황에 따라 나쁜코드가 됨  , 유연함 , 생산성 좋음
        StudentDto st1 = new StudentDto();
        st1.name = "한조";
        st1.age = 30;
        st1.score = 70;

        Map<String, Object> st2 = new HashMap<>();
        st2.put("name","한조");
        st2.put("age",30);
        st2.put("score",70);
        System.out.println((String)st2.get("name"));
        System.out.println((int)st2.get("age"));
        System.out.println((int)st2.get("score"));

        // Map
        List<Map<String,Object>> some  = new ArrayList<>();

        Map<String, Object> inner1 = new HashMap<>();
        inner1.put("student", new StudentDto());
        List<String> commentList = new ArrayList<>();
        commentList.add("안녕하세요1");
        commentList.add("안녕하세요2");
        inner1.put("comments", commentList);


        some.add(inner1);
    }
}

class StudentDto {
    public String name;
    public int age;
    public int score;

}
