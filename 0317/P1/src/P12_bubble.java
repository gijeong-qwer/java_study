import java.util.*;

public class P12_bubble {
    public static void main(String[] args) {
        // 알고리즘
        int[] arr = { 4, 5, 1, 3, 2, 9, 6, 7, 8 };
        // 정렬해보자
        for (int e : arr) {
            System.out.println(e);
        }
        // Arrays.sort(arr); 실무에서 쓰는 api

        // 버블정렬 >> 앞뒤 교환하면서 가장큰것을 뒤로
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) { // -1 넣는이유 j가 범위밖이나옴옴
                if (arr[j] > arr[j + 1]) { // 좌변이 우변보다 크면 , 교환하는 매커니즘을 만들려함
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
            System.out.println(i);
        }

    }
}
