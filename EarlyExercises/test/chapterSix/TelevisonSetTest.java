package chapterSix;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TelevisonSetTest {

    @Test
    public void turnTvOn() {
        TelevisionSet sharp = new TelevisionSet("Sharp TV");
        assertFalse(sharp.isOn());
        sharp.turnOn();
        assertTrue(sharp.isOn());
    }

    @Test
    public void turnTvOff() {
        TelevisionSet sharp = new TelevisionSet("Sharp TV");
        sharp.turnOn();
        assertEquals(true, sharp.isOn());
        sharp.turnOff();
        assertFalse(sharp.isOn());
        assertEquals(false, sharp.isOn());
    }

    //    @Test
//    public void tvCanToggleBetweenAvAndTvModeTest(){
//        TelevisionSet sharp = new TelevisionSet("Sharp TV");
//        sharp.turnOn();
//        String result = sharp.avMode("AV");
//
//        assertEquals("AV", result);
//
//    }
    @Test
    public void increaseTvVolumeTest() {
        TelevisionSet sharp = new TelevisionSet("Sharp TV");
        sharp.turnOn();
        sharp.getVolume();
        assertEquals(50, sharp.getVolume());

        sharp.increaseVolume();
        assertEquals(51, sharp.getVolume());

    }

    @Test
    public void decreaseTvVolumeTest() {
        TelevisionSet sharp = new TelevisionSet("Sharp TV");
        sharp.turnOn();
        sharp.getVolume();
        assertEquals(50, sharp.getVolume());

        sharp.decreaseVolume();
        assertEquals(49, sharp.getVolume());

    }


    @Test
    public void tvChannelCanBeIncreasedToChangeItTest() {
        TelevisionSet sharp = new TelevisionSet("Sharp TV");
        sharp.turnOn();
        sharp.getChannelNumber();
        assertEquals(1, sharp.getChannelNumber());
        sharp.increaseToChangeChannel();
        assertEquals(2, sharp.getChannelNumber());

    }

    @Test
    public void tvChannelCanBeDecreasedToChangeItTest() {
        TelevisionSet sharp = new TelevisionSet("Sharp TV");
        sharp.turnOn();
        sharp.getChannelNumber();
        assertEquals(1, sharp.getChannelNumber());
        sharp.increaseToChangeChannel();
        sharp.increaseToChangeChannel();
        sharp.increaseToChangeChannel();
        sharp.increaseToChangeChannel();
        assertEquals(5, sharp.getChannelNumber());
        sharp.decreaseToChangeChannel();
        assertEquals(4, sharp.getChannelNumber());
    }

    @Test
    public void tvChannelCanBeChangedByPressingChannelNumber() {
        TelevisionSet sharp = new TelevisionSet("Sharp TV");
        sharp.turnOn();
        sharp.manualChannelChange(22);
        assertEquals(22, sharp.getManualChannelNumber());

    }


    @Test
    public void tvCannotIncreaseVolumeAboveHighestVolume_100(){
        TelevisionSet sharp = new TelevisionSet("Sharp TV");
        sharp.turnOn();
        for(int i= 0;i<50;i++){
        sharp.increaseVolume();
        }
        assertEquals(100,sharp.getVolume());
        sharp.increaseVolume();
        sharp.increaseVolume();
        assertEquals(100, sharp.getVolume());
    }

    @Test
    public void tvCannotDecreaseVolumeBelowLowestVolume_ZeroTest(){
        TelevisionSet sharp = new TelevisionSet("Sharp TV");
        sharp.turnOn();
        for(int i= 0;i<50;i++){
            sharp.decreaseVolume();
        }
        assertEquals(0,sharp.getVolume());
        sharp.decreaseVolume();
        sharp.decreaseVolume();
        assertEquals(0, sharp.getVolume());
    }

    @Test
    public void tvCannotChangeChannelAboveTheHighestChannelList_99Test(){
        TelevisionSet sharp = new TelevisionSet("Sharp TV");
        sharp.turnOn();
        for(int i= 0;i<99;i++){
            sharp.increaseToChangeChannel();
        }
        assertEquals(99,sharp.getChannelNumber());
        sharp.increaseToChangeChannel();
        sharp.increaseToChangeChannel();
        assertEquals(99, sharp.getChannelNumber());
        sharp.manualChannelChange(99);
        assertEquals(99, sharp.getManualChannelNumber());

    }

    @Test
    public void tvCannotChangeChannelBelowTheLowestChannelListTest() {
        TelevisionSet sharp = new TelevisionSet("Sharp TV");
        sharp.turnOn();
        assertEquals(1, sharp.getChannelNumber());
        sharp.decreaseToChangeChannel();
        sharp.decreaseToChangeChannel();
        assertEquals(1, sharp.getChannelNumber());
    }
    @Test
    public void tvDoesNotIncreaseVolumeWhenOffTest() {
        TelevisionSet sharp = new TelevisionSet("Sharp TV");
        sharp.turnOff();
        sharp.increaseVolume();
        assertEquals(0, sharp.getVolume());

    }

    @Test
    public void tvDoesNotDecreaseVolumeWhenOffTest(){
        TelevisionSet sharp = new TelevisionSet("Sharp TV");
        sharp.turnOff();
        sharp.decreaseVolume();
        assertEquals(0, sharp.getVolume());

    }


    @Test
    public void tvDoesNotIncreaseToChangeChannelWhenOffTest() {
        TelevisionSet sharp = new TelevisionSet("Sharp TV");
        sharp.turnOff();
        sharp.increaseToChangeChannel();
        assertEquals(0, sharp.getChannelNumber());

    }
    @Test
    public void tvDoesNotDecreaseToChangeChannelWhenOffTest(){
        TelevisionSet sharp = new TelevisionSet("Sharp TV");
        sharp.turnOff();
        sharp.decreaseToChangeChannel();
        assertEquals(0, sharp.getChannelNumber());

    }

    @Test
    public void tvDoesNotChangeChannelManuallyWhenOffTest() {
        TelevisionSet sharp = new TelevisionSet("Sharp TV");
        sharp.turnOff();
        sharp.manualChannelChange(23);
        assertEquals(0, sharp.getManualChannelNumber());

    }

    @Test
    public void tvChannelRemainsTheSameWhenTvIsRestartedTest() {
        TelevisionSet sharp = new TelevisionSet("Sharp TV");
        sharp.turnOn();
        sharp.increaseToChangeChannel();
        sharp.increaseToChangeChannel();
        sharp.increaseToChangeChannel();
        sharp.increaseToChangeChannel();
        assertEquals(5, sharp.getChannelNumber());

        sharp.turnOff();
        assertEquals(0,sharp.getChannelNumber());
        sharp.turnOn();
        assertEquals(5,sharp.getChannelNumber());
        sharp.manualChannelChange(34);
        assertEquals(34, sharp.getManualChannelNumber());

        sharp.turnOff();
        assertEquals(0,sharp.getManualChannelNumber());
        sharp.turnOn();
        assertEquals(34,sharp.getManualChannelNumber());



    }

}
