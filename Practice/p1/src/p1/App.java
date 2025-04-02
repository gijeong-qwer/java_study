package p1;

import java.util.*;

public class App {
    public static void main(String[] args) {
        try {
            ScoreValidator.validateScore(150); // 범위 초과 → 예외 발생
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}

class ScoreValidator {
    public static void validateScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("점수는 0에서 100 사이여야 합니다.");
        }
        System.out.println("유효한 점수: " + score);
    }
}