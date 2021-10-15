package java8.javastudy.loop;

/**
 * 구구단의 일부분을 다음과 같이 출력하시오
 */
public class ex4_12 {

    public static void main(String[] args) {

        int result = 0;

        for(int i = 2; i<=9; i++){
            System.out.println(" ");
            for (int j = 1; j<=3; j++){
                System.out.printf("%d * %d = %d", i, j, i*j);
                System.out.println(" ");
            }
        }
    }
}
