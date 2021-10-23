package java8.javastudy.objectoriented;

/**
 * 다음과 같은 실행결과를 얻도록 Student클래스에 생성자와 info()를 추가하시오.
 */
public class ex6_5 {
    public static void main(String[] args) {

        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        System.out.println(s.info());

    }

}
