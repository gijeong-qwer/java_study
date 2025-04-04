package p4;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        // java 1.8
        // LocalDate , LocalTime, LocalDateTime 날짜와 관련된 API가 더 세밀해짐
        // ZonedDate, ZonedTime ,ZonedDate

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime old = LocalDateTime.of(2011, 3, 1, 0, 0, 0);

        System.out.println(now);
        System.out.println(old);

        int iValue = now.getDayOfMonth();
        now.getDayOfWeek();
        System.out.println(iValue);
        now.isAfter(old);
        now.isBefore(old);
        // now.minus(null)

    }
}
