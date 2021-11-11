package java8.javastudy.exception;

public class ExceptionEx3 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            try { //예외가 발생할 지점에
                result = number / (int) (Math.random() * 10);
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("0");
            } // try-cath의 끝
        } //for의 끝

    }
}
