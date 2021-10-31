package java8.javastudy.objectoriented;

/**
 * 다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.
 */

class Parent{
    int x = 100; //3번 x = 200

    public Parent() { //2번
        this(200);
    }

    public Parent(int x) { //1번
        this.x = x;
    }

    int getX(){  //4 번
        return x;
    }
}

class Child extends Parent{

    int x = 3000;

    public Child() {
        this(1000);
    }

    public Child(int x) {
        this.x = x;
    }
}
public class Ex7_7 {

    public static void main(String[] args) {

        Child c = new Child();

        System.out.println("x="+c.getX()); // 부모 메서드 getX 호출
//        System.out.println(c.x);


    }


}
