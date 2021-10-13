package java8.javastudy.loop;

/**
 * 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
 * 100이상이 되는지 구하시오.
 */
public class ex4_4 {
    public static void main(String[] args) {

        int result = 0;



            for(int i=1; result<=100; i++){
                if(i % 2 == 0){
                    result -= i;
                }
                else {
                    result += i;

                }
                if(result == 100){
                    System.out.println("정답은: " + i + " " +"총합: " + result);

                }
            }


    }
}
