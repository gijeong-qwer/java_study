package polymorphsim;

public class SamsungTv implements Tv {

    public void powerOn() {
        System.out.println("삼성 티비 전원을 켜다");
    }

    public void powerOff() {
        System.out.println("삼성 티비 전원을 끄다");
    }

    public void volumeUp() {
        System.out.println("삼성 티비 소리를 키운다");
    }

    public void volumeDown() {
        System.out.println("삼성 티비 소리를 줄인다");
    }
}
