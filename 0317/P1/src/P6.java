public class P6 {
    public static void main(String[] args) {
        // null.... 중요
        // 모든 참조 변수는 접근 연산자 존재 ( [] . ) 배열과 함수에 접근(어딘가의 메모리를 따라가봐라)

        int[] arr1 = new int[3];

        arr1[0] = 70;
        // arr1[5] = 80; // X = Index out of bounds 문법적으로는 문제가 없지만 인덱스 범위를 넘어감

        arr1 = null; // 힙 메모리를 소멸 시키고 싶을때 써도됨
        System.out.println(arr1); // 문제 없음
        arr1[0] = 90; // npe = null pointer exception , 메모리에 접근 하라는건 오류가 발생

        // System.out.println(arr1[0]);
        // Exception in thread "main" java.lang.NullPointerException:

    }
}
