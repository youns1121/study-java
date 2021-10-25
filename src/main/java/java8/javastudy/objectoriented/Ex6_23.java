package java8.javastudy.objectoriented;

/**
 *메서드명 : max
 * 기 능 주어진 형 배열의 값 중에서 제일 큰 값을 반환한다 : int .
 * 만일 주어진 배열이 이거나 크기가 인 경우 를 반환한다 null 0 , -999999 .
 * 반환타입 : int
 * 매개변수 최대값을 구할 배열
 */
public class Ex6_23 {

    /*
    (1) max메서드를 작 성하시오.
     */
    private static int max(int[] data){

        int maxResult = 0;
        if(data == null || data.length == 0){
            return -999999;
        }
        for(int i=0; i< data.length; i++) {
            if(maxResult < data[i]){
                maxResult = data[i];
            }
        }
        return maxResult;
    }

    public static void main(String[] args) {
        int [] data = {3,2,9,4,7,5,1,10,6,8};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:"+max(data));
        System.out.println("최대값:"+max(null));
        System.out.println("최대값:"+max(new int[]{})); // 크기가 0인 배열


    }
}
