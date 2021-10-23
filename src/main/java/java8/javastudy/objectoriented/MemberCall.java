package java8.javastudy.objectoriented;

public class MemberCall {

    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
//    static int cv2 = iv;    // 라인 A, 오류 클래스 변수에 인스턴스 변수를 대입 하려고 해서 오류

    static void staticMethod1(){
        System.out.println(cv);
//        System.out.println(iv); //라인 B, 오류 클래스 메소드에 인스턴스 변수를 대입 하려고 해서 오류
    }

    void instanceMethod1(){
        System.out.println(cv);
        System.out.println(iv); //라인 C
    }

    static void staticMethod2(){
        staticMethod1();

//        instanceMethod1();  //라인 D, 클래스 메소드에 인스턴스 메소드를 넣으려고 해서 오류, 객체를 생성해야함
    }

    void instanceMethod2(){
        staticMethod1(); //라인 E
        instanceMethod1();
    }

}
