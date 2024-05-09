package chap02.sec02;

public class exam03 { //long 타입 변수 LongExample.java
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;
        //long var3 = 1000000000000; //컴파일 에러 -> 허용범위 초과
        long var4 = 1000000000000L; //var3와 같은 값이지만 ㅣ을 추가해 long 타입

        System.out.println(var1);
        System.out.println(var2);
        //System.out.println(var3);
        System.out.println(var4);
    }
}
