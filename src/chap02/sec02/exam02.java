package chap02.sec02;

public class exam02 { //byte 타입 변수 ByteExample.java
    public static void main(String[] args) {
        //byte 자료형 값 허용범위 -128 ~ 127
        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127;
        //byte var6 = 128; //컴파일 에러 -> byte 자료형 허용범위에 맞지 않는 값 같은 이유로 -129도 불가

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        //System.out.println(var6);
    }
}
