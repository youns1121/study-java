package java8.javastudy.operator;

/**
 * 다음의 연산의 결과를 적으시오
 */

public class ex3_1 {
    public static void main(String[] args) {

        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(1 + x << 33); //3
        System.out.println(y >=5 || x <0 && x > 2); //true
        System.out.println(y += 10 - x++); // 13
        System.out.println(x += 2); // x++에서 x가 1증가 -> x=3,  result = 5
        System.out.println(!('A' <= c && c <= 'Z')); //false
        System.out.println('C'-c);
        System.out.println('5'-'0'); // 5
        System.out.println(c+1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);





    }
}
