public class App { // ctrl p > java create >
    public static void main(String[] args) { // char과 typecasting에 대한 정리
        System.out.println("Hello, World!"); // println은 타입을 확인

        char qq = 97; // char qq = 'a';
        int yy = 97;
        System.out.println(qq);
        System.out.println((int) qq);
        System.out.println(yy);
        System.out.println(qq + "" + yy); // println()에서 qq + "" + yy가 어떻게 동작하는지?
        // API(Application Programming Interface)란 미리 만들어진 기능을 제공하는 인터페이스

    }
}
