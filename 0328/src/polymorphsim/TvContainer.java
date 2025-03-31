package polymorphsim;

import java.util.HashMap;
import java.util.Map;

// container의 역할 : 인스턴스 라이프사이클 관리 , 의존 관리리
public class TvContainer {
    private Map<String, Tv> map = new HashMap<>();

    public TvContainer() {

        // 의존 관리 설정 ..코드... Spring 으로 넘어가면 xml 또는 어노테이션으로 넘어감감
        AppleSpeaker appleSpeaker = new AppleSpeaker();
        SonySpeaker sonySpeaker = new SonySpeaker();

        map.put("samsung", new SamsungTv(sonySpeaker)); // DI
        map.put("lg", new LgTv(appleSpeaker)); // DI
        map.put("xiaomi", new XiaomiTv());
    }

    public Tv getTv(String type) {
        return map.get(type);
    }

}

// 공장컨테이너 만들때
// p_ublic Tv createTv(String type){ // public 주석처리가 안되네네
// switch(type){ // switch는 이런 경우 외엔 잘 안씀
// case "samsung" : return new SamsungTv();
// case "lg" : return new LgTv();

// }
// return null;
// }