package com.example.calculator;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int firstNum = 0;
        int secondNum = 0;
        double result = 0.0;
        char operator;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요");
            int input1 = sc.nextInt();
            if (input1 >= 0) {
                firstNum = input1;
            }

            System.out.println("두 번째 숫자를 입력하세요");
            int input2 = sc.nextInt();
            if (input2 > 0) {
                secondNum = input2;
            }

            System.out.println("사칙 연산 기호를 입력하세요");
            operator = sc.next().charAt(0);

            if (input2 == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될수 없습니다.");
            }
            
            switch (operator) {
                case '+':
                    result = firstNum + secondNum;
                    break;
                case '-':
                    result = firstNum - secondNum;
                    break;
                case '*':
                    result = firstNum * secondNum;
                    break;
                case '/':
                    result = (double) firstNum / secondNum;
                    break;
                default:
                    System.out.println("잘못된 연산자를 입력하였습니다!");
            }
            System.out.println("결과: " + result);
            System.out.print("더 계산하시겠습니까? exit 입력시 종료");
            String input3 = sc.nextLine();
            if(Objects.equals(input3, "exit")){
                System.out.println("계산을 종료합니다!");
                break;
            }
        }


    }
}
