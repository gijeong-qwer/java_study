package polymorphsim;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // [용어] 핵심 !!! 결합도를 낮춘다 !!!
        // [용어] : Ioc ,DI , container , SOLID , OCP , DIP , 디자인 패턴 ,전략패턴
        // 스프링 : Ioc ,DI 둘이 나온이유 결합도를 낮추기 위함 인스턴스의 생성을 따로 분리하기 위함, container
        // Inversion of Control 제어의 역전 (객체 생성/관리를 개발자가 아니라 스프링이 함)
        // Dependency Injection 의존성 주입 (필요한 객체를 직접 만들지 않고 외부에서 넣어줌)
        // Spring Container IoC/DI를 실현하는 주체, 객체를 관리하고 주입해주는 뇌 역할
        // 좋은 코드 : SOLID , OCP , DIP
        // 디자인 패턴 : strategy pattern

        // [프로그램]
        // 사용자가 티비를 본다
        // [요구 사항]
        // 한 타입의 사용자(클래스)들이 존재할 수 있다.
        // 사용자는 여러 타입의 티비들(클래스) 중 하나를 선택해서 볼 수 있다.
        // 티비는 새로운 티비가 출시할 수도 있다.
        // 티비 기능 전원turn on / off 볼륨 + / -

        Scanner sc = new Scanner(System.in);
        System.out.print("브랜드 명을 입력해주세요 > ");
        String brand = sc.nextLine();

        TvContainer container = new TvContainer();

        Tv tv = container.getTv(brand);

        User user = new User();
        user.watchTv(tv);

    }
}
