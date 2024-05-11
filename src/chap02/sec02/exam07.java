package chap02.sec02;

public class exam07 { //float와 double 타입 FloatDoubleExample.java
    public static void main(String[] args) {
        //float var1 = 3.14; //컴파일 에러 float 형태로 저장하려면 뒤에 f/F 넣어야함
        float var2 = 3.14f;
        double var3 = 3.14;

        //정밀도 테스트
        float var4 = 0.1234567890123456789f;
        double var5 = 0.1234567890123456789;

        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4); //float는 double의 절반 정도의 데이터 정밀도 가짐
        System.out.println("var5: " + var5);

        double var6 = 3e6; //지수와 가수로 표현된 10진수로 인식
        float var7 = 3e6f;
        double var8 = 2e-3;

        System.out.println("var6: " + var6);
        System.out.println("var7: " + var7);
        System.out.println("var8: " + var8);
    }
}
