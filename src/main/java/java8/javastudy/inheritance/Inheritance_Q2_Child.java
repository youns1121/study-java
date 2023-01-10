package java8.javastudy.inheritance;

import java8.javastudy.objectoriented.Parent;

/**
 * Parent 클래스를 상속받아 Child 클래스를 다음과 같이 작성했습니다.
 * ChildExample .클래스를 실행했을 때 호출되는 각 클래스의 생성자의 순서를 생각하면서 출력 결과를 작성해보세요.
 */
public class Inheritance_Q2_Child extends Parent {

    private String name;

    public String getName() {
        return name;
    }

    public Inheritance_Q2_Child() {
        this("홍길동");
        System.out.println("Child() call");
    }

    public Inheritance_Q2_Child(String name) {

        this.name = name;
        System.out.println("Child(String name) call");
    }
}
