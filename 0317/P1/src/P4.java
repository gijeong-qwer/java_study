public class P4 {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = new int[5];
        // stack 과 heap 메모리의 소멸시점 차이
        // stack = 변수를 담는 메모리 = scope (예시: { } for 문같은거 ) 끝나면 소멸
        // heap = 메모리 주소를 참조하는 변수가 없을시에 소멸
        arr1[0] = 50; // 타입옆에[] 와 변수옆에[]의 느낌이 다른걸 인지하기
        arr1[2] = 70; // 변수[]옆에 붙으면 접근이 가능하다는것

        arr2[1] = 60;

        arr2 = arr1; // arr2의 기존 메모리가 소멸됬다고 판단해도됨 gc가 아직 처리 안했을수도 있지만
        // arr2에 int 배열의 주소 값을 담을 수 있다, **int 타입 배열의 형태
        // arr1의 값을 arr2 에 대입 , arr1의 값 = arr1 배열의 메모리 주소

        arr2[0] = 100;
        System.out.println("arr1[0]의 값은" + arr1[0] + " 입니다");
        System.out.println("arr2[1]의값은" + arr2[1] + " 입니다");

    }
}
