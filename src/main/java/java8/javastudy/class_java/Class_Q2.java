package java8.javastudy.class_java;

/**
 * login() 메소드와 logout() 메소드를 선언하려고 합니다. login() 메소드를 호출할 때에는 매개값으로 id와 password를 제공하고,
 * logout() 메소드는 id만 매개값으로 제공합니다. login(), logout() 메ㅐ소드를 선언해 보세요
 */
public class Class_Q2 {
    public static void main(String[] args) {

        Class_Q2_MemberService class_q2 = new Class_Q2_MemberService();

        boolean result = class_q2.login("hong", "12345");

        if (result) {
            System.out.println("로그인이 되었습니다.");
            class_q2.logout("hong");
        } else{
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }

    }
}
