package java8.javastudy.inheritance;

/**
 * Parent 클래스를 상속받아 Child 클래스를 다음과 같이 작성했습니다.
 * ChildExample .클래스를 실행했을 때 호출되는 각 클래스의 생성자의 순서를 생각하면서 출력 결과를 작성해보세요.
 */
public class Inheritance_Q2_Parent {

    public String nation;

    public Inheritance_Q2_Parent(){
        this("대한민국");
        System.out.println("Parent() call");
    }

    public Inheritance_Q2_Parent(String nation) {
        this.nation = nation;
        System.out.println("Parent(String nation) call");
    }
}
