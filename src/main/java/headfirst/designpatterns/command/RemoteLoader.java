package headfirst.designpatterns.command;

import headfirst.designpatterns.command.cellingfan.CeilingFan;
import headfirst.designpatterns.command.cellingfan.CeilingFanOffCommand;
import headfirst.designpatterns.command.cellingfan.CeilingFanOnCommand;
import headfirst.designpatterns.command.garagedoor.GarageDoor;
import headfirst.designpatterns.command.garagedoor.GarageDoorDownCommand;
import headfirst.designpatterns.command.garagedoor.GarageDoorUpCommand;
import headfirst.designpatterns.command.light.Light;
import headfirst.designpatterns.command.light.LightOffCommand;
import headfirst.designpatterns.command.light.LightOnCommand;
import headfirst.designpatterns.command.stereo.Stereo;
import headfirst.designpatterns.command.stereo.StereoOffCommand;
import headfirst.designpatterns.command.stereo.StereoOnWithCdCommand;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("거실");
        Light kitchenLight = new Light("주방");
        CeilingFan ceilingFan = new CeilingFan("거실");
        GarageDoor garageDoor = new GarageDoor("차고");
        Stereo stereo = new Stereo("거실");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCdCommand stereoOnWithCd = new StereoOnWithCdCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);


        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCd, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }
}
