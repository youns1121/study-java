package java8.javastudy.exception;

/**
 * 로그인 기능을 Member 클래스의 login()메 소드에서 구현하려고 합니다. 존재하지 않는 ID를 입력했을 경우
 * NotExisIDException을 발생시키고, 잘못된 패스워드를 입력했을 경우 WrongPasswordException을 발생시키려고 합니다. LoginExample의 실행 결과를 보고 빈칸을 채워보세요
 */
public class WrongPasswordException extends Exception {
    public WrongPasswordException(){}
    public WrongPasswordException(String message){
        System.out.println("패스워드가 틀립니다.");
    }
}
