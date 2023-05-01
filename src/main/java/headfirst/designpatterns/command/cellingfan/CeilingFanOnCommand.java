package headfirst.designpatterns.command.cellingfan;

import headfirst.designpatterns.command.Command;

public class CeilingFanOnCommand implements Command {

    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.getValue();
        ceilingFan.speed("HIGH");
    }
}
