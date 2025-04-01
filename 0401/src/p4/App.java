package p4;

import java.util.*;

public class App {
    public static void main(String[] args) {
        // Linkedlist만의 특별한 Api를 사용하는 경우를 제외하고는 List를 사용함
        List<String> list = new LinkedList<>();

        list.add("11");
        list.add("11");
        list.add("11");

        // 반복 - 사실상 iterator로 반복돌려야함 - 이유는 각 알고리즘이 다르기 때문에 최적화된 반복 알고리즘을 구현했음
        Iterator<String> iter = list.iterator(); // iterator 호출하면 return을 iterator로 해줌

        while (iter.hasNext()) { // 성능이 좋게 반복
            String value = iter.next();
            System.out.println(value + "를 사용");

        }

        // 향상된 for문 (foreach)

        int a = 10; // 향상된 for문은 사실상 Iterator로 반복한다 next next 하면서 접근 한다는것
        for (String e : list) { // for문에 오른쪽에 올 수 있는것은 Interator를 정의한 클래스만 이용가능 >>
            System.out.println(e + "를 활용 !!");
        }

        // 고전 for 문을 안쓰는이유 배열 사용할때 외엔 구조가 박살날 수 있어서 foreach문 사용
        // for (int i = 0; i < arrayList.size(); i++) {
        // System.out.println(arrayList.get(i));
        // }

    }
}
