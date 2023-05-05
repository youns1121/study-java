package headfirst.designpatterns.command.control;

import headfirst.designpatterns.command.Command;
import headfirst.designpatterns.command.NoCommand;

public class RemoteControlWithUndo {

    public Command[] onCommands;
    public Command[] offCommands;
    Command undoCommand;

    public RemoteControlWithUndo() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n------------리모컨-------------\n");
        int length = onCommands.length;
        for (int i = 0; i < length; i++) {
            stringBuilder.append("[slot ")
                    .append(i)
                    .append("] ")
                    .append(onCommands[i].getClass().getSimpleName())
                    .append("    ")
                    .append(offCommands[i].getClass().getSimpleName())
                    .append("\n");
        }
        stringBuilder
                .append("[undo] ")
                .append(undoCommand.getClass().getSimpleName())
                .append("\n");

        return stringBuilder.toString();
    }
}
