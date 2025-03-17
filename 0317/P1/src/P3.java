public class P3 {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = new int[5];
        // 변수는 문법적표현 , 메모리는 런타임에 대한것
        // 기본타입의 변수 0개
        // int 타입의 메모리는 8개 , (run time시에) 변수라고 할 수 없음
        // 기본타입은 변수와 메모리가 같았음
        // 프로그래머가 지금 상황에서 컨트롤 가능한 메모리의 수>> 10개
        // int 타입 메모리 8개 , 참조형타입 메모리 2개 (arr1, arr2)

        arr1 = new int[7]; // 참조형 타입변수는 '배열의 주소값을 담 을 수 있음'
        // 모든 참조 변수(와 메모리)는 null(중요)값을 담을 수 있다 !!
        // null = 주소가 없음을 나타내는 '값' !!
        //
        arr1[0] = 70;
        arr1[1] = 70;
        arr1[2] = 70;

    }
}
