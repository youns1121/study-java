package java8.javaex.objectoriented;

public class ex6_6 {

    //두 점 (x, y)와 (x1, y1)간의 거리를 구한다.
    static double getDistance(int x, int y, int x1, int y1){
       return Math.sqrt((x1-x)+(y1-y));

    }

    public static void main(String[] args) {
        System.out.println(getDistance(1,1,2,2));

    }
}
