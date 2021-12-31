package chapterSix;

public class TelevisionSet {
    private boolean isOn;
    private String name;
    //private String mode = "TV";
    private int volume = 50;
    private int channel = 1;
    private int channelNumber;

    public TelevisionSet(String sharpTv) {

        name = sharpTv;
    }

    public boolean isOn() {

        return isOn;
    }

    public void turnOn() {

        isOn = true;
    }


    public void turnOff() {

        isOn = false;
    }

//    public String avMode() {
//        if(isOn)
//
//        return avMode;
//
//    }

    public int getVolume() {
        if(isOn)
        return volume;
        return 0;
    }

    public void increaseVolume() {
        if(volume < 100)
        volume++;

    }

    public void decreaseVolume() {
        if(volume > 0)
        volume--;
    }

    public int getChannelNumber() {
        if(isOn)
        return channel;
        return 0;
    }

    public void increaseToChangeChannel() {
        if(channel < 99)
        channel++;

    }

    public void decreaseToChangeChannel() {
        if(channel > 1)
            channel--;
    }

    public void manualChannelChange(int channelNumber) {
        if(channelNumber < 100)
        this.channelNumber = channelNumber;
    }

    public int getManualChannelNumber() {
        if(isOn)
        return channelNumber;
        return 0;
    }

}
