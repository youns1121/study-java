package headfirst.designpatterns.command.cellingfan;

public class CeilingFan {

    public String value;
    public CeilingFan(String value) {
        this.value = value;
    }

    public void speed(String value) {
        System.out.println("성풍기 속도가 " + value + "로 설정되었습니다.");
    }

    public void on() {
        System.out.println("선풍기 ON");
    }

    public void off() {
        System.out.println("선풍기 OFF");
    }

    public void getValue() {
        System.out.print(value);
        System.out.print(" ");
    }
}
