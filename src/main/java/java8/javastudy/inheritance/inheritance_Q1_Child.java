package java8.javastudy.inheritance;

import javafx.scene.Parent;

public class inheritance_Q1_Child extends Parent {

    private int studentNo;

    //메소드 첫 줄에 부모의 생성자 호출을 해야함 : super() or super(name)
    public inheritance_Q1_Child(String name, int studentNo) {
        super();
        this.studentNo = studentNo;
    }
}
