package java8.javastudy.objectoriented;

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
