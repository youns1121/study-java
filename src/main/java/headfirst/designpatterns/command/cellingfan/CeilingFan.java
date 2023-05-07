package headfirst.designpatterns.command.cellingfan;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    public String location;

    public int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
    }

    public void medium() {
        speed = MEDIUM;
    }

    public void low() {
        speed = LOW;
    }

    public int getSpeed() {
        return speed;
    }

    public void speed(String value) {
        System.out.println("선풍기 속도가 " + value + "로 설정되었습니다.");
    }

    public void on() {
        System.out.println("선풍기 ON");
    }

    public void off() {
        System.out.println("선풍기 OFF");
    }

    public void getValue() {
        System.out.print(location);
        System.out.print(" ");
    }
}
