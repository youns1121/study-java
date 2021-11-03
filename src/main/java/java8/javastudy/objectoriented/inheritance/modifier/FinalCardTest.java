package java8.javastudy.objectoriented.inheritance.modifier;

class Card{
    final int NUMBER; //상수지만 선언과 함께 초기화 하지 않고 생성자에서 단 한번만 초기화 할 수 있음
    final String KIND;

    static int width = 100;
    static int height = 250;

    Card(String kind, int num){
        KIND = kind;  // 매개변수로 넘겨받은 값으로 KIND와 NUMBER를 초기화 시킨다
        NUMBER = num;
    }

    public Card() {
        this("HEART",1);

    }

    @Override
    public String toString() {
        return "Card{" +
                "NUMBER=" + NUMBER +
                ", KIND='" + KIND + '\'' +
                '}';
    }
}

public class FinalCardTest {

    public static void main(String[] args) {

        Card card = new Card("AAA",10);

//        card.NUMBER; 에러
        System.out.println(card.KIND);
        System.out.println(card.NUMBER);


        System.out.println(card); //  ==      System.out.println(card.toString());


    }
}
