package p1;

public class App {
    public static void main(String[] args) {

    }
}

// 개념 : 계약 정의 >> 표준을 정의한다
interface AAA {
    public void move(); // 인터페이스에 있는 메서드는 static을 제외하고는

    public void stop(); // 싹다 abstract임임
}

interface BBB {
    public void qqq();
}

class qwer implements AAA, BBB {
    public void yyy() {

    }

    @Override // 안붙여도됨
    public void move() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void qqq() {

    }
}