package chap02;

public class exam04 { //변수 사용 범위 VariablaScopeExample.java
    public static void main(String[] args) {
        int v1 = 15;
        if(v1 > 10){
            int v2;
            v2 = v1 - 10;
        }
        //int v3 = v1 +v2 + 5; //v2 변수는 if문의 지역 변수이기에 컴파일 오류
    }
}
