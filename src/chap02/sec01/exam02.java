package chap02.sec01;

public class exam02 { //변수 사용 VariableExample.java

    public static void main(String[] args) {
        int hour = 3;
        int minunte = 5;

        System.out.println(hour + "시간 " + minunte + "분");

        int totalMinunte = (hour * 60) + minunte; // (3 * 60) + 5 = 185
        System.out.println("총 " + totalMinunte + "분");
    }
}
