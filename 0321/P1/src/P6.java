public class P6 {
    public static void main(String[] args) {

        // static은 사용용도가 한정적

        System.out.println("안녕하세요"); // new System 안한이유 : out이 어떠한 클래스의 static필드임 ,println()은 static이 안붙어있음
        // println()은 스태틱이 안붙어있을거임, 참조주소명. public static final PrintStream out = null;
        // 시스템이란 클래스의 out이란 변수 println은 왜안붙어있지? out이 클래스명이 아니기 때문에 참조주소명.메소드 형식으로 사용되서
        // static이 아니라는걸 추론가능함

        // Math.어쩌구 싹다 static임
        double result = Math.sin(5); // 멤버의 메모리가 중요한데 멤버가 없어서?? 계산값만중요
        // java는 함수의 개념이 없으나 static을 함수처럼 쓸 수 있음
        // 객체를 만들 필요 없이 바로 사용이 가능해서!!! 또한 상태(멤버 변수)를 갖지 않기 때문!
        // 메모리 영역 위치도 메서드 영역

    }
}

class StudentP6 {
    String name;
    int age;
    int score;
    // static int count; 논리적으로는 가능한데 이정도면 다른 클래스로 가야해서 안씀

}
