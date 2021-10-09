package java8.javastudy.defaultapi;

/**
 * 객체의 문자정보(toString() 메소드)
 */
public class SmartPhone {
    private String company;
    private String os;

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString(){
        return company + ", " + os;
    }
}
