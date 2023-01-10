package java8.javastudy.inheritance;

import java8.javastudy.objectoriented.Parent;

/**
 * Parent 클래스를 상속해서 Child 클래스를 다음과 같이 작성했는데, Child 클래스의 생성자에서 컴파일 에러가 발생했습니다.
 * 그 이유를 설명해보세요 */
//클래스 대소문자 구분
public class Inheritance_Q1_Child extends Parent {

    private int studentNo;

    //메소드 첫 줄에 부모의 생성자 호출을 해야함 : super() or super(name)
    public Inheritance_Q1_Child(String name, int studentNo) {
        super();
        this.studentNo = studentNo;
    }
}
