package java8.javastudy.objectoriented.polymorphism;

class Product{

    int price;
    int bounsPoint;

    public Product(int price){
        this.price = price;
        bounsPoint = (int) (price/10.0); //보너스 점수는 제품가격의 10%
    }
}

class Tv extends Product{


    Tv(){
        super(100);
    }

    public Tv(int price) {
        super(price);
    }

    //Object클래스의 toString()을 오버라이딩한다.
    public String toString(){
        return "Tv";
    }
}

class Computer extends Product{

    Computer(){
        super(200);
    }
    public String toString(){
        return "Computer";
    }
}

class Buyer{ //고객, 물건을 사는사람

    int money = 1000;
    int bounsPoint = 0; //보너스 점수

    void buy(Product p){
        if(money < p.price){ //고객이 가지고 있는 돈이 물건 값보다 적을 경우
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price; // 가딘 돈에서 구입한 제품의 가격을 뺀다
        bounsPoint += p.bounsPoint; //제품의 보너스 점수를 추가한다
        System.out.println(p + "을/를 구입하셨습니다.");
    }
}


public class PolyArgumentTest {

    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv()); //객체를 생성함
        b.buy(new Computer());

        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스점수는 " + b.bounsPoint + "점입니다.");
    }
}
