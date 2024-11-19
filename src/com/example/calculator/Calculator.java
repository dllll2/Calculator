//package com.example.calculator;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Calculator {
//
//    // 1. 속성(필드)
//    private final int firstNum;
//    private final int secondNum;
//
//    private final char operator;
//
//
//
//    private static final List<Double> resultList = new ArrayList<>();
//    private double result;
//
//    // 2. 생성자
//    public Calculator(int firstNum, int secondNum, char operator){
//        if(secondNum == 0 && operator =='/'){
//            // IllegalArgumentException : 전달된 인수 값이 잘못된 경우
//            throw new IllegalArgumentException("0으로 나눌수 없습니다.");
//        }
//
//
//        // indexof(operator) 문자열을 순회하면서 operator와 일치하는 문자가 없으면 -1을 반환
//        if("+-*/".indexOf(operator) == -1){
//            // IllegalArgumentException : 전달된 인수 값이 잘못된 경우
//            throw new IllegalArgumentException("올바른 연산자를 입력해주세요!!!");
//        }
//
//        this.firstNum = firstNum;
//        this.secondNum = secondNum;
//        this.operator = operator;
//    }
//
//    // 3. 기능(메서드)
//
//    // 계산 메서드
//    public double calculator(){
//        switch(operator){
//            case '+': result = firstNum + secondNum; break;
//            case '-': result = firstNum - secondNum; break;
//            case '*': result = firstNum * secondNum; break;
//            case '/': result = (double)firstNum / secondNum; break;
//            default: throw new IllegalStateException("올바른 연산자를 입력해주세요!!!");
//        }
//        resultList.add(result);
//        return result;
//    }
//
//    // 결과 기록 리스트 얕은 복사
//    public List<Double> getResultList() {
//        return new ArrayList<>(resultList);
//    }
//
//    // 기록 삭제 메서드
//    public void removeResult(int index){
//        if(index < 0 || index >= resultList.size()){
//            throw new IndexOutOfBoundsException("잘못된 인덱스 입니다!!");
//        }
//        resultList.remove(index);
//    }
//
//    // 마지막으로 계산한 결과 가져오는 메서드
//    public double lastResult(){
//        return result;
//    }
//
//
//
//
//    /*private int firstNum = 0;
//    private int secondNum = 0;
//    private char operator;
//    private List<Double> resultList = new ArrayList<>();
//    private double result = 0.0;
//    private String input3;
//
//    private int index;
//
//    public double calculate(int firstNum, int secondNum, char operator){
//        if(Objects.equals(operator,'+')){
//            result = firstNum + secondNum;
//            resultList.add(result);
//        } else if (Objects.equals(operator,'-')) {
//            result = firstNum - secondNum;
//            resultList.add(result);
//        }else if(Objects.equals(operator,'*')){
//            result = firstNum * secondNum;
//            resultList.add(result);
//        }else if(Objects.equals(operator,'/')){
//            result = (double) firstNum / secondNum;
//            resultList.add(result);
//        }else{
//            System.out.println("잘못된 연산자를 입력하였습니다!");
//        }
//        return result;
//    }
//
//    public void removeResult(int index){
//        resultList.remove(index);
//    }
//
//    public int getFirstNum() {
//        return firstNum;
//    }
//
//    public void setFirstNum(int firstNum) {
//
//        this.firstNum = firstNum;
//    }
//
//    public int getSecondNum() {
//        return secondNum;
//    }
//
//    public void setSecondNum(int secondNum) {
//        this.secondNum = secondNum;
//    }
//
//    public char getOperator() {
//        return operator;
//    }
//
//    public void setOperator(char operator) {
//        this.operator = operator;
//    }
//
//    public String getInput3() {
//        return input3;
//    }
//
//    public void setInput3(String input3) {
//        this.input3 = input3;
//    }
//
//    public double getResult() {
//        return result;
//    }
//
//    public List<Double> getResultList() {
//        return resultList;
//    }
//
//    public int getIndex() {
//        return index;
//    }
//
//    public void setIndex(int index) {
//        this.index = index;
//    }*/
//}
