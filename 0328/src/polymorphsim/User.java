package polymorphsim;

import java.util.Scanner;

public class User {

    public void watchTv(Tv tv) { // ***** 난 이제부터 인스턴스에 관심이 없다 ~~~
        // SOLID 원칙 중 O 위반
        // OCP - 개방 폐쇄 원칙
        // 기능 확장에는 열려야되고 , 코드 수정은 닫혀야 한다 >> 유지 보수 관련 얘기 >> 유지 보수 쪽에서 제작비용보다 많이 들고 코드가
        // 복잡해지기 시작하면서 나쁜코드가 된다
        // 표준을 정의해야 이런일이 줄어듬 >> 표준 정의가 깔끔해야함
        // 의존도 낮추는 코드를 짜는법 >> 조립식도(설계도)를 만든다 , Spring 같은식으로

        tv.powerOn();
        tv.powerOff();
        tv.volumeUp();
        tv.volumeDown();

    }
}
