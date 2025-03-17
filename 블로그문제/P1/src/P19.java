public class P19 {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            boolean find = true;
            // if (i == 2) {
            // System.out.println(i + "소수입니다");
            // continue;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    find = false;
                    break;

                }

            }
            if (find) {
                System.out.println(i + "는 소수입니다");
            }

        }

    }

}

// 2~100사이의 소수를 구해보자
// 소수 판독기준준
