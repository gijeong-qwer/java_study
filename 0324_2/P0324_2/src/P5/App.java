package P5;

import java.util.Calendar;

public class App {
    public static void main(String[] args) {
    // 총 복습(문법만)    
    // 스레드의 안정성이 낮아짐 >> 이유찾기 

        Calendar aaa = Calendar.getInstance(); // 대표적인 싱글톤의 예제
        aaa.getTime();


        SomeComponent sc1 = SomeComponent.getInstance(); 
        sc1.doProcess();
        sc1.doProcess();
        sc1.doProcess();
        


        SomeComponent sc2 = SomeComponent.getInstance();
        sc2.doProcess(); 

        // SomeComponent sc3 = new SomoComponent();



    // Math.random();// Math 클래스의 모든 메소드는 static이다 >> Math 클래스는 생성자가 private으로 막혀있음
    // Math a; // 인스턴스 생성을 막는건 가능해도 참조변수 선언을 막을 수 있는 문법은 존재하지않음. 
    // Math a = new Math; 같은거 불가능 


        // SomeComponent sc1 = new SomeComponent();
        // sc1.doProcess();

    }
}

// 단한번만 쓰고 싶을때 doProcess에 static을 붙이면됨 - 근데 상속관련해서 응집도가 떨어짐
// 클래스를 사용하는 디자인패턴

// 싱글톤 패턴 = 특정 클래스의 인스턴스는 단 한개만 생성되게 한정 시키고 싶다!!!
// Component = 기능 관련 클래스... 일반적으로는 한개의 인스턴스가 활용됨
// 싱글톤 패턴: 생성패턴의 종류중 하나 -객체 생성 방식과 관련됨됨
class SomeComponent{
    // 싱글톤 시작
    // 생성자를 private으로 막아버린다
    private SomeComponent(){}


    private static final SomeComponent instance =new SomeComponent();  // instance는 변수명

    public static SomeComponent getInstance(){  // of 나 as 찾아보기
        // getInstance라는 표현 나오면 무조건 싱글톤
  
        return instance;


    }
    /// 싱글톤 끝

    /// 여기서부터는 원래 하던거...
    private String name = "마젠타";

    public void doProcess(){
        // 매우 중요한 핵심 로직!!!! 구현됨
        System.out.println(name+" 핵심 로직 실행");

    }
}

// 고전 싱글톤
// private static SomeComponent instance = null;  // instance는 변수명명

// public static SomeComponent getInstance(){  // of 나 as 찾아보기
//     // getInstance라는 표현 나오면 무조건 싱글톤
//     if(instance == null){
//         instance = new SomeComponent();
//     }
//     return instance;


// }