package com.choongang.stm.controller;

import com.choongang.stm.util.IoUtil;
import com.choongang.stm.service.Service;

public class Controller {

    private Service service = new Service();

    // 일정 수준의 반복 이후에... 혹시 추가 반복 중 문법오류(빨간줄) 발생시 파고 들것
    // 단순히 생명주기를 넣기 위해서 인스턴스 생성한것만이 아닌 , 각 선택지마다 인스턴스 선언하는것은 코드의 질이 떨어짐

    // 클래스보다 더 중요한거 로직 만들 수 있는것 (로직짜기)

    public void run() {
        IoUtil.print("*********************************");
        IoUtil.print("*      학생 관리 프로그램       *");
        IoUtil.print("*********************************");

        service.load();

        while (true) {
            IoUtil.print("=== 메뉴 ===");
            IoUtil.print("1. 등록");
            IoUtil.print("2. 목록");
            IoUtil.print("3. 검색");
            IoUtil.print("4. 삭제");
            IoUtil.print("5. 수정");
            IoUtil.print("6. 통계");
            IoUtil.print("0. 종료");
            String command = IoUtil.input("입력 > ");

            if (command.equals("0")) {
                break;
            }

            if (command.equals("1")) {
                // 입력
                service.register();
            } else if (command.equals("2")) {
                // 목록
                service.showList();
            } else if (command.equals("3")) {
                // 검색
                service.search();
            } else if (command.equals("4")) {
                // 삭제
                service.remove();
            } else if (command.equals("5")) {
                // 수정

            } else if (command.equals("6")) {
                // 통계
                service.statistics();
            } else {
                IoUtil.print("잘못 입력하셨습니다 . 다시 입력해 주세요. ");
            }
            IoUtil.pause();
        }
        service.save();

        IoUtil.print("이용해주셔서 감사합니다.");
        IoUtil.print("프로그램을 종료합니다.");
    }
}
