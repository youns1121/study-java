package java8.javastudy.objectoriented.oop;

public class VendingMachine { //자판기

    //자판기에 남아 있는 주스 개수

    private int orangeJuice;
    private int appleJuice;


    public VendingMachine(int orangeJuice, int appleJuice) {
        this.orangeJuice = orangeJuice;
        this.appleJuice = appleJuice;
    }

    //오렌지주스 판매가 가능한지 검사
    private boolean orangePossible(int pay) {

        if (orangeJuice > 0) { //오렌지 주스가 0개보다 많다면
            if (pay >= 500) {
                return true;
            }
        }
        return false;
    }


    //사과주스 판매가 가능한지 검사
    private boolean applePossible(int pay){

        if(appleJuice > 0) // 사과 주스가 0개 보다 많다면
            if (pay >= 300){
                return true;
            }
        return false;
    }


    public int buy(String kind, int pay){ // 물품, 지불

        if(kind != null && "OrangeJuice".equals(kind)){
            if(orangePossible(pay)){
                orangeJuice--; // 수량에서 1감소
                System.out.println("오렌지 주스가 정상적으로 구매되었습니다.");

                return 500;
            }
            System.out.println("오렌지 주스를 구매하실 수 없습니다.");
            return 0;
        }
        else if(kind != null && "AppleJuice".equals(kind)){
            if(applePossible(pay)){
                appleJuice--; //수량에서 1감소
                System.out.println("사과 주스가 정상적으로 구매되었습니다.");
                return 300;
            }
            System.out.println("사과 주스를 구매하실 수 없습니다.");
            return 0;
        }
        System.out.println("없는 물품입니다.");
        return 0;
    }
}
