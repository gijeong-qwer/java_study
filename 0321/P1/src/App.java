public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        StudentP7 st1 = new StudentP7();
        st1.name = new String("한조"); // String 내부에서의 "한조"는 char의 배열 // 생성자 문법 : 초기값으로서 "한조를 넣겠다"
        System.out.println(st1.name); // 캡쳐한 내용으로 확인인

    }
}

class StudentP7 {
    String name;
    int age;

}
// 문법규칙은 확실히 해야함 , 왜 써야하는지 생각하는순간 무너짐
// read : 수동적 코드읽기 // 당분간 규칙에 집중**** 충분한 경험을 쌓아야함
// write : 능동적 왜이렇게 짰는지 추상화를 계속해야함
// 궤도에 오른사람은 클래스는 쓰면 쓸수록 이상해짐
// 사용가능한 매개변수가 많다 >> 오버로딩된 메서드가 많다
