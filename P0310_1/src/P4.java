public class P4 {
    public static void main(String[] args) {
        // 에러!!
        // 1. 구문에러( Syntax Error)
        //int a = 10;
        // 2. 예외 ( Exception ) => 문법적으로는 문제없지만 런타임시에 오류 발생 
        System.out.println("안녕!");
        String a = null;
        a.length();
        System.out.println("반갑!");
        // 3. 버그 - 의도하고 다르게 논리 문제
        int b = 10 + 1;
        System.out.println("10 - 1의 값은 " + b);
    }
}
