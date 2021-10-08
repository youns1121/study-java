package java8.javastudy.exception;

/**
 * NullPointerException : 객체 참조가 없는 상태, 즉 null 값을 갖는 참조 변수로 객체 접근 연산자인 도트(.)를 사용했을 때 발생
 * 객체가 없는 상태에서 객체를 사용하려 했으니 예외가 발생
 */
public class NullpointerExceptionExample {

    public static void main(String[] args) {
        String data =null; //data 변수는 null 값을 가지고 있기 떄문에 String 객체를 참조하고 있지 않다

        System.out.println(data.toString());
    }
}
