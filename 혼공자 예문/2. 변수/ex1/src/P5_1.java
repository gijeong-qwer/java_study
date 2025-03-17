public class P5_1 {
    public static void main(String[] args) {
        int[] intArray = null;
        System.out.println(intArray);
        // intArray[0] = 10;
        // System.out.println(intArray);
        intArray = new int[5]; // 동적할당 항상 먼저하기 아니면 오류생김 NullPointerException
        intArray[0] = 10;
        System.out.println(intArray); // 실제 주소값
        System.out.println(intArray.length); // 주소의길이
    }
}
