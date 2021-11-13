package java8.javastudy.exception;

public class ExceptionEx9 {

    public static void main(String[] args) {
        try{
//            Exception e = new Exception("고의로 발생시켰음");

//            e.printStackTrace(); //콘솔에 메시지 창을 띄움
            throw new Exception("고의로 발생시켰음");
        } catch (Exception e) {
            System.out.println("e.getMessage() : " + e.getMessage()); // 에러 전달 메시지
            e.printStackTrace(); // 예외 메시지 함께 전달
        }
        System.out.println("프로그램이 정상 종료 되었음");
    }
}

