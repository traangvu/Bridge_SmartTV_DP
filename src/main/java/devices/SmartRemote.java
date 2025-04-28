package devices;

public class SmartRemote extends BasicRemote {

    public SmartRemote(Device device) {
        super(device);
    }

    public void voiceControl(String command) {
        if (!device.isEnabled()) {
            System.out.println("Device is off. Voice command cannot be processed.");
            return;
        }

        System.out.println("Voice Command Received: " + command);
        if (command.equalsIgnoreCase("volume up")) {
            volumeUp();
        } else if (command.equalsIgnoreCase("volume down")) {
            volumeDown();
        } else if (command.startsWith("set channel ")) {
            try {
                int channel = Integer.parseInt(command.split(" ")[2]);
                device.setChannel(channel);
            } catch (Exception e) {
                System.out.println("Invalid channel number.");
            }
        } else {
            System.out.println("Unknown voice command.");
        }
    }
}
