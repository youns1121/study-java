package java8.javastudy.inheritance;

/**
 * Tire 클래스를 상속받아 SnowTrie 클래스를 다음과 같이 작성했습니다. SnowTimeExample 클래스를 실행했을 때 출력 결과는 무엇일까요?
 */
public class Inheritance_Q3_SnowTireExample {
    public static void main(String[] args) {
        Inheritance_Q3_SnowTire snowTire = new Inheritance_Q3_SnowTire();
        Inheritance_Q3_Tire tire = new Inheritance_Q3_Tire();

        snowTire.run();  // out put: 스노우 타이어가 굴러갑니다

        tire.run(); // out put:    일반 타이어가 굴러갑니다.

    }
}
