public class P11 {
    public static void main(String[] args) {
        // 이중 for문을 반복문으로 돌릴때
        int[][] arr = new int[3][4];

        // 고전 for 문

        for (int i = 0; i < arr.length; i++) { // 3번 : arr이 가리키는건 -[]
            for (int j = 0; j < arr[i].length; j++) { // 4번 : arr[]이 가리키는건 -[][]
                System.out.println(arr[i][j]);

            }
        }
        // 향상된 for 문

        for (int[] a : arr) { // arr은 3개짜리 1중배열 , 참조하는것은 1중배열의 참조값
            for (int x : a) {
                System.out.println(x);
            }

        }

    }
}
