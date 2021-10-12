package java8.javastudy.loop;

/**
 * 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
 */
public class ex4_3 {

    public static void main(String[] args) {
        int a=0;
        int result=0;

        for(int i = 1; i<=10; i++){
            a=0;
            for(int j=1; j<=i; j++){
                a += j;
            }
            result += a;
        }
        System.out.println("결과값: " + result);
    }


}
