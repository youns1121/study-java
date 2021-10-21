package java8.javastudy.array;

/**
 * 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.
 */
public class ex5_9 {
    public static void main(String[] args) {
        char[][] star = {
        {'*','*',' ',' ',' '},
        {'*','*',' ',' ',' '},
        {'*','*','*','*','*'},
        {'*','*','*','*','*'}
    };
        char[][] result = new char[star[0].length][star.length];

        for(int i=0; i <star.length; i++){
            for(int j=0; j<star[i].length;j++){
                System.out.print(star[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0; i< star.length;i++){
            for(int j=0; j < star[i].length; j++){

                // 구현
                System.out.print(star[i][j]);
                /*
                3,0 | 2,0 | 1,0 | 0,0
                3,1 | 2,1 | 1,1 | 0,1
                3,2 | 2,2
                3,3 | 2,3
                3,4 | 2.4
                 */

            }
        }

        for(int i=0; i < result.length; i++){
            for(int j=0; j < result[i].length; j++){
                System.out.println(result[i][j]);
            }
            System.out.println(" ");
        }

    }
}
