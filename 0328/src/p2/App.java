package p2;

public class App {
    public static void main(String[] args) {
        // SOLID 원칙 : L, I
        // LSP , ISP

        // LSP 리스코프 치환 원칙 >> 부모의 객체에서 자식의 객체로 바뀌어도 같은 기능을 썼을 때 예측가능한 결과가 나와야함 !!!
        // ex) 오버로딩할때 class AAA extends SomeCalculator return값처럼 말도안되는식으로 하지 말라는것
        // 이거 제일 잘하는게 List >> 모든 list는 알고리즘이 다르지만 100% 똑같이 나옴

        SomeCalculator sc = new SomeCalculator();
        int result = sc.plus(10, 2);
        System.out.println(result);

        // ISP = 인터페이스 분리 원칙
        Dog d1 = new Dog();
        Walkable w1 = new Dog();
        Flyable f1 = new Dog();
        Barkable b1 = new Dog();

    }
}

class SomeCalculator {
    public int plus(int a, int b) {
        // 마구마구.. 로직 실행 ...

        return a + b;

    }
}

class AAA extends SomeCalculator {
    @Override
    public int plus(int a, int b) {
        // 더 멋진 로직 실행..
        return a * b;

    }
}
// ISP 큰단위로 인터페이스 만들지 말고 작은 단위로 만들어라 ex) 동물 같은걸로 ㄴㄴ

interface Walkable {
    public void walk();

    public void run();
}

interface Barkable {
    public void bark();
}

interface Flyable {
    public void fly();
}

class Dog implements Walkable, Barkable, Flyable {
    public void fly() {

    }

    public void bark() {

    }

    public void walk() {

    }

    public void run() {

    }
}