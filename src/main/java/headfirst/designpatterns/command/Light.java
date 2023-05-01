package headfirst.designpatterns.command;

public class Light {

    public String value;

    public Light(String value) {
        System.out.println(value);
        this.value = value;
    }

    public Light() {
    }

    public void on() {
        System.out.println("조명 ON");
    }

    public void off() {
        System.out.println("조명 OFF");
    }

    public void getValue() {
        System.out.print(value);
        System.out.print(" ");
    }
}
