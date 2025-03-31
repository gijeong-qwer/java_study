package polymorphsim;

public class SamsungTv implements Tv {

    private Speaker speaker; // public 하면 User가 직접하라는거나 마찬가지

    // 생성자 주입 기능 코드 >> spring 들어가면 주입임
    public SamsungTv(Speaker speaker) {
        this.speaker = speaker;
    }

    public void powerOn() {
        System.out.println("삼성 티비 전원을 켜다");
    }

    public void powerOff() {
        System.out.println("삼성 티비 전원을 끄다");
    }

    public void volumeUp() {
        speaker.soundUp();
    }

    public void volumeDown() {
        speaker.soundDown();
    }
}
