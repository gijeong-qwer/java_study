package com.gijeong.practice.controller;

import java.util.Scanner;

import com.gijeong.practice.uitl.IoUtil;

// 기능 불러오기  >> 실질적 기능 >> 기능을 저장하는 구조
public class Controller {
    // 시작후 구현 단계
    // 기능을 사용하려면 어떻게 생각해야할까? 데이터 입력을 받아야함>> 보관 방법과 문법 구조를 생각해야하는데
    // >> 데이터의 입력 기능 >> Scanner 써야함 구조 생각
    // 프로그램에 대한 메뉴 대충 구상해서 틀만 간단하게 만들어볼까
    // ********/ IoUtil.println("zz"); // 초기단계에서 잘못 구상한 점 >> class 내부인데 메소드를 통해
    // 표현해야하는데 직접 표현하려고함
    // 컨트롤러의 생성자에 접근해서 구현해볼까
    // 매개변수가 없는 생성자라면, 내부에 로직을 막 써도 실행할 수 있음.하지만 그렇게 하면 설계상 역할이 뒤섞이기 때문에 유지보수에 좋지
    // 않음.

    // 메서드를 하나 작성해야겠다
    // public Controller() { // Controller 클래스가 App이 있는 패키지와 관련이 없기 때문에 public을 붙여야
    // 한다"
    // System.out.println("asdfasf");
    // }

    public void run() {
        IoUtil.println("프로그램 시작합니다. 학생관리 프로그램 V2");
        // 입력을 받아서 기능을 고르게 하려면 스캐너로 받아보자
        Scanner sc = new Scanner(System.in);
        while (true) {
            IoUtil.println("======메뉴======");
            IoUtil.println("1. 학생 정보 입력");
            IoUtil.println("2. 학생 정보 출력");
            IoUtil.println("3. 학생 정보 검색");
            IoUtil.println("4. 학생 정보 삭제");
            IoUtil.println("5. 학생 응용");
            IoUtil.println("6. 학생 정보 통계");
            IoUtil.println("0. 프로그램 종료");
            IoUtil.print("입력 >");
            String command = sc.nextLine();
            if (command.equals("0")) {
                break;
            }
            if (command.equals("1")) {
                System.out.println("기능1");
            } else if (command.equals("2")) {

            } else if (command.equals("3")) {

            } else if (command.equals("4")) {

            } else if (command.equals("5")) {

            } else if (command.equals("6")) {

            }

        }

    }

}

// 시작전 고민단계

// 학생 입출력에 대한 기능 호출기
// 기능종류
// 학생 데이터 입력 하기위해서는 저장을 해야함 >> 입력 저장기능 생성
// 저장데이터에서-> 목록 출력: 학생목록 출력 / 학생 검색 후 출력
// 학생 데이터 삭제>>
// 추가 기능
// 통계 하나 (추가기능 2)
// 프로그램 종료

// 호출만 할거면 >> 생성이 되야하나? >> 생성자 제한해야하나 흠.. 제한해도 상관없을거 같은데 main함수에서 그러면 못쓰게 되는데
// static처리 할 순 없어
// 생성자 제한하면 안됨 >> 값을 main에서 받을것인가? ㄴㄴ main은 그냥 프로그램을 실행할 수 있는 최초 접근 프로그램으로 사용할 것
// 프로그램 실행용도로만 main을 사용하면 Controller가 실질적 프로그램적 기능을 하게됨 >> 다양한 기능을 Controller 에
// 때려 넣게 되면 >> Controller로 캡슐화한 의미가 떨어짐
// 따라서 기능에 대한 분류가 끝난 시점에서 실질적 기능을 담당하는 Service 클래스를 패키지로 묶어서 기능에 대한 클래스 기술 >>