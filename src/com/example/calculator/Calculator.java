package com.example.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Calculator {
    private int firstNum = 0;
    private int secondNum = 0;
    private char operator;
    private List<Double> resultList = new ArrayList<>();
    private double result = 0.0;
    private String input3;

    private int index;

    public double calculate(int firstNum, int secondNum, char operator){
        if(Objects.equals(operator,'+')){
            result = firstNum + secondNum;
            resultList.add(result);
        } else if (Objects.equals(operator,'-')) {
            result = firstNum - secondNum;
            resultList.add(result);
        }else if(Objects.equals(operator,'*')){
            result = firstNum * secondNum;
            resultList.add(result);
        }else if(Objects.equals(operator,'/')){
            result = (double) firstNum / secondNum;
            resultList.add(result);
        }else{
            System.out.println("잘못된 연산자를 입력하였습니다!");
        }
        return result;
    }

    public void removeResult(int index){
        resultList.remove(index);
    }

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public String getInput3() {
        return input3;
    }

    public void setInput3(String input3) {
        this.input3 = input3;
    }

    public double getResult() {
        return result;
    }

    public List<Double> getResultList() {
        return resultList;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
