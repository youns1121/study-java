package headfirst.designpatterns.command;

public class LightOnCommand implements Command{

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.getValue();
        light.on();
    }
}
