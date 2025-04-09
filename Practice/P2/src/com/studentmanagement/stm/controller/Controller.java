package com.studentmanagement.stm.controller;

import com.studentmanagement.stm.service.Service;
import com.studentmanagement.stm.util.IoUtil;

public class Controller {

    Service service = new Service();

    public void run() {
        intro();

        while (true) {
            menu();
            String command = choice();
            if (command.equals("0")) {
                break;
            }
            if (command.equals("1")) {
                service.register();
            } else if (command.equals("2")) {
                service.show();
            } else if (command.equals("3")) {
                service.search();
            } else if (command.equals("4")) {
                service.remove();
            } else if (command.equals("5")) {
                service.update();
            } else if (command.equals("6")) {

            } else {
                IoUtil.print("잘못된 입력입니다.");
                continue;
            }
            IoUtil.pause();
        }
    }

    private void intro() {
        IoUtil.print("*****학생관리프로그램******");
    }

    private void menu() {
        IoUtil.print("1. 학생 정보 등록");
        IoUtil.print("2. 등록 학생 확인");
        IoUtil.print("3. 학생 정보 검색");
        IoUtil.print("4. 학생 정보 삭제");
        IoUtil.print("5. 학생 정보 수정");
        IoUtil.print("6. 학생 정보 통계");
        IoUtil.print("0. 프로그램 종료");
    }

    private String choice() {
        return IoUtil.input("원하는 메뉴를 선정해주세요 > ");
    }

}
