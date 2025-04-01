package p2;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>(); // ArrayList 사용하나 LinkedList 사용하나 결과는 완전 동일 그러나 알고리즘은 완전다름
        linkedList.add("시연1"); // 맨뒤 추가//순차적으로 추가하겠다
        linkedList.add("시연2");
        linkedList.add("시연3");

        linkedList.add(1, "시연!!"); // 중간 추가 - 링크 (정상)
        linkedList.add(1, "시연!!");

        linkedList.remove(0); // 앞에 중간 삭제 - 링크 (정상)

        String value1 = linkedList.get(2); // 접근 - 링크 (주의)
        System.out.println(value1);

        // 고전 반복 -링크(절대 하면 안되는 코드) // 이중 for문이 되어버림
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}
