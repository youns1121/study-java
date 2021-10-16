package java8.javastudy.loop;

/**
 * 향상된 for문
 */
public class ex4_0_EnhancedForStatement {
    /*
        for (타입 변수명 : 배열 또는 컬렉션){
                //반복할 문장
     */
    public static void main(String[] args) {

        int [] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i=0; i<arr.length; i++){
            System.out.printf("%d ", arr[i]);
        }
        System.out.println("");

        for (int tmp : arr){
            System.out.printf("%d ", tmp);
            sum += tmp;
        }
        System.out.println();
        System.out.println("sum="+sum);
    }
}
