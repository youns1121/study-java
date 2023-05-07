package headfirst.designpatterns.command.cellingfan;

import headfirst.designpatterns.command.Command;

public class CeilingFanMediumCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
        ceilingFan.speed("MEDIUM");

    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
            ceilingFan.speed("HIGH");
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
            ceilingFan.speed("MEDIUM");
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
