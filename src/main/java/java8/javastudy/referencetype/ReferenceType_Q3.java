package java8.javastudy.referencetype;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 키보드로부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램 입니다.
 * 실행 결과를 보고, 알맞게 작성해 보세요(참고로 16라인에서 Scanner의 nexInt() 메소드는 콘솔에 입력된 입력된 숫자를 읽고 리턴합니다    `
 */
public class ReferenceType_Q3 {

    public static void main(String[] args) {

        boolean run = true;
        int studentNum = 0;
        int result = 0;

        int[] scores = null; // 배열 초기화 해줘야함
        ReferenceType_Q3 referenceType_q3 = new ReferenceType_Q3();
        Scanner scanner = new Scanner(System.in);

        while (run){
            System.out.println("-------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("-------------------------------------------");
            System.out.print("선택> ");

            int selectNo = scanner.nextInt();

            if (selectNo == 1) {
                // 작성 위치
                System.out.print("학생수> ");
                studentNum = scanner.nextInt();
                scores = new int[studentNum]; // 배열 객체 생성을 반복문에 넣을 경우 객체가 생성 되고 나서 입력을 했으므로 마지막 배열만 저장이됨

            } else if(selectNo == 2) {
                // 작성 위치
                for(int i =0; i<studentNum; i++){
                    System.out.print("scores"+"["+i+"]: ");
                    scores[i] = scanner.nextInt();

                }
            } else if(selectNo == 3) {
                // 작성 위치
                for(int i=0; i<studentNum; i++){
                    System.out.println("scores"+"["+i+"]: "+ scores[i]);
                }
            } else if(selectNo == 4) {
                // 작성 위치
                System.out.println("최고 점수: " + Arrays.stream(scores).max().getAsInt());
                for(int i = 0; i<scores.length; i++){
                    result += scores[i];
                }
                System.out.println("평균 점수: " + (double)result/scores.length);

            } else if(selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");

        }
}
