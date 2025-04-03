package p4;

public class App {
    public static void main(String[] args) {
        Button btnHello = new Button();
        btnHello.onClick(new Hello());

        Button btnSum = new Button();
        btnSum.onClick(() -> {
            int sum = 0;
            for (int i = 0; i <= 10; i++) {
                sum += i;
            }
            System.out.println(sum);
        });

        // Button btnGugudan = new Button();
        // btnGugudan.onClick();
    }
}

///////////////////////// 아래는 우리가 짠 코드가 아님//////////////////////////////////

interface ButtonExecutor {
    public void execute();

}

class Button {
    public void onClick(ButtonExecutor executor) {
        System.out.println("버튼이 눌리는 애니메이션 로직 진행");
        System.out.println("버튼이 ... 애니메이션 로직 진행");

        // 다른 주요 로직
        // 함수(); 실행 시키고싶은거야
        System.out.println("Hello World!!");
        executor.execute();
    }
}

class Hello implements ButtonExecutor {
    @Override
    public void execute() {
        // 우리가 정의했는데 우리가 호출하지 않고, 남이 호출하게 하는 함수 = 콜백
        System.out.println("Hello!!!");

    }
}

class onClick implements ButtonExecutor {
    @Override
    public void execute() {
        // 우리가 정의했는데 우리가 호출하지 않고, 남이 호출하게 하는 함수 = 콜백
        System.out.println("Hello!!!");

    }
}