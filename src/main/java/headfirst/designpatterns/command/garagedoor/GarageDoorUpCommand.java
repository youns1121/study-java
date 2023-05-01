package headfirst.designpatterns.command.garagedoor;

import headfirst.designpatterns.command.Command;

public class GarageDoorUpCommand implements Command {

    GarageDoor garageDoor;


    public GarageDoorUpCommand() {
    }

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
