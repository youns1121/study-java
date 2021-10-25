package java8.javastudy.objectoriented;

/**
 * [6-22] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
 * 메서드명 : isNumber
 * 기 능 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다 : .
 * 모두 숫자로만 이루어져 있으면 를 반환하고 true ,
 * 그렇지 않으면 를 반환한다 false .
 * 만일 주어진 문자열이 이거나 빈문자열 이라면 를 반환한다 null “” false .
 * 반환타입 : boolean
 * 매개변수 검사할 문자열
 * [Hint] String charAt(int i) i . 클래스의 메서드를 사용하면 문자열의 번째 위치한 문자를 얻을 수 있다
 */
public class Ex6_22 {


    /*
    isNumber메서드를 작성하시오
    */
    public static boolean isNumber(String str) {
        if (str == null || str == "") {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);

            if (Character.isDigit(tmp) == false) {
                return false;
            } else continue;


        }
        return true;
    }


    public static void main(String[] args) {

        String str = "12a5";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));

        str = "12345";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));
    }
}
