package polymorphsim;

public class XiaomiTv implements Tv {
    public void powerOn() {
        System.out.println("샤오미tv의 전원을 켠다");
    }

    public void powerOff() {
        System.out.println("샤오미tv 의 전원을 끈다 ");
    }

    public void volumeUp() {
        System.out.println("샤오미tv 소리를 올린다");
    }

    public void volumeDown() {
        System.out.println("샤오미tv 소리를 내린다");
    }

}
