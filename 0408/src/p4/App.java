package p4;

public class App {
    public static void main(String[] args) throws Exception {
        // 쓰레드 사용시 주의 사항: 여러 쓰레드가 하나의 자원을 공유해서 사용할 때 !!
        // 참조변수들이 하나의 메모리를 가리킬때 .. 강사님은 참조주소들이 하나의 메모리를 가리킬때라고 하시긴함
        // 위의 상황이 아닐시에는 쓰레드 맘대로 써도됨 위의 상황은 최악
        // 크리티컬섹션을 잘 설정해야함 (임계영역). 크리티컬 섹션을 동기화(흐름? 시간?) : 지금상황의 동기는 시간의 흐름을 동기화해야함

        AAA a1 = new AAA();
        AAA a2 = new AAA();
        AAA a3 = new AAA();
        AAA a4 = new AAA();
        a2.start();
        a1.start();
        a3.start();
        a4.start();

        a1.join(); // a1 쓰레드 다 끝날때 까지 기다림.
        a2.join();
        a3.join();
        a4.join();
        System.out.println(SomeData.count); // Thread 돌기도 전에 print가 실행됨 (join이 없었을 때 기준)

    }
}

class SomeData {
    public static int count = 0;

    // 비동기식 프로그래밍에서 동기화를 하고있음...
    public synchronized static void increase() { // 동기화를 사용하여 충돌을 막음 ,상호배제를 해야 데이터가 보존됨
        // 비동기식 프로그래밍 장점 : 자기 멋대로 돌겠다 , 하나의 프로세스가 여러개의 cpu를 쓸 수 있기 때문
        // synchrozied 걸면 병목현상이 발생함 >> 하나의 스레드가 실행되기까지 나머지는 대기중

        // System.out.println("어떠어떠한 코드를.. 이곳은 관련없음");
        // 임계 영역 (Critical Secsion)
        synchronized (SomeData.class) {
            int test = count;
            count = test + 1;
        }

    }

    public static void decrease() {
        int test = count;

        // 아래와 같이... 시간 복잡도가 있는 코드가 있을 때
        String str = "";
        for (int i = 0; i < 1; i++) {
            str += "야호";

        }

        count = test - 1;
    }

}

class AAA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {

            // .. 특정 부하가 있는 코드들 ...
            SomeData.increase();

            // .. 특정 부하가 있는 코드들 ...

        }
    }
}