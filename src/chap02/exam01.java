package chap02;

public class exam01 { //변수 초기화 VariableInitializationExample.java
    public static void main(String[] args){

        //변수 선언
        //int value;
        //연산 값을 result에 넣기 but value 값이 초기화 X -> 오류
        //int result = value + 10;

        int value = 30; //변수 value 선언과 동시에 초기화
        int result = value + 10; //vlaue 값의 초기값을 읽어 연산

        System.out.println(result);
    }
}