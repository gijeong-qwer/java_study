package p2;

public class App {
    public static void main(String[] args) throws Exception {
        // Thread(스레드) 비동기식 , 크리티컬 섹션 , 동기화 (상호배제 mutex)
        int a = 10;
        System.out.println("안녕하세요!!");
        // 어쩌어찌... 실행 오래 걸리는 코드
        Thread.sleep(60000);

        System.out.println("프로그램 종료!!");
    }
}
