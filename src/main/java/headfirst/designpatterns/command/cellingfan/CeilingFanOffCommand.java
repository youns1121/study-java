package headfirst.designpatterns.command.cellingfan;

import headfirst.designpatterns.command.Command;

public class CeilingFanOffCommand implements Command {

    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.getValue();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        ceilingFan.on();
    }
}
