public class P32_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 99; i++) {
            if (i < 10) {
                if (i % 3 == 0) {
                    System.out.println(i + " 박수 한번");
                }
            } else {
                int a = i / 10;
                int b = i % 10;
                if (a % 3 == 0 && b % 3 == 0) {
                    System.out.println(i + " 박수 두번");
                } else if (a % 3 == 0) {
                    System.out.println(i + " 박수 한번");
                } else if (b % 3 == 0) {
                    System.out.println(i + " 박수 한번");
                }
            }
        }

    }
}
