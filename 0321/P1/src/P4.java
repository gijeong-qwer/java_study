public class P4 {
    public static void main(String[] args) {
        // this

        StudentP4 st1 = new StudentP4("시연", 26, 100); // 인스턴스가 생성된다 = 필드(속성)가 생성된다
        StudentP4 st2 = new StudentP4("히나", 25, 100); // 인스턴스가 생성된다 = 필드(속성)가 생성된다

        st1.study(5); // this >> st1 this.name ; 저장된 String name = "시연";
        st2.study(3); // this >> st2 , st2.study(3); 에서 가장중요한건 st2
        st1.study(5);
        // study(5); 자바는 함수가 없어서 이런 코드 불가능함

        System.out.println(st1.score);
        System.out.println(st2.score);

        System.out.println(st1.name + "의 점수 : " + st1.score);
        System.out.println(st2.name + "의 점수 : " + st2.score);

    }
}

class StudentP4 {
    String name;
    int age;
    int score;

    // 문법적으로 생성자는 리턴타입을 갖지 않는다
    StudentP4(String name, int age, int score) { // 안쪽에 실행하는 코드를 담는다
        this.name = name; // 생성자는 this.name을 초기화하기위해서 보통씀
        this.age = age;
        this.score = score;

    }

    // ***** 매개변수는 호출하는쪽에 권한(값을 설정)을 주고 , 반영 할 수 있게 해주는 느낌이 강함함
    void study(int hour) { // 사실 일반적으로는 생성자에서만 this를 씀 , this가 안쓰인다 = 응집도가 떨어진다 ,
        // 굳이.. 이 클래스에 이 메서드가 들어가야하는가? 고민**** 다른객체에 포함되야하지않나?
        System.out.println(name); // System.out.println(this.name);
        for (int i = 0; i < hour; i++) {
            score++; // this.score++;
        }

    }

}
