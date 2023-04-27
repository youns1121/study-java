package headfirst.designpatterns.command;

public class GarageDoorOpenCommand implements Command{

    public GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        this.garageDoor.up();

    }
}
