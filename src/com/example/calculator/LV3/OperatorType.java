package com.example.calculator.LV3;

public enum OperatorType{
    ADD('+'){
        @Override
        public double calculate(double firstNum, double secondNum) {
            return firstNum + secondNum;
        }
    },
    SUBTRACT('-'){
        @Override
        public double calculate(double firstNum, double secondNum) {
            return firstNum - secondNum;
        }
    },
    MULTIPLY('*'){
        @Override
        public double calculate(double firstNum, double secondNum) {
            return firstNum * secondNum;
        }
    },
    DIVIDE('/'){
        @Override
        public double calculate(double firstNum, double secondNum) {
            return firstNum / secondNum;
        }
    };

    // 1. 속성(필드)
    // enum 각 상수에 연관된 char op(연산자)를 저장하는 변수 선언.
    private final char op;

    // 2.생성자
    OperatorType(char op) {
        this.op = op;
    }

    public char getOp() {
        return op;
    }

    // 3.메서드

    // 입력받은 연산자와 op를 비교해서 일치하면 반환
    public static OperatorType toOperatorType(char operator) {
        for (OperatorType type : values()) {
            if (type.op == operator) {
                return type;
            }
        }
        throw new IllegalArgumentException("올바르지 않은 연산자입니다: " + operator);
    }


    // 추상 메서드
    public abstract double calculate(double firstNum, double secondNum);
}
