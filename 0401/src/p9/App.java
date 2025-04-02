package p9;

import java.util.*;

public class App {
    public static void main(String[] args) {
        // HashMap
        Map<String, Object> map = new HashMap<>();

        map.put("a",10);
        map.put("b",20);
        map.put("a",40); // 키는 중복을 허용하지 않음!! 덮어씌워짐  , 값은 중복이 허용됨 

    }
}

class Node<K,V> {
    K key;  // Hash 알고리즘을 통해, 배열의 인덱스로 변환됨
    V value;
    Node<K,V> next;
}