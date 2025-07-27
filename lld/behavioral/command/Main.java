package lld.behavioral.command;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        // Create commands
        Command turnOn = new TurnOnCommand(tv);
        Command turnOff = new TurnOffCommand(tv);
        Command changeChannel = new ChangeChannelCommand(tv, 5);
        Command adjustVolume = new AdjustVolumeCommand(tv, 20);
        RemoteControl remote = new RemoteControl();
        remote.setOnCommand(turnOn);
        remote.setOffCommand(turnOff);
        remote.pressOnButton();
        remote.pressOffButton();
        changeChannel.execute();
        adjustVolume.execute();
    }
}
