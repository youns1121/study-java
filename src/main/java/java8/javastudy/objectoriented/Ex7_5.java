package java8.javastudy.objectoriented;

/**
 * 다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고 에러를 수정하기
 * 위해서는 코드를 어떻게 바꾸어야 하는가?
 */

public class Ex7_5 {

    public static void main(String[] args) {
        Tv t = new Tv(50);

        System.out.println(t);

    }


}

class Tv extends Product{

//    Tv() {} // 부모 메서드를 호출하지 않았다

    Tv(int price) {
        super(price);
    }



    @Override
    public String toString() {
        return "Tv{" +
                "price=" + price +
                ", bonusPoint=" + bonusPoint +
                '}';
    }
}

class Product{
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }

}
