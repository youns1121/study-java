package java8.javastudy.exception;

/**
 * 로그인 기능을 Member 클래스의 login()메 소드에서 구현하려고 합니다. 존재하지 않는 ID를 입력했을 경우
 * NotExisIDException을 발생시키고, 잘못된 패스워드를 입력했을 경우 WrongPasswordException을 발생시키려고 합니다. LoginExample의 실행 결과를 보고 빈칸을 채워보세요
 */
public class LoginExample {
    public static void main(String[] args) {

        try {
            login("blue", "12345");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            login("sky", "54321");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void login(String id, String password) throws NotExistIdException, WrongPasswordException {
            //id가 "blue"가 아니라면 NotExistIdException 발생시킴
            if(!id.equals("blue")) {
                new NotExistIdException(id);

            }
            //password가 "12345" 아니라면 WrongPasswordException 발생시킴
             if(!password.equals("12345")){
                new WrongPasswordException(password);

            }

    }
}


