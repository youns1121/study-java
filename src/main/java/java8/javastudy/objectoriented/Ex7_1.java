package java8.javastudy.objectoriented;

// Ex7_1

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 *  섯다카드 장을 포함하는 섯다카드 한 벌 클래스 을 정의한 것이다 섯 20 (SutdaDeck ) .
 * 다카드 장을 담는 배열을 초기화하시오 단 섯다카드는 부터 까지의 숫자 20 SutdaCard . , 1 10
 * 가 적힌 카드가 한 쌍씩 있고 숫자가 인 경우에는 둘 중의 한 장은 광 이 , 1, 3, 8 (Kwang)
 * 어야 한다 즉 의 인스턴스변수 의 값이 이어야 한다 . , SutdaCard isKwang true .
 */

class SutdaDect {

    final int Card_NUM = 20;
    StudaGoStop[] cards = new StudaGoStop[Card_NUM];

    public SutdaDect() {
        /*
                (1) 배열 SutdaGoStop를 적절히 초기화 하시오.
         */
        int j=1;
        int cy=0;

        List<Integer> kwang= new ArrayList<>();

        for(int i=0; i< cards.length; i++) {
            int tmp = (int)(Math.random()*2);
            if((j==1 || j==3|| j==8) && kwang.contains(j)==false && tmp == 1) {
                    kwang.add(j);
                    cards[i] = new StudaGoStop(j, true);
            } else if((j==1 || j==3|| j==8) && kwang.contains(j)==false && tmp == 0 && cy==1){
                cards[i] = new StudaGoStop(j, true);
            }else cards[i] = new StudaGoStop(j, false);
            j++;
            if(j > 10){
                j=1;
                cy++;
            }
        }
    }
}

class StudaGoStop{
    int num;
    boolean isKwang;

    public StudaGoStop() {
        this(1, true);
    }

    public StudaGoStop(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info() 대신 Object클래스의 toString()을 오버라이딩했디.
    @Override
    public String toString(){
        return num + (isKwang ? "K":"");
    }
}
class Ex7_1{
    public static void main(String[] args) {
        SutdaDect deck = new SutdaDect();

        for(int i=0; i <deck.cards.length; i++){
            System.out.print(deck.cards[i]+", ");
        }

        System.out.println("");

        System.out.println();

    }

}
