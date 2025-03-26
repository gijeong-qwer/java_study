package jogging;

// Atcoder문제 클래스로 만들어서 풀기기
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        new Solver().solve();
        // 타카하시와 아오키 말고 다른사람왔을때 까지 일반화 할 수 있는 수준 ****
        // 3명있을때? 5명있을떄 ? *** 어떻게 할 것 인지 일반화 생각 ****

    }
}

class Solver {
    public void solve() {
        Scanner sc = new Scanner(System.in);

        // 입력 값 받기
        int walkTimeTakahashi = sc.nextInt(); // 고택시가 걷는 시간
        int speedTakahashi = sc.nextInt(); // 고택시의 걷는 속도
        int restTimeTakahashi = sc.nextInt(); // 고택시의 휴식 시간
        int walkTimeAoki = sc.nextInt(); // 아오키가 걷는 시간
        int speedAoki = sc.nextInt(); // 아오키의 걷는 속도
        int restTimeAoki = sc.nextInt(); // 아오키의 휴식 시간
        int totalTime = sc.nextInt(); // 총 시간

        Walker takahashi = new Walker("takahash",
                walkTimeTakahashi,
                speedTakahashi,
                restTimeTakahashi);

        Walker akoi = new Walker("Aoki", walkTimeAoki, speedAoki, restTimeAoki);

        for (int time = 0; time < totalTime; time++) {
            takahashi.walk();
            akoi.walk();
        }
        if (takahashi.greaterThan(akoi)) {
            System.out.println(takahashi.getName());
        } else if (takahashi.lessThan(akoi)) {
            System.out.println(akoi.getName());
        } else {
            System.out.println("draw");
        }
        // // 결과 출력
        // if (distanceTakahashi > distanceAoki) {
        // System.out.println("Takahashi");
        // } else if (distanceTakahashi < distanceAoki) {
        // System.out.println("Aoki");
        // } else {
        // System.out.println("Draw");
        // }

        sc.close();

    }
}

class Walker {
    private String name; // 변수명으로 처리해도되는데 명확하지 않으니까 String으로 써도됨
    private int walkTime;
    private int speed;
    private int restTime;

    private int currentTime = 0; // 인스턴스 변수이기 때문에 0으로 초기화 이미 되어있지만 명시적으로 작성
    private int distance = 0;

    public Walker(String name, int walkTime, int speed, int restTime) { // 생성자 매개변수 작성할때 타입 사용하는거 잊었었음
        this.name = name;
        this.walkTime = walkTime;
        this.speed = speed;
        this.restTime = restTime;
    }

    public void walk() {
        if (currentTime < walkTime) {
            distance += speed;
        }
        currentTime++;

        if (currentTime >= walkTime + restTime) {
            currentTime = 0;
        }

    }

    public boolean greaterThan(Walker other) { // 파라미터에 대한 생각 무엇과 무엇을비교할지
        return this.distance > other.distance;

    }

    public boolean lessThan(Walker other) {
        return this.distance < other.distance;
    }

    public boolean equals(Walker other) {
        return this.distance == other.distance;
    }

    public String getName() {
        return name;
    }
}