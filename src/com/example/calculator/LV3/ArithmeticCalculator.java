package com.example.calculator.LV3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T extends Number> {
    // 1. 속성(필드)
    private final T firstNum;
    private final T secondNum;
    private final OperatorType operator;
    private static final List<Double> resultList = new ArrayList<>();
    private double result;

    // 2. 생성자
    public ArithmeticCalculator(T firstNum, T secondNum, OperatorType operator) {
        if(operator == OperatorType.DIVIDE && (double)secondNum == 0){
            // IllegalArgumentException : 전달된 인수 값이 잘못된 경우
            throw new IllegalArgumentException("0으로 나눌수 없습니다.");
        }

        // indexof(operator) 문자열을 순회하면서 operator와 일치하는 문자가 없으면 -1을 반환
        if("+-*/".indexOf(operator.getOp()) == -1){
            // IllegalArgumentException : 전달된 인수 값이 잘못된 경우
            throw new IllegalArgumentException("올바른 연산자를 입력해주세요!!!");
        }

        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.operator = operator;
    }

    // 3. 기능(메서드)

    // 계산 메서드
    public double calculate(){
        result =  operator.calculate((double) firstNum, (double) secondNum);
        resultList.add(result);
        return result;
    }

    // 결과 기록 리스트 얕은 복사
    public List<Double> getResultList() {
        return new ArrayList<>(resultList);
    }

    // 기록 삭제 메서드
    public void removeResult(int index){
        if(index < 0 || index >= resultList.size()){
            throw new IndexOutOfBoundsException("잘못된 인덱스 입니다!!");
        }
        resultList.remove(index);
    }

    // 입력받은 값보다 큰수 출력하는 메서드
    // stream() 사용
    public List<Double> biggerValue(double inputValue){
        List<Double> biggerValues = resultList.stream().filter((value -> value > inputValue)).toList();
        return biggerValues;
    }

}
