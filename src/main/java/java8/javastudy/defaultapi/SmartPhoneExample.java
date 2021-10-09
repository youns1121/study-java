package java8.javastudy.defaultapi;

/**
 * 객체의 문자정보(toString() 메소드)
 */
public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myphone = new SmartPhone("구글", "안드로이드");

        String strobj = myphone.toString();
        System.out.println(myphone); // myphone.toString()을 자동 호출해서 리턴값을 얻은 후 출력
        System.out.println(strobj);
    }
}
