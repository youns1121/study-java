package headfirst.designpatterns.command;

public class RemoteControl {

    public Command[] onCommands;
    public Command[] offCommands;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
//        if (onCommands[slot] != null) {
            onCommands[slot].execute();
//        }
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n------------리모컨-------------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder.append("[slot ")
                    .append(i)
                    .append("] ")
                    .append(onCommands[i].getClass().getSimpleName())
                    .append("    ")
                    .append(offCommands[i].getClass().getSimpleName())
                    .append("\n");
        }
        return stringBuilder.toString();
    }
}
