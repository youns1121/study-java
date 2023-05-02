package headfirst.designpatterns.command;

import headfirst.designpatterns.command.garagedoor.GarageDoor;

public class GarageDoorOpenCommand implements Command{

    public GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();

    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
