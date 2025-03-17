public class P10 {
    public static void main(String[] args) {
        int a = 1;
        for (a = 1; true; a++) { // a의 메모리 이해를 위한 예제 잘안씀
            if (a == 13) {
                continue;
            }

            System.out.println(a);
            if (a > 30) {
                System.out.println("종료합니다");
                break;
                // System.out.println("종료합니다"); // break 이후 출력할수없기에 오류발생
                // Exception in thread "main" java.lang.Error: Unresolved compilation problem:
                // Unreachable code

                // at P10.main(P10.java:12)
            }
        }
        System.out.println(a);
    }
}
