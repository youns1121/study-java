package java8.javastudy.nestedclass;

/**
 * 다음과 같이 Car 클래스 내부에 Tire와 Engine이 멤버 클래스로 선언되어 있습니다.
 * nestedclass_Q1에서 멤버 클래스의 객체를 생성하는 코드를 작성해보세요
 */

public class nestedclass_Q1 {
    public static void main(String[] args) {
        Car myCar = new Car(); // Outer 클래스 객체 생성

        Car.Tire tire = myCar.new Tire(); // Inner 클래스 객체 생성

        Car.Engine engine = new Car.Engine(); // static Inner 클래스 객체 생성
    }
}
