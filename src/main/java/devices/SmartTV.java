package devices;

public class SmartTV implements Device {
    private boolean on = false;
    private int volume = 30;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
        System.out.println("SmartTV enabled.");
    }

    @Override
    public void disable() {
        on = false;
        System.out.println("SmartTV disabled.");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100) volume = 100;
        if (volume < 0) volume = 0;
        this.volume = volume;
        System.out.println("SmartTV volume set to " + volume);
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("SmartTV channel set to " + channel);
    }

    @Override
    public void printStatus() {

    }

    public void browseInternet(String url) {
        if (on) {
            System.out.println("Browsing to " + url + " on SmartTV.");
        } else {
            System.out.println("SmartTV is off. Cannot browse the internet.");
        }
    }
}
