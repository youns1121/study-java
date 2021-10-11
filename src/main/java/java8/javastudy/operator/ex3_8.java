package java8.javastudy.operator;

/**
 * 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
 */
public class ex3_8 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);  //beFore : byte c = a + b;

        char ch = 'A';
        ch = (char) (ch + 2); // beFore : ch = ch + 2
        float f = (float)3/2; // before : float f = 3/2
        long l = 3000l * 3000l * 3000l; // before :  long l = 3000 * 3000 * 3000

        float f2 = 0.1f;
        double d = 0.1f; // before :  double d = 0.1

        boolean result = d == f2;

        System.out.println("c="+c);
        System.out.println("ch="+ch);
        System.out.println("f="+f);
        System.out.println("l="+l);
        System.out.println("result="+result);

    }
}
