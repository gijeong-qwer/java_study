public class P8 {
    public static void main(String[] args) {

        // 이중배열을 따로따로 직접적인 형태로 만들어보면

        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int[] arr3 = new int[3];

        int[][] arr = new int[3][];
        arr[0] = arr1;
        arr[1] = arr2;
        arr[2] = arr3;

    }
}
