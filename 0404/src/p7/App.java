package p7;

import java.util.UUID;

public class App {
    public static void main(String[] args) {
        // 랜덤 값을 만드는데 매우 큰 랜덤값을 만들어야 할 때
        UUID uuid = UUID.randomUUID();
        String id = uuid.toString();
        System.out.println(id);

    }
}
