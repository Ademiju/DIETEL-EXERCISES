package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {


    @Test
    public void turnACOnTest() {
        AirConditioner lg = new AirConditioner("lg AC");
        assertFalse(lg.isOn());
        lg.turnOn();
        assertTrue(lg.isOn());
    }


    @Test
    public void turnOffAcTest() {
        AirConditioner lg = new AirConditioner("lg AC");
        lg.turnOn();
        assertEquals(true, lg.isOn());
        lg.turnOff();
        assertFalse(lg.isOn());
        lg.turnOff();
        assertEquals(false, lg.isOn());


    }

    @Test
    public void TemperatureCanBeIncreasedTest() {
        AirConditioner lg = new AirConditioner("lg AC");
        lg.turnOn();
        assertTrue(lg.isOn());
        int newTemp = lg.getTemperature();
        lg.increaseTemperture();
        newTemp = lg.getTemperature();
        assertEquals(17, newTemp);


    }

    @Test
    public void TemperatureCanBeDecreasedTest() {
        AirConditioner lg = new AirConditioner("lg AC");
        lg.turnOn();
        assertTrue(lg.isOn());
        lg.increaseTemperture();
        lg.increaseTemperture();
        lg.increaseTemperture();
        int newTemp = lg.getTemperature();
        assertEquals(19, newTemp);
        lg.decreaseTemperature();
        assertEquals(18, lg.getTemperature());

    }
   /* @Test
    public void sheyMyDecreaseDeyWhineMeNi(){
        AirConditioner lg = new AirConditioner("lg AC");
        lg.getTemperature();
        lg.decreaseTemperature();
        assertEquals(15,lg.getTemperature());
    }*/


    @Test

    public void acTemperatureCannotGoAbove30() {
        AirConditioner lg = new AirConditioner("lg AC");
        lg.turnOn();
        assertTrue(lg.isOn());

        for (int newTemp = 0; newTemp < 14; newTemp++) {
            lg.increaseTemperture();
        }
        assertEquals(30, lg.getTemperature());

        lg.increaseTemperture();
        assertEquals(30, lg.getTemperature());

    }

    @Test
    public void acCannotGoBelowDefaultTemperature16() {
        AirConditioner lg = new AirConditioner("lg AC");
        lg.turnOn();
        assertTrue(lg.isOn());
        lg.decreaseTemperature();
        assertEquals(16, lg.getTemperature());

    }

    @Test
    public void acTemperatureIsZeroWhenOffTest() {
        AirConditioner lg = new AirConditioner("lg AC");
        lg.turnOff();
        assertFalse(lg.isOn());
        lg.getTemperature();
        assertEquals(0, lg.getTemperature());
    }

    @Test
    public void acTemperatureCannotBeIncreasedWhenOffTest() {
        AirConditioner lg = new AirConditioner("lg AC");
        lg.turnOff();
        lg.increaseTemperture();
        assertEquals(0, lg.getTemperature());
        lg.turnOn();
        lg.increaseTemperture();
        assertEquals(17, lg.getTemperature());

    }

    @Test
    public void acTemperatureCannotBeDecreasedWhenOffTest() {
        AirConditioner lg = new AirConditioner("lg AC");
        lg.turnOn();
        lg.decreaseTemperature();
        assertEquals(16, lg.getTemperature());
        lg.turnOff();
        lg.decreaseTemperature();
        assertEquals(0, lg.getTemperature());
    }


    @Test
    public void acTemperatureRemainsTheSameWhenRestartedTest() {
        AirConditioner lg = new AirConditioner("lg AC");
        lg.turnOn();
       lg.increaseTemperture();
       lg.increaseTemperture();
       lg.increaseTemperture();
       lg.increaseTemperture();
        assertEquals(20, lg.getTemperature());

        lg.turnOff();
        assertEquals(0,lg.getTemperature());
        lg.turnOn();
        assertEquals(20,lg.getTemperature());

    }

}






