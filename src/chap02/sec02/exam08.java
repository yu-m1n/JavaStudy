package chap02.sec02;

public class exam08 { //boolean 타입 BooleanExample.java
    public static void main(String[] args) {
        boolean stop = true;

        if(stop){
            System.out.println("중지합니다");
        }
        else{ //stop 블럭이 false를 가지고 있었을 경우
            System.out.println("시작합니다");
        }
    }
}
