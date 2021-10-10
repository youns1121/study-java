package java8.javastudy.operator;

/**
 * 아래는 변수 num의 값에 따라 '양수', '음수' '0'을 출력하는 코드이다. 삼향 연산자를 이용해서 알맞은 코드를 넣으시오
 * [Hint] 삼항 연산자를 두 번 사용하라.
 */
public class ex3_3 {
    public static void main(String[] args) {
        int num = -1;
        if(num > 0) {
            System.out.println("양수");
        }else if(num == 0){
                System.out.println("0");
        }else if(num < 0){
            System.out.println("음수");
        }

    }
}
