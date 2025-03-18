public class P5 {
    public static void main(String[] args) {

        // 메모리 소멸 확인
        int[] arr1 = new int[3];
        // 참조 변수가 소멸되면 >> 스택영역이 소멸되면서 >> 자연스럽게 힙영역도 소멸된다
        // 참조변수가 소멸되면서 스택영역이 소멸되면, 힙영역은 가비지가 되는것
        int[] arr3 = null; // 메모리 주소가 없음을 나타내는값 , 진짜로 값을 초기화한거 ,null이 값임을 항상 인지 ***

        {
            int[] arr2 = new int[5]; // arr2는 지역변수 이면서 참조변수
            arr3 = arr2; // arr3는 arr2의 메모리 주소를 받고 기존 arr3는 힙영역에 아무것도 없었으므로 , 아무일도 안일어남
        } // arr2 스택에서 소멸 arr3는 남아있음 힙영역에 메모리 주소를 받는체로
    }
}
