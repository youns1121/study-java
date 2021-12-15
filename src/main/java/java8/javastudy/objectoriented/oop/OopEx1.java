package java8.javastudy.objectoriented.oop;

public class OopEx1 {

    public static void main(String[] args) {

        Customer customer = new Customer(1000);
        VendingMachine vendingMachine = new VendingMachine(10, 3); //오렌지주스 10개, 사과주스 3개가 먹고싶다.


        //오렌지 주스가 먹고싶군요
        String wentJuice = "OrangeJuice";

        int pay = vendingMachine.buy(wentJuice, customer.getChanges());

        //지불비용이 0원일 떄 == 구매 실패시
        if(pay == 0){
            customer.resettingJuice(pay, null);
        }else{
            customer.resettingJuice(pay, wentJuice);
        }
        System.out.println(customer); // 여기서 toString 실행

    }
}
