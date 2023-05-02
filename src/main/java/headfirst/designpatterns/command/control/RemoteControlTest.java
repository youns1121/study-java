package headfirst.designpatterns.command.control;

import headfirst.designpatterns.command.GarageDoorOpenCommand;
import headfirst.designpatterns.command.garagedoor.GarageDoor;
import headfirst.designpatterns.command.light.Light;
import headfirst.designpatterns.command.light.LightOnCommand;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();

    }
}
