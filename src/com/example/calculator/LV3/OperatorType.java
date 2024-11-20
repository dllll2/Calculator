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

    private final char op;

    OperatorType(char op) {
        this.op = op;
    }

    public char getOp() {
        return op;
    }

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
