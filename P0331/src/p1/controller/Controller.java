package p1.controller;

// import java.security.Provider.Service;  >> 얘는 다른 Service임 항상 확인
import p1.service.Service; // 해당 패키지의 클래스를 가져온다다

import p1.util.IoUtil;

public class Controller {

    Service service = new Service();

    // public Controller() { // 얘 이거 선언하긴 왜 하더라 생성자 인스턴스 생성하면서 헤맬것같아서 였는데..
    // //

    // }

    public void run() {
        intro();
        while (true) { // switch case 진짜 못씀 연습
            showList();
            String command = selectCommand();
            if (isExitCode(command)) {
                IoUtil.print("프로그램을 종료합니다.");
                break;
            }
            selection(command);

            IoUtil.pause();
        }
        Exit();

    }

    private void intro() {

        IoUtil.print("**********************************");
        IoUtil.print("*       학생 관리 프로그램       *");
        IoUtil.print("*       버전:   V2               *");
        IoUtil.print("*       제작자: 박기정           *");
        IoUtil.print("*                                *");
        IoUtil.print("**********************************");
    }

    private void showList() {

        IoUtil.print("=======메뉴========");
        IoUtil.print(" 1. 학생 정보 입력");
        IoUtil.print(" 2. 학생 정보 확인");
        IoUtil.print(" 3. 학생 정보 검색");
        IoUtil.print(" 4. 학생 정보 수정");
        IoUtil.print(" 5. 학생 정보 삭제");
        IoUtil.print(" 6. 학생 정보 통계");
        IoUtil.print(" 0. 프로그램 종료");
    }

    private void selection(String command) {
        switch (command) {
            case "1":
                service.register();
                break;
            case "2":
                service.showList();
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            default:
                IoUtil.print("잘못된 입력을 하였습니다. 메뉴를 잘 보시고 다시 선택해주세요");

        }
    }

    private String selectCommand() {

        return IoUtil.input("원하시는 메뉴를 선택해주세요 > ");
    }

    private boolean isExitCode(String command) {

        return command.equals("0");

    }

    private void Exit() {
        IoUtil.print("프로그램을 종료합니다");

    }
}
