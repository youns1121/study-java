package java8.javastudy.exception;

public class ExceptionEx2 {

    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i =0; i <10; i++){
            result = number / (int)(Math.random() * 10); // Exception in thread "main" java.lang.ArithmeticException: / by zero, 정수는 0으로 나누는 것이 금지 되어 있음
            System.out.println(result);
        }
    }
}
