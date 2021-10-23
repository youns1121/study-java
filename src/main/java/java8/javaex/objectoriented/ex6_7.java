package java8.javaex.objectoriented;
/*
문제6-6에서 작성한 클래스메서드 getDistance()를 MyPoint클래스의 인스턴스메서
드로 정의하시오.
 */

class MyPoint{
    int x;
    int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //        return Math.sqrt((x1-x)+(y1-y));
    public double getDistance(int x1, int y1){
        return Math.sqrt((x1-x)+(y1-y));
    }
}

public class ex6_7 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1,1);

        System.out.println(p.getDistance(2,2));

    }
}
