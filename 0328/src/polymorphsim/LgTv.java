package polymorphsim;

public class LgTv implements Tv {

    private Speaker speaker;

    public LgTv(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public void powerOn() {
        System.out.println("LG 티비 전원을 켜다");
    }

    public void powerOff() {
        System.out.println("LG 티비 전원을 끄다");
    }

    public void volumeUp() {
        speaker.soundUp();
    }

    public void volumeDown() {
        speaker.soundDown();
    }
}
