package com.gijeongpractice.controller;

import com.gijeongpractice.service.Service;
import com.gijeongpractice.util.IoUtil;

public class Controller {
    // Controller와 생명주기 공유
    Service service = new Service();

    // Service 와 Repo에 집중해보기
    public void run() {
        // todo: Controller 기능 구분 및 추상화는 간단하니까
        // Service와 Repo 구조에 얽힌 사고를 쉽게 풀어갈 수 있게 연습
        producer();
        // IoUtil.pause(); 아직 pause 안만들었네
        while (true) {
            menu();
            String command = setCommand();
            if (isExitProgramming(command)) {
                break;
            }
            if (command.equals("1")) {
                // 1. 입력시 >> 학생 정보 입력
                service.register();
            } else if (command.equals("2")) {
                // 2. 전체 학생 목록
                service.showList();
            } else if (command.equals("3")) {
                // 3. "학생 정보 검색
                service.search();
            } else if (command.equals("4")) {
                // 4. 학생 정보 삭제
                service.deleteInfo();
            } else if (command.equals("5")) {
                // 5. 학생 정보 수정
                service.editInfo();
            } else if (command.equals("6")) {
                // 6. 학생 정보 통계
            } else {
                IoUtil.print("다시 입력해주세요 ");
                continue; // 이거 맞나? 다시 위로 보내고싶은데
            }
            IoUtil.pause();

        }
        ending();

    }

    private void producer() {
        IoUtil.print("************************");
        IoUtil.print("*   학생관리프로그램   *");
        IoUtil.print("*    Ver 2.0           *");
        IoUtil.print("*   제작자: 박기정     *");
        IoUtil.print("************************");

    }

    private String setCommand() {
        return IoUtil.input("원하는 메뉴를 선택하세요 > ");
    }

    private void menu() {
        IoUtil.print("=======메뉴=======");
        IoUtil.print("1. 학생 정보 등록");
        IoUtil.print("2. 전체 학생 목록");
        IoUtil.print("3. 학생 정보 조회");
        IoUtil.print("4. 학생 정보 삭제");
        IoUtil.print("5. 학생 정보 수정");
        IoUtil.print("6. 학생 정보 통계");
        IoUtil.print("0. 프로그램 종료");
        // IoUtil.print("2. 학생 등록 확인"); // boolean 처리 고민
    }

    private boolean isExitProgramming(String command) {
        if (command.equals("0")) {
            return true;
        }
        return false;
    }

    private void ending() {
        IoUtil.print("프로그램을 종료합니다");
        IoUtil.print("사용해주셔서 감사합니다");
    }

}
