package java8.javastudy.nestedclass;

/**
 * nestedclass_Q2 클래스의 실행 결과를 보고 Vehicle 인터페이스의 익명 구현 객체를 이용해서 필드, 로컬 변수의 초기값과 메소드의 매개값을 대입해보세요
 */
public class nestedclass_Q2 {
    public static void main(String[] args) {

        Anonymous anonymous = new Anonymous();
        anonymous.field.run();
        anonymous.method1();
        anonymous.method2(
                new Vehicle() {
                    @Override
                    public void run() {
                        System.out.println("트럭이 달립니다.");
                    }
                }
        );

    }
}
