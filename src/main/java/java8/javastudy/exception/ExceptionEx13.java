package java8.javastudy.exception;

public class ExceptionEx13 {

    public static void main(String[] args) {
        method1(); //main 에서 예외를 발생시켜
    }

    static void method1(){
        try{
            throw new Exception("예외발생시키기"); //강제로 예외발생
        } catch (Exception e) {
            System.out.println("method1메서드에서 예외가 처리되었습니다."); //메서드에서 예외를 처리
            e.printStackTrace();
        }

    }



}
