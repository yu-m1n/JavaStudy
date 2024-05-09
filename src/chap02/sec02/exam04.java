package chap02.sec02;

public class exam04 { //CharExample.java
    public static void main(String[] args) {
        char c1 = 'A';      //문자 그대로 A 저장
        char c2 = 65;       //10진수로 A 저장
        char c3 = '\u0041'; //16진수로 A 저장

        char c4 = '가';     //문자 그대로 가 저장
        char c5 = 44032;    //10진수로 가 저장
        char c6 = '\uac00'; //16진수로 가 저장

        //char c7 = "\uac00"; // '(작은 따옴표)가 아닌 "(큰따옴표)로 감싼 유니코드는 변환되지 않고 에러 발생 -> String 사용해야함

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);

        //System.out.println(c7);
    }
}
