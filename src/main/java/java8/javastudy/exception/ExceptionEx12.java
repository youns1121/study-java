package java8.javastudy.exception;

public class ExceptionEx12 {

    public static void main(String[] args) throws Exception{
        ExceptionEx12 e= new ExceptionEx12();

        e.method1();//
//        method2();//객체생성없이 에서드 생성
    }

    void method1() throws Exception{
        method2();
    }

    static void method2() throws Exception {
        throw new Exception("메서드2");
        //method2의 끝
    }


}
