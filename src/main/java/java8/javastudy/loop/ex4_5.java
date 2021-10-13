package java8.javastudy.loop;

/**
 * 다음의 for문을 while문으로 변경하시오.
 */
public class ex4_5 {
    public static void main(String[] args) {

//        for(int i=0; i<10; i++){
//            for(int j = 0; j<=i; j++)
//                System.out.println("*");
//           System.out.println();
//            }

        int n = 0;
        int m = 0;

        while(n <= 10){
            m=0;
            while(m<n){
                System.out.println("*");
                m++;
            }
            System.out.println();
            n++;

        }


        } //end of main
    }  // end of class

