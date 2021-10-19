package java8.javastudy.array;

/**
 * 문제 5-6에 동전의 개수를 추가한 프로그램이다. 커맨드라인으로부터 거슬러 줄
 * 금액을 입력받아 계산한다. 보유한 동전의 개수로 거스름돈을 지불할 수 없으면, ‘거스름
 * 돈이 부족합니다.’라고 출력하고 종료한다. 지불할 돈이 충분히 있으면, 거스름돈을 지불
 * 한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다. (1)에 알맞은 코드를 넣
 * 어서 프로그램을 완성하시오.
 */
public class ex5_7 {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("USAGE: java ex5_7");
            System.exit(0);
        }

        //문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
        int money = Integer.parseInt(args[0]); //3170 원

        System.out.println("money = " + money);

        int[] coinUnit = {500, 100, 50, 10}; //동전의 단위
        int[] coin = {5, 5, 5, 5}; //동전별 갯수

        for(int i=0; i< coinUnit.length; i++){
            int coinNum = 0;
            //(1)
            coinNum = money / coinUnit[i];
            if(coinNum > coin[i]){
                coinNum = coin[i];
                coin[i] = coin[i] - coinNum;
            }
            else coin[i] = coin[i] - coinNum;

            money = money - (coinUnit[i] * coinNum);
//            coinUnit[i]=coinUnit[i] - coin[i];


            System.out.println(coinUnit[i]+"원: "+coinNum);
        }
        if(money > 0){
            System.out.println("거스름돈이 부족합니다.");
            System.exit(0); //프로그램을 종료한다.
        }
        System.out.println("=남은 동전의 개수 =");

        for (int i =0; i< coinUnit.length;i++){
            System.out.println(coinUnit[i]+"원: "+coin[i]);
        }
    }
}
