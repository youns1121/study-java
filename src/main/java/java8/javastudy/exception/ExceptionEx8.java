package java8.javastudy.exception;

public class ExceptionEx8 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0); //예외발생
            System.out.println(4);
        } catch (ArithmeticException ae){
            ae.printStackTrace(); // 생성된 ArithmeticException인스턴스에 접급가능
            System.out.println("예외메시지 : " + ae.getMessage());
        } // try-catch.의 끝
        System.out.println(6);
    }// main메서드 끝
}
