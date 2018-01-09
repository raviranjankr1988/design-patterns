public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOnCommand= new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        remoteControl.setSlot(lightOnCommand);
        remoteControl.buttonWasPressed();
        remoteControl.undo();

        remoteControl.setSlot(garageDoorOpenCommand);
        remoteControl.buttonWasPressed();
        remoteControl.undo();
    }
}
