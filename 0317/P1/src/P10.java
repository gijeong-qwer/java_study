public class P10 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6, 7 }; // 입력된 값만큼 배열 생성 , 알고리즘 문제 풀때나 생성됨

        // 반복문 - 배열이 존재하는데 반복문 안쓰면 문제가 있다고 생각해야함
        // 고전 for문 - 사실상 이제는 아예 안쓰는 수준(배열 사용시) , 알고리즘문제 풀 때는 필요
        for (int i = 0; i < arr.length; i++) { // 배열의 길이 = arr.length
            System.out.println(arr[i]);
        }

        // ****사실상 가장 많이 사용 -향상된 for문 = foreach문 하나씩 하나씩 반복을 하겠다 : python은 다 향상된 for문
        // 위에같은 형식은 안씀
        for (int element : arr) { // 배열의 타입과 변수 : 반복을 돌릴 배열 혹은 그에 준하는 녀석들
            System.out.println(element);
        }

    }
}
