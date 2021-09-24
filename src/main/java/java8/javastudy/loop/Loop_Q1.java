package java8.javastudy.loop;


/**
 * 책 : 이것이 자바다(한빛미디어)
 * for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해보세요
 */
public class Loop_Q1 {

    public static void main(String[] args) {

        int i;
        int result = 0;

        for(i = 1; i <= 100; i++){

            if (i % 3 == 0){

                result += i;

            }
        }
        System.out.println("3의 배수의 합: "+ result);

    }
}
