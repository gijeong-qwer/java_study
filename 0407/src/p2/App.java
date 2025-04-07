package p2;

public class App {
    public static void main(String[] args) {
        // 여러 형태의 exception

        try { // try - catch르 안쓰면 코드가 뻗음
              // 가시성이안좋아서 사용하게되면 어디다가 쓸 지 잘 고민해야함
              // 해당 코드의 Exception을 Handling 한다 > 다룬다

            // int q = 10; finally는 return되어도 무조건 사용 가능
            // if (q == 10)
            // return;

            System.out.println(1);
            String str = null;
            str.length(); // Exception in thread "main" java.lang.NullPointerException: Cannot invoke //
                          // "String.length()" because "str" is null

            System.out.println(2);
            int[] arr = new int[5];
            arr[150] = 10; // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index
                           // 150 out of bounds for length 5

            System.out.println(3);
            int result = 10 / 0; // Exception in thread "main" java.lang.ArithmeticException: / by zero}

        } catch (NullPointerException e) {
            System.out.println("NULL값이면 안됩니다");
        } catch (IndexOutOfBoundsException | ArithmeticException e) { // 파이프연산시 참조변수 두개 쓰면 안됨
            System.out.println("인덱스 범위를 넘어섰습니다");
            // } catch (ArithmeticException e) {
            // System.out.println("0으로 나누면 안됩니다");
        } catch (Exception e) {
            // e.printStackTrace(); // 개발자도 어떤 예외가 발생할 지 모르기 때문에 사용 , 프로그램이 뻗지는않음
            // System.out.println(e.getMessage());
            System.out.println("로직에 문제가 발생했습니다. 다시 시도해주세요...");
        } finally {
            // 강력한 코드 무조건 사용 가능 , Return 해도 실행됨
            // 사용용도 ... 리소스 해제 시 활용 >> 파일 입출력 부분
            // ~~~.close(); 하는데 주로 사용
            System.out.println("익셉션이 발생하던... 안하던... 무조건 실행");
        }
        System.out.println("이코드에선 finally 해도 의미없긴함");
        System.out.println("catch 블럭 끝나고 밑으로 내려가짐");

        System.out.println("프로그램 종료!!");
    }
}