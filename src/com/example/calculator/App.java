package com.example.calculator;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요");
            int input1 = sc.nextInt();
            if (input1 >= 0) {
                cal.setFirstNum(input1);
            }

            System.out.println("두 번째 숫자를 입력하세요");
            int input2 = sc.nextInt();
            if (input2 > 0) {
                cal.setSecondNum(input2);
            } else {
                System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다. 다시 입력해주세요.");
                continue; // 처음으로 돌아가기
            }

            System.out.println("사칙 연산 기호를 입력하세요 (+, -, *, /)");
            char operator = sc.next().charAt(0);
            if ("+-*/".indexOf(operator) == -1) {
                System.out.println("올바르지 않은 연산자입니다. 다시 입력해주세요.");
                continue; // 처음으로 돌아가기
            }
            cal.setOperator(operator);

            cal.calculate(cal.getFirstNum(), cal.getSecondNum(), cal.getOperator());
            System.out.println("결과: " + cal.getResult());

            while (true) {
                System.out.println("더 계산하시겠습니까? [Y/N]");
                System.out.println("계산 종료: exit");
                System.out.println("기록 보기: 기록");
                System.out.println("기록 삭제: 삭제");

                String input3 = sc.next();
                switch (input3) {
                    case "exit":
                        System.out.println("계산을 종료합니다.");
                        return; // 프로그램 종료
                    case "기록":
                        if (cal.getResultList().isEmpty()) {
                            System.out.println("저장된 기록이 없습니다.");
                        } else {
                            for (int i = 0; i < cal.getResultList().size(); i++) {
                                System.out.println("[" + i + "] 번째: " + cal.getResultList().get(i));
                            }
                        }
                        continue; // inner while로 돌아가기
                    case "삭제":
                        System.out.println("몇 번째 계산 기록을 삭제하겠습니까?");
                        int index = sc.nextInt();
                        if (index < 0 || index >= cal.getResultList().size()) {
                            System.out.println("잘못된 인덱스입니다. 다시 시도해주세요.");
                        } else {
                            cal.removeResult(index);
                            System.out.println(index + "번 계산 기록이 삭제되었습니다.");
                        }
                        continue; // inner while로 돌아가기
                    case "Y":
                        System.out.println("다음 계산을 준비합니다...");
                        break; // outer while로 돌아가기
                    case "N":
                        System.out.println("계산을 종료합니다.");
                        return; // 프로그램 종료
                    default:
                        System.out.println("올바르지 않은 입력입니다. 다시입력해주세요.");
                        return; // 프로그램 종료
                }break;
            }
        }
    }
}
