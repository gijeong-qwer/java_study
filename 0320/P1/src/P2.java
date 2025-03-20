public class P2 {
    public static void main(String[] args) {
        AAA a1 = null;
        // a1 = new AAA();
        AAA a2 = new AAA();

        String s1 = new String(); // F12 누르면 볼수있음 자세하게

        // AAA a3 = new String(); // 타입 미스매치 : 인스턴스의 모양과 참조변수의 모양은 웬만하면 같아야한다

    }
}

class AAA { // 패키지 배우기 전가지는 클래스명을 중복으로 선언 불가 ex) AAA 두개 만드는거 불가
    // 하나의 프로젝트에서 두개이상의 동일한 클래스를 선언하면 안된다

    // ...상세 정의 내용들...
}