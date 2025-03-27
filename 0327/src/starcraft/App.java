package starcraft;

public class App {
    public static void main(String[] args) {
        // 스타예제 진짜하기 싫다 근데 일을 받았다고 생각하고 그냥 해보자 .. 항상 관심있는것만 할 순 없으니까
        // [스타크래프트]
        // 각종 유닛을 생산하고 활용(이동, 공격 등)하여 적을 물리치는게임
        // [요구 사항]
        // 유닛이라는 "개념"이 존재한다
        // 유닛의 하위 객체로 프로브(느리고 약함), 질럿(보통속도 강함 , 근접) , 드라군(빠르고 강함, 원거리)
        // 모든 유닛은 속성으로 생명력, 이동 속도, 공격력이 존재한다.
        // 모든 유닛은 이동하다, 공격하다, 멈춘다 라는 기능이 존재한다.
        // 멈춘다 = 모든 유닛이 동일한 로직을 수행한다.
        // 공격하다 = 각 유닛별 로직이 상이하다
        // 이동하다 = 각 유닛별 로직이 상이하다
        // 묶어서 각 기능(명령)을 수행 가능하다

        // 생산...
        Prove p1 = new Prove(); // ****다 Unit으로 짜는게 최고의 코드 >> 변형 생각해보기 ***
        Prove p2 = new Prove();

        Zealot z1 = new Zealot();
        Zealot z2 = new Zealot();
        Zealot z3 = new Zealot();

        Dragoon d1 = new Dragoon();
        Dragoon d2 = new Dragoon();

        Unit[] list = new Unit[5];
        list[0] = p1; // 다형성이 적용됨
        list[1] = d1;
        list[2] = d2;
        list[3] = p2;
        list[4] = z1;

        // 부대이동
        for (Unit unit : list) {
            unit.move();
        }

    }
}

// 개념
class Unit {
    int healthPoint;
    int attackPoint;
    int speed;

    public void move() { // move가 없는 상황 생각해보기
        System.out.println("유닛이 " + speed + "(으)로 이동는 로직 실행");
    }

    public void stop() {
        System.out.println("유닛이 멈추는 로직 실행");
    }

    public void attack() {
        System.out.println("유닛이 " + attackPoint + "(으)로 공격하는 로직 수행");
    }
}

class Prove extends Unit {
    public Prove() {
        healthPoint = 50;
        attackPoint = 3;
        speed = 1;
        // this.healthPoint = 50; or super.healthPoint
        // this.attackPoint = 3;
        // this.speed = 1;
    }

    @Override
    public void move() {
        System.out.println("프로브의 특유의 움직임으로 " + speed + "로 이동하는 로직 수행");
    }
}

class Zealot extends Unit {
    public Zealot() {
        healthPoint = 100;
        attackPoint = 10;
        speed = 2;
    }

    @Override // 문법아님 Override의 컴파일보조
    public void move() {
        System.out.println("질럿 특유의 움직임으로 " + speed + "로 이동하는 로직 수행");
    }
}

class Dragoon extends Unit {
    public Dragoon() {
        healthPoint = 200;
        attackPoint = 10;
        speed = 3;
    }

    @Override
    public void move() {
        System.out.println("드라군 특유의 움직임으로 " + speed + "로 이동하는 로직 수행");
    }

}