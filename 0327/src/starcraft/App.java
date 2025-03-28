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

        ///////////////////////////////////
        // 다형성의 핵심 : 무엇이 실행될지 모르는것 - 다형성 기준 문법적으로 정함함
        // 코드 작성시 핵심 객체를 기준으로 코딩하지 않음(프로브, 질럿 등)
        // 코드가 분기가 된다고 생각하면 됨 

        // 부대이동
        for (Unit unit : list) {
            unit.move();
        }

        // 부대 공격
        for(Unit unit: list){
            unit.attack();
        }

        // 부대 멈춤
        for(Unit unit: list){
            unit.stop();
        }

        // 개념은 생성되면 안된다! abstract
        // 인스턴스가 생성되면 안될때 
       
    }
}

// 개념
// 유닛을 인스턴스로 생성할 필요가 있나? 없을때 abstract를 사용하는것!!!!!   >> 근데 private으로 생성자 막으면 되는거 아닌가??
abstract class Unit {
    int healthPoint;
    int attackPoint;
    int speed;

    public abstract void move(); // 로직을 오버라이딩 해서 사용할것임 >> 중괄호{} 여는순간 문법 오류임 // 가상함수
    public abstract void stop();
    public abstract void attack();
    // public void attack(){} 이렇게 했으면 오버라이딩을 강제하진 않음, 오버라이딩 할 지 말지 선택 가능 
    // final public void attack (){} // 오버라이딩 불가
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

    @Override
    public void attack() {
        System.out.println("프로브가 " + attackPoint + "(으)로 쀼뷰뷱뷱 공격하는 로직 수행");
    }
    
    @Override
    public void stop(){
        System.out.println("프로브가 멈추는 로직 수행행");
    }

}

final class Zealot extends Unit {  // 클래스 앞에 final 붙으면 상속받지 못함 마지막 자식임임
    public Zealot() {
        healthPoint = 100;
        attackPoint = 10;
        speed = 2;
    }

    @Override // 문법아님 Override의 컴파일보조
    public void move() {
        System.out.println("질럿 특유의 움직임으로 " + speed + "로 이동하는 로직 수행");
    }

    @Override
    public void attack() {
        System.out.println("질럿이 " + attackPoint + "(으)로 뺘뱌뱍 공격하는 로직 수행");
    }
    @Override
    public void stop(){
        System.out.println("질럿이 멈추는 로직 수행행");
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

    @Override
    public void attack() {
        System.out.println("드라군이 " + attackPoint + "(으)로 삐비빅 공격하는 로직 수행");
    }

    @Override
    public void stop(){
        System.out.println("드라군이 멈추는 로직 수행행");
    }

}