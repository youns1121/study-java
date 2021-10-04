package java8.javastudy.inheritance;

/**
 * Parent 클래스를 상속받아 Child 클래스를 다음과 같이 작성했습니다.
 * ChildExample .클래스를 실행했을 때 호출되는 각 클래스의 생성자의 순서를 생각하면서 출력 결과를 작성해보세요.
 */
public class Inheritance_Q2_ChildEx {

    public static void main(String[] args) {

        Inheritance_Q2_Child child =  new Inheritance_Q2_Child(); // 자식 생성자 생성
        System.out.println(child.getName());
//        Inheritance_Q2_Child child2 =  new Inheritance_Q2_Child(); // 자식 기본생성자 생성
//
//        Inheritance_Q2_Parent parent = new Inheritance_Q2_Parent(); //부모 기본 생성자 생성
//        Inheritance_Q2_Parent parent2 = new Inheritance_Q2_Parent("대한민국"); //부모 생성자 생성






    }

}
