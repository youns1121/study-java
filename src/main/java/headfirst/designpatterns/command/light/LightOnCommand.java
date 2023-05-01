package headfirst.designpatterns.command.light;

import headfirst.designpatterns.command.Command;
import headfirst.designpatterns.command.light.Light;

public class LightOnCommand implements Command {

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
