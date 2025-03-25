package com.gijeong.practice.service;

import java.util.Scanner;

import com.gijeong.practice.repository.Repository;

public class Service {
    // 기능은 외부 패키지에서 접근하고 사용해야하므로 public으로 구성
    private Repository repository = new Repository();
    // Repository와 생명주기 공유

    public void inputStuinfo() {
        // 입력에 대한 기능 스캐너로 받자
        Scanner inputscanner = new Scanner(System.in);
        // 입력받을곳을 저장해야하는데 기능파트가 저장까지 담당하면 설계적으로 완성도가 떨어지므로 다른 패키지로 나누어야함
        // 배열을 저장할 메서드를 Repository로부터 가져옴 = sc.nextLine() ;

    }
}
