package p3;

public class UserService {
    public static void findUser(String id) throws UserNotFoundException {
        // 유저가 없다고 가정
        throw new UserNotFoundException("유저 없음: " + id);
    }
}
