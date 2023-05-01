package headfirst.designpatterns.command.stereo;

public class Stereo {

    public String value;

    public Stereo(String value) {
        this.value = value;
    }

    public void on() {
        System.out.println("오디오가 켜졌습니다.");
    }

    public void off() {
        System.out.println("오디오가 꺼졌습니다.");
    }

    public void setCd() {
        System.out.println("오디오에서 CD가 재생됩니다.");
    }

    public void setRadio() {

    }

    public void setVolume(int volume) {
        System.out.println("오디오의 볼륨이 " + volume + "로 설정되었습니다.");
    }

    public void getValue() {
        System.out.print(value);
        System.out.print(" ");

    }
}
