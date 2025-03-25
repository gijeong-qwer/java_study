package com.choongang.stm.controller;

import com.choongang.stm.service.Service;
import com.choongang.stm.uitl.IoUtil;

// controller 역할: 전체 흐름을 담당한다

// 클래스 활용 원칙: *** SOLID 원칙 (규칙이 아니라 원칙임!!!)
// 특히 SRP 원칙  - 단일 책임 원칙   >> 추상화 레벨이 중요함 >> 추상화 레벨에 따라 단일 책임 원칙이 지켜지기도하고 안지켜지기도한다
// ex) 요리를 한다, 재료를 산다
// 하나의 메서드는 단 하나의 일만해야한다 (하나의 메서드에는 코드가 3줄이상 넘어가는것도 벅차다)
// 하나의 클래스는 단 하나의 일만해야한다
// 코드를 리팩토링할것임

// component : 로직을 담당함 >> Controller는 component임
public class Controller {

    private Service service = new Service();
    // new Controller 생성후 연쇄적으로 new Service 가 생성됨 >>LC(라이프 사이클)이 동시에 돌음음

    public void run() {
        // System.out.println("테스트 실행"); 잘 작동하는지 점검

        hello();

        while (true) {
            showMenu();
            String command = selectCommand(); // selectCommand() 자체를 쓰려고했는데 따로 받는이유 >> selectCommand의 기능은 select만 해야하기
                                              // 때문

            if (isExitCode(command)) {
                break;
            }
            branchFlowByCommand(command);
            waitForEnter();
        }

        bye();

    }

    private void hello() {
        IoUtil.print("************************************************");
        IoUtil.print("*              학생 관리 프로그램              *");
        IoUtil.print("*              version 2.0                     *");
        IoUtil.print("*              제작자 : 박기정                 *");
        IoUtil.print("************************************************");
    }

    private void bye() {
        IoUtil.print("프로그램이 종료됩니다.");
        IoUtil.print("이용해주셔서 감사합니다.");
    }

    private void showMenu() {
        IoUtil.print("===== 메뉴 =====");
        IoUtil.print("1. 학생 정보 등록");
        IoUtil.print("2. 학생 정보 출력");
        IoUtil.print("3. 학생 정보 검색");
        IoUtil.print("4. 학생 정보 삭제");
        IoUtil.print("5. 학생 정보 수정");
        IoUtil.print("6. 학생 정보 통계");
        IoUtil.print("0. 프로그램 종료");
    }

    private String selectCommand() {
        String command = IoUtil.input("입력 > ");
        return command; // return IoUtil.input("입력 > "); 이렇게 작성해도됨 2줄 > 1줄로 압축
    }

    private boolean isExitCode(String command) {
        return command.equals("0");
    }

    private void branchFlowByCommand(String command) { // flow를 나누겠다
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
                IoUtil.print("잘못된 입력을 하셨습니다. 메뉴를 잘 보시고 다시 선택해주세요");

        }
    }

    private void waitForEnter() {
        IoUtil.pause();
    }
}
