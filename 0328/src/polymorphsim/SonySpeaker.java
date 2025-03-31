package polymorphsim;

public class SonySpeaker implements Speaker {
    public void soundUp() {
        System.out.println("소니 스피커 소리를 올린다.");
    }

    public void soundDown() {
        System.out.println("소니 스피커 소리를 내린다");
    }

}
