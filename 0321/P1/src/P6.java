public class P6 {
    public static void main(String[] args) {

        // static은 사용용도가 한정적

        System.out.println("안녕하세요"); // new System 안한이유 : out이 어떠한 클래스의 static필드임 ,println()은 static이 안붙어있음
        // println()은 스태틱이 안붙어있을거임, 참조주소명. public static final PrintStream out = null;
        // System 클래스의 out이란 변수 , println은 왜 static이 안붙어있지? out이 클래스명이 아니기 때문에 참조주소명.메소드 형식으로 사용되서
        // static이 아니라는걸 추론가능함

        // Math.어쩌구 싹다 static임
        double result = Math.sin(5); // 객체의 멤버 변수가 없고, 단순한 계산 값만 필요하기 때문!
        // Java는 함수 개념이 없지만, static 메서드를 함수처럼 사용할 수 있음.
        // 객체를 만들 필요 없이 바로 사용이 가능하고, 상태(멤버 변수)를 가지지 않음.
        // 또한, 메모리 할당 위치가 메서드 영역(Method Area)에 존재!


    }
}

class StudentP6 {
    String name;
    int age;
    int score;
    // static int count; 논리적으로는 가능한데 이정도면 다른 클래스로 가야해서 안씀

}
