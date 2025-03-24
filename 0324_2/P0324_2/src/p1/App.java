package p1; // 컨트롤 탭 하면 최근에 열려있던거 기준으로 빠르게 변경 가능

public class App {
    public static void main(String[] args) {
        System.out.println("discord");

        // 접근 제한자 (캡슐화 - 정보의 은닉)
        Student st1 = new Student(); // 인스턴스 생성

        st1.name = "시연";
        st1.age = 26;
        st1.score = 100;
        // st1.gender = "dddd"; >> private은 외부에서 접근 불가, private 사용하면 접근 불가라고 기억 **

    }
}
