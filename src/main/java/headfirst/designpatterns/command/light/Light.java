package headfirst.designpatterns.command.light;

public class Light {

    public String value;

    public Light(String value) {
        System.out.println(value);
        this.value = value;
    }

    public Light() {
    }

    public void on() {
        getValue();
        System.out.println("조명 ON");
    }

    public void off() {
        getValue();
        System.out.println("조명 OFF");
    }

    public void getValue() {
        System.out.print(value);
        System.out.print(" ");
    }
}
