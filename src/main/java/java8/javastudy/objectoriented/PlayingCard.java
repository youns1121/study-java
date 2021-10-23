package java8.javastudy.objectoriented;
//Ex6_8
//다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오
public class PlayingCard {

    int kind;
    int num;

    static int width;
    static int height;

    public PlayingCard(int kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    public static void main(String[] args) {
        PlayingCard card = new PlayingCard(1,1);
    }

    /*
      클래스변수(static변수) : width, height
      인스턴스변수 : kind, num
      지역변수 : PlayingCard(int kind, int num), kind와 num
     */
}
