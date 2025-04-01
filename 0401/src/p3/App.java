package p3;

import java.util.*;

public class App {
    public static void main(String[] args) {
        // List<String> arrayList = new ArrayList<>(100); 이런식으로 배열의 크기를 100과 같이 지정하고 시작
        // 가능
        List<String> arrayList = new ArrayList<>(); // ArrayList 사용하나 LinkedList 사용하나 결과는 완전 동일 그러나 알고리즘은 완전다름
        arrayList.add("시연1"); // 맨뒤 추가 - 링크(저장) 어레이 (정상)
        arrayList.add("시연2"); //
        arrayList.add("시연3");

        arrayList.add(1, "시연!!"); // 중간 추가 - 링크 (정상) , 어레이 (주의!!! 강한주의 : 굉장히 유의해야함)
        arrayList.add(1, "시연!!");

        arrayList.remove(0); // 앞에 중간 삭제 - 링크 (정상) , 어레이 (주의!!! 강한주의 : 굉장히 유의해야함)

        String value1 = arrayList.get(2); // 접근 - 링크 (주의) , 어레이 (베스트!! 압도적)
        System.out.println(value1);

        // 자료구조는 고전반복을 절대안씀 - 링크(절대하면안됨) , 어레이 (정상)
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
