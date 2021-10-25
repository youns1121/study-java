package java8.javastudy.objectoriented;

/**
 * 문제7-1의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하시오.
 * [주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
 */
class SutdaDect2 {

    final int Card_NUM = 20;
    StudaGoStop2[] cards = new StudaGoStop2[Card_NUM];

    public SutdaDect2() {
        /*
                Ex7_1 정답
         */
        int j=1;
        int tmp = 1;

        for(int i=0; i< cards.length; i++) {
            if(!(j==1 || j==3|| j==8)) {
                cards[i] = new StudaGoStop2(j, false);
            } else if(tmp==1){

                cards[i] = new StudaGoStop2(j, true);
            } else cards[i] = new StudaGoStop2(j, false);

            j++;
            if(j > 10){
                j=1;
                tmp++;
            }
        }
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
        SutdaDect deck = new SutdaDect();

        for(int i=0; i <deck.cards.length; i++){
            System.out.print(deck.cards[i]+", ");
        }

        System.out.println("");

        System.out.println();

    }

}
