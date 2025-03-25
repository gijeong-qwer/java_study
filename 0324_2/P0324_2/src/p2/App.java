package p2;

public class App {
    public static void main(String[] args) {
        // 계좌 개설, 입금, 출금 ... 잔액 확인 등...
        Account a1 = new Account("시연", 0);
        Account a2 = new Account("마젠타", 10000);

        // 입금
        a1.deposit(1000); // 단일책임의 원칙
        // a1.balance += 1000;
        a1.deposit(7000);
        // ✔ SRP (단일 책임 원칙) → "클래스(또는 메서드)는 단 하나의 책임만 가져야 한다"는 원칙
        // ✔ 즉, 하나의 클래스는 **하나의 목적(책임)**만 가져야 하며, 여러 기능을 한 곳에 몰아넣으면 안 됨
        // ✔ 코드 유지보수성을 높이고, 변경이 용이하도록 하기 위한 원칙

        // 출금
        a1.withdraw(10000);
        // a1.balance -= 10000; // 그대로 쓰면 위코드랑 달라거 가시성 낮아짐 => 추상화레벨이 낮다

        // 잔액 확인
        // System.out.println(a1.owner + "의 잔액: " + a1.balance);

    }
}

class Account {
    // 내가 향후 5년동안 작성할 모든 코드는 static 정도 제외하고 필드는 무조건 private임!!! java는 원칙적으로 필드 선언할때
    // private으로 하는 수준
    private String owner; // 계좌주
    private int balance; // 잔액

    public Account(String owner, int balnace) {
        this.owner = owner;
        this.balance = balance;

    }

    // 입금
    public void deposit(int value) { // 메서드를 왜 쓰는가..? 영작 (가시성 올라감감)
        balance += value;

    }

    // 출금
    public void withdraw(int value) { // value는 추상화레벨이 너무 높은표현 >> 코드를 이해하기 어려워짐
        if (isInsufficientBalance(value)) { // this.balance
            System.out.println("잔액이 부족합니다.");
            return;
        }
        // this.balance -= value;
        decreaseBalance(value);

    }

    private void decreaseBalance(int value) {
        this.balance -= value;
    }
    // getter (read) - 메서드로 작업 읽기 권한을 주는것

    public String getOwner() {
        // 자바의 bin= 인스턴스
        return owner;
    }

    private boolean isInsufficientBalance(int value) {
        return value > this.balance;
    }
}