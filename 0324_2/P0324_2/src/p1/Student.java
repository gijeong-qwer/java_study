package p1;

public class Student {
    // 접근 제한자 = 문법과 관련됨 , runtime 시에는 관련 없음 - 문법을 제한
    public String name; // 중요 **해당 필드를 공개하겠다
    protected int age; // 같은 패키지에서만 사용가능 , 다른 패키지에서 age에 접근하려고 하면 불가능함
    // 다른 패키지인데 해당 클래스를 상속하는 경우에만 가능
    int score; // ...글쎄.. 요즘엔 잘 안씀 사장됨
    private String gender; // 중요 **해당 필드를 외부에서 접근을 막겠다(비공개) , 문법적으로 막음 runtime시에는 ㄴㄴ 컴파일 오류와 관련있음

    public void test() {
        this.gender = "hihi~"; // private을 갖고있는 클래스 내부에서는 접근가능

    }

}
