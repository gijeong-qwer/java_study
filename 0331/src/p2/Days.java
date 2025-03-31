package p2;

public enum Days {
    MON, TUE, WED, THU, FRI, SAT, SUN
}
// 매핑할 수 있는데 ex) MON("월요일") >> 하고 로직 짜서가능한데 이러면 enum타입이 아니라 String 이라 타입안정성이 확보가
// 안됨