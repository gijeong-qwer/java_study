public class App {
    public static void main(String[] args) {
        int value = 30;
        // 초기화 안할시 오류구문
        // Exception in thread "main" java.lang.Error: Unresolved compilation problem:
        // The local variable value may not have been initialized

        int result = value + 10;

        System.out.println(result);

    }
}