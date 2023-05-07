package headfirst.designpatterns.command;

import headfirst.designpatterns.command.cellingfan.CeilingFan;
import headfirst.designpatterns.command.cellingfan.CeilingFanHighCommand;
import headfirst.designpatterns.command.cellingfan.CeilingFanMediumCommand;
import headfirst.designpatterns.command.cellingfan.CeilingFanOffCommand;
import headfirst.designpatterns.command.control.RemoteControlWithUndo;


public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        CeilingFan ceilingFan = new CeilingFan("거실");

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);

        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

    }
}
