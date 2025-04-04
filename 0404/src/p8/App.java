package p8;

public class App {
    public static void main(String[] args) {
        // StringBuilder , StringBuffer : 버퍼 = 여유공간 : 처음부터 넉넉하게 공간 마련 >> String 동작 구조에
        // 대해서 아는가 ?
        // 문자열 연산이 너무 많이 이루어 질때 **** 주의해야함 인스턴스 무한 생성하는꼴

        StringBuilder strBuilder = new StringBuilder("안녕하세요");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            strBuilder.append("반가워요!!!");

        }

        long runTime = System.currentTimeMillis() - startTime;
        System.out.println("로직 끝. 총 실행 시간 : " + runTime);

        // StringBuilder 공간 많이 만들기 : 쓰레드 안정성 대신에 빠르다 , 일반적으로 많이사용
        // 잘모르겠다 Buffer사용하면 되긴하는데 쓰레드가 터질 수 있다.

        // String str = "안녕하세요!!"; // 7개의 Char 배열이 있다 생각 할 수 있음
        // str = str + "반갑습니다!!"; // 위에는 배열이 딱맞는 크기였으므로 또 배열이 생성됨

        // long startTime = System.currentTimeMillis();
        // System.out.println(startTime);

        // for (int i = 0; i < 100000; i++) {
        // str = str + "반가워요!!!!"; // 인스턴스 생성삭제가 계속 반복됨
        // }

        // long runTime = System.currentTimeMillis() - startTime;
        // System.out.println("로직 끝. 총 실행 시간 : " + runTime);

    }
}
