public class P32 {
    public static void main(String[] args) {
        for (int i = 1; i <= 99; i++) {
            int j = i;
            if (j < 10) {
                if (j % 3 == 0 || j % 6 == 0 || j % 9 == 0) {
                    System.out.println(j + " 박수 한번");

                }
            } else {
                int a = j / 10;
                int b = j % 10;
                if ((a % 3 == 0 || a % 6 == 0 || a % 9 == 0) && (b % 3 == 0 || b % 6 == 0 || b % 9 == 0)) {
                    System.out.println(j + " 박수 두번");
                } else if (a % 3 == 0 || a % 6 == 0 || a % 9 == 0) {
                    System.out.println(j + " 박수 한번");
                } else if (b % 3 == 0 || b % 6 == 0 || b % 9 == 0) {
                    System.out.println(j + " 박수 한번");
                }
            }
        }
    }

    // while (j < 100) {
    // int a = j % 10;
    // int b = j / 10;
    // if ((a % 3 == 0 || a % 6 == 0 || a % 9 == 0) && (b % 3 == 0 || b % 6 == 0 ||
    // b % 9 == 0)) {
    // System.out.println(j + " 박수 두번");

    // break;
    // }
    // }

    // 3, 6, 9 각 자릿수별로??
    // while(j<10){
    // if(j%3==0||j%6==0||j%9==0){
    // System.out.println(j+" 박수 한번");
    // }else{

    // }
}

// 반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우의 수를 순서대로 화면에 출력해보자. 1부터 시작하며 99까지만 한다.

// 실행 결과 예)
// 3 박수한번
// 6 박수 한번
// 9 박수 한번
// .
// .
// .
// 33 박수 두번
// .
// 98 박수 한번
// 99 박수 두번
// [출처] 목표|작성자 s001lec
