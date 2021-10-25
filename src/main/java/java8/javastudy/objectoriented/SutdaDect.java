package java8.javastudy.objectoriented;

// Ex7_1

/**
 *  섯다카드 장을 포함하는 섯다카드 한 벌 클래스 을 정의한 것이다 섯 20 (SutdaDeck ) .
 * 다카드 장을 담는 배열을 초기화하시오 단 섯다카드는 부터 까지의 숫자 20 SutdaCard . , 1 10
 * 가 적힌 카드가 한 쌍씩 있고 숫자가 인 경우에는 둘 중의 한 장은 광 이 , 1, 3, 8 (Kwang)
 * 어야 한다 즉 의 인스턴스변수 의 값이 이어야 한다 . , SutdaCard isKwang true .
 */


/*
재 검토 필요
 */
public class SutdaDect {

    final int Card_NUM = 20;
    StudaGoStop[] cards = new StudaGoStop[Card_NUM];

    public SutdaDect() {
        /*
                (1) 배열 SutdaGoStop를 적절히 초기화 하시오.
         */



        int j=1;
        int tmp = 1;

        for(int i=0; i< cards.length; i++) {
            if(!(j==1 || j==3|| j==8)) {
                cards[i] = new StudaGoStop(j, false);
            } else if(tmp==1){

                cards[i] = new StudaGoStop(j, true);
            } else cards[i] = new StudaGoStop(j, false);

            j++;
            if(j > 10){
                j=1;
                tmp++;
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
