package polymorphsim;

public class LgTv implements Tv {
    @Override
    public void powerOn() {
        System.out.println("LG 티비 전원을 켜다");
    }

    public void powerOff() {
        System.out.println("LG 티비 전원을 끄다");
    }

    public void volumeUp() {
        System.out.println("LG 티비 소리를 키운다");
    }

    public void volumeDown() {
        System.out.println("LG 티비 소리를 줄인다");
    }
}
