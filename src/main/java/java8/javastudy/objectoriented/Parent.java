package java8.javastudy.objectoriented;

/**
 * 다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.
 */

public class Parent {
    int x = 100; //3번 x = 200

    public Parent() { //2번
        this(200);
    }

    public Parent(int x) { //1번
        this.x = x;
    }

    int getX() {  //4 번
        return x;
    }
}
