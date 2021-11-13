package java8.javastudy.exception;

public class ExceptionEx14 {
    public static void main(String[] args) {
        try{
            method1();
        } catch (Exception e){
            System.out.println("main메서드에서 예외가 처리되었습니다."); //main에서 예외처리
            e.printStackTrace();
        }

    } //main 메서드 끝

    static void method1() throws Exception {
        throw new Exception("ggg"); //메서드에서 예외를 발생시켜서
    }

}
