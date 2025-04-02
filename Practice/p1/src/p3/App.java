package p3;

public class App {
    public static void main(String[] args) {
        try {
            UserService.findUser("abc123");
        } catch (UserNotFoundException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}
