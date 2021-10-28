package java8.javastudy.objectoriented;

import java.util.ArrayList;
import java.util.List;

// 미구현

/**
 * 문제7-1의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하시오.
 * [주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
 */
class SutdaDect2 {

    final int Card_NUM = 20;
    StudaGoStop2[] cards = new StudaGoStop2[Card_NUM];

    public SutdaDect2() {
        /* Ex7_1
                (1) 배열 SutdaGoStop를 적절히 초기화 하시오.
         */
        int j=1;
        int cy=0;

        List<Integer> kwang= new ArrayList<>();

        for(int i=0; i< cards.length; i++) {
            int tmp = (int)(Math.random()*2);
            if((j==1 || j==3|| j==8) && kwang.contains(j)==false && tmp == 1) {
                kwang.add(j);
                cards[i] = new StudaGoStop2(j, true);
            } else if((j==1 || j==3|| j==8) && kwang.contains(j)==false && tmp == 0 && cy==1){
                cards[i] = new StudaGoStop2(j, true);
            }else cards[i] = new StudaGoStop2(j, false);
            j++;
            if(j > 10){
                j=1;
                cy++;
            }
        }
    }
    //(1) 위에 정의된 세 개의 메서드를 작성하시오.

    /**Ex7_2
     *배열cards에 담긴 카드의 위치를 뒤섞는다.(Math.random()사용)
     *
     */
    public void shuffle(){
        int cards = (int) (Math.random()*1);
    }

    /**
     * 배열 cards에서 지정된 위치의 StudaGoStop2를 반환한다.
     */

    public StudaGoStop2 pick(int cards){


        return null;




    }

    /**
     * 배열 cards에서 임의의 위치의 StudaGoStop2를 반환한다.(Math.random()사용)
     */

    public StudaGoStop2 pick(){
        StudaGoStop2 sutdaGoStop2 = new StudaGoStop2();

        return sutdaGoStop2;
    }

}

class StudaGoStop2{
    int num;
    boolean isKwang;

    public StudaGoStop2() {
        this(1, true);
    }

    public StudaGoStop2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info() 대신 Object클래스의 toString()을 오버라이딩했디.
    @Override
    public String toString(){
        return num + (isKwang ? "K":"");
    }
}
class Ex7_2{
    public static void main(String[] args) {
        SutdaDect2 deck = new SutdaDect2();

        System.out.println(deck.pick(0));     // 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.

        System.out.println(deck.pick());     //배열 cards에서 임의의 위치의 SutdaCard를 반환한다.(Math.random()사용)

        deck.shuffle(); //배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random()사용)

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ", ");
        }
        System.out.println();
        System.out.println(deck.pick(0));

    }

}
