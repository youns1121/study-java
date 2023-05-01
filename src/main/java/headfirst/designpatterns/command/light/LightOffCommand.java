package headfirst.designpatterns.command.light;

import headfirst.designpatterns.command.Command;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.getValue();
        light.off();
    }
}
