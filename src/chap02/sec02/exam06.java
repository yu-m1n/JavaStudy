package chap02.sec02;

public class exam06 { //이스케이프 문자 출력 EscapeExample.java
    public static void main(String[] args) {
        System.out.println("번호\t이름\t직업"); // Tab만큼 띄우기
        System.out.print("행 단위 출력\n"); // 줄바꿈 println이 아니어도 같은 역할
        System.out.print("행 단위 출력\n"); // 줄바꿈
        System.out.println("우리는 \"개발자\" 입니다."); // " 출력
        System.out.println("봄\\여름\\가을\\겨울"); // \출력
    }
}
