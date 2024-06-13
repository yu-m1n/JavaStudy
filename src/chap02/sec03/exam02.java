package chap02.sec03;

public class exam02 { //강제 타입 변환 CastingExample.java
    //(작은 허용 범위 타입)허용 범위 큰 타입 -> 허용 범위 작은 타입
    public static void main(String[] args) {
        int intValue = 40032;
        char charValue = (char)intValue; //()안에 들어가는 타입은 나누는 단위
    }
}
