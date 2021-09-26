package java8.javastudy.referencetype;

/**
 * 주어진 배열의 항목에서 최대값을 구해보세요(for 문을 이용하세요)
 */
public class ReferenceType_Q1 {
    public static void main(String[] args) {
        int max = 0;
        int [] array = {1, 5, 3, 6, 8, 11, 2};

        //작성 위치


        for (int i=0; i<array.length; i++){
            if (max <= array[i]){

                max = array[i];
            }

        }
        System.out.println("max = " + max);
    }
}
