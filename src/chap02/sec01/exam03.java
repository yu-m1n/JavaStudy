package chap02.sec01;

public class exam03 { //변수값 교환 VariableExchangeExample.java
    public static void main(String[] args) {
        int x = 3;
        int y = 5;

        System.out.println("x:" + x + ", y:"+ y);

        int temp = x; //변수 temp 생성 후 기존 x값 3 저장
        x = y; //기존 변수 x에 y 값 5 저장(복사)
        y = temp; // 기존 y값에 temp 값(x값 3) 저장
        System.out.println("x:" + x + ", y:"+ y);
    }
}
