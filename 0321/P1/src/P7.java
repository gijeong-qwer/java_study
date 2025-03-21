public class P7 {
    public static void main(String[] args) {

        int a = 10; // 변수 >> 변할 수 있음
        a = 20;

        final int b = 30; // 제한자 final , 문법적으로 제한을 걸음 , 사실상 상수라고 표현함 // 다른언어는 이부분이 빡세게 표현됨
        // b = 40; b는 더이상 값을 변경할 수 없는데 40으로 변경하려고 해서 오류
        // 다음주 접근제한 **** 캡슐화 **** 정보은닉 **** 접근제한자

        // Math2.pi = 50; // 문법적으로 변경이 가능하여 , 개발자의 의도와 다르게됨

        System.out.println(4 * 4 * Math2.pi);

    }
}

class Math2 {
    final static double pi = 3.14; // static double pi = 3.14; 가 변경 가능하므로
    // Math2.pi = 50; 에 의해 수정되서 final을 붙임 , 코드의 안정성 확보

}