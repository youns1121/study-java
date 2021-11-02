package java8.javastudy.objectoriented.ch7;

public class DeckTest {
    public static void main(String[] args) {

        Deck d = new Deck(); // 카드 한 벌(Deck)을 만든다.
        Card c = d.pick(0); // 섞기 전에 제일 위의 카드를 뽑는다
        System.out.println(c);

        d.shuffle(); // 카드를 섞는다.
        c = d.pick(0); // 섞은 후에 제일 위의 카드를 뽑는다.
        System.out.println(c);
    }
}

class Deck{
    final int CARD_NUM = 52; //카드의 갯수, 상수 선언
    Card cardArr[] = new Card[CARD_NUM]; // Card객체 배열을 포함, Card 클래스 재사용

    Deck(){ // Deck의 카드를 초기화한다.
        int i=0;
        for(int k=Card.KIND_MAX; k >0; k--){ // k(4)는 카드 무늬의 수
            for(int n=0; n< Card.NUM_MAX ; n++){ // 무늬별 카드 수 = 13
                cardArr[i++] = new Card(k, n+1);
            }
        }
    }

    Card pick(int index){ // 지정된 위치(index)에 있는 카드 하나를 꺼내서 반환
        return cardArr[index];
    }

    Card pick(){ //Deck에서 카드 하나를 꺼낸다
        int index = (int) (Math.random() * CARD_NUM);
        return pick(index);
    }

    void shuffle(){ //카드의 순서를 섞는다.
        for(int i=0; i <cardArr.length; i++){ // cardArr 길이 만큼 반복
            int r = (int) (Math.random() * CARD_NUM); // 0~ 41 까지 숫자

            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
}

class Card{ // 카드
    static final int KIND_MAX = 4; // 카드 무늬의 수
    static final int NUM_MAX = 13; //무늬별 카드 수

    static final int SPADE = 4;
    static final int DIAMIND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    int kind;
    int number;

    public Card() {
        this(SPADE, 1);
    }

    public Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString(){
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "012345678XJQK"; //숫자 10은 X로 표현

        return "kind : " + kinds[this.kind]
                + ", number : " + numbers.charAt(this.number);

    }
}
