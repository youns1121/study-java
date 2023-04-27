package headfirst.designpatterns.command;

public class GarageDoor {

    public void up() {
        System.out.println("올라갔습니다.");
    }

    public void down() {
        System.out.println("내려갔습니다.");
    }

    public void stop() {
        System.out.println("멈췄습니다.");
    }

    public void lightOn() {
        System.out.println("불이 켜졌습니다. ON");
    }

    public void lightOff() {
        System.out.println("불이 꺼졌습니다. OFF");
    }


}
