package p8;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(15);
        set.add(7);
        set.add(20);

        for (int e : set) {
            System.out.println(e); // 넣는 순서와 상관없이 정렬되어서 나옴 
        }
    }
}
