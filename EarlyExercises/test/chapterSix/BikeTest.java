package chapterSix;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    @Test
    public void bikeCanBeTurnedOnTest(){
        Bike bajaj = new Bike("Bajaj Motorcycle");
        assertFalse(bajaj.isOn());
        bajaj.turnOn();
        assertTrue(bajaj.isOn());
    }

    @Test
    public void bikeCanBeTurnedOffTest(){
        Bike bajaj = new Bike("Bajaj Motorcycle");
        bajaj.turnOn();
        assertTrue(bajaj.isOn());
        bajaj.turnOff();
        assertFalse(bajaj.isOn());
        assertEquals(false,bajaj.isOn());
    }

    @Test
    public void bikeCanBeAcceleratedOnGearOneTest(){
        Bike bajaj = new Bike("Bajaj Motorcycle");
        bajaj.turnOn();
        assertTrue(bajaj.isOn());
        bajaj.gearOneAccelerator();
        assertEquals(1, bajaj.getacceleration());
    }

    @Test
    public void bikeCanBeAcceleratedOnGearTwoTest(){
        Bike bajaj = new Bike("Bajaj Motorcycle");
        bajaj.turnOn();
        assertTrue(bajaj.isOn());
        for (int i =0; i<20; i++){
            bajaj.gearOneAccelerator();
        }
        assertEquals(20, bajaj.getacceleration());
        bajaj.gearTwoAccelerator();
        assertEquals(22, bajaj.getacceleration());
    }


    @Test
    public void bikeCanBeAcceleratedOnGearThreeTest(){
        Bike bajaj = new Bike("Bajaj Motorcycle");
        bajaj.turnOn();
        assertTrue(bajaj.isOn());for (int i =0; i<20; i++){
            bajaj.gearOneAccelerator();
        }
        assertEquals(20, bajaj.getacceleration());
        bajaj.gearTwoAccelerator();
        bajaj.gearTwoAccelerator();
        bajaj.gearTwoAccelerator();
        bajaj.gearTwoAccelerator();
        bajaj.gearTwoAccelerator();
        assertEquals(30, bajaj.getacceleration());

        bajaj.gearThreeAccelerator();
        assertEquals(33, bajaj.getacceleration());
    }

    @Test
    public void bikeCanBeAcceleratedOnGearFourTest(){
        Bike bajaj = new Bike("Bajaj Motorcycle");
        bajaj.turnOn();
        assertTrue(bajaj.isOn());
        assertTrue(bajaj.isOn());for (int i =0; i<20; i++){
            bajaj.gearOneAccelerator();
        }
        assertEquals(20, bajaj.getacceleration());
        bajaj.gearTwoAccelerator();
        bajaj.gearTwoAccelerator();
        bajaj.gearTwoAccelerator();
        bajaj.gearTwoAccelerator();
        bajaj.gearTwoAccelerator();
        assertEquals(30, bajaj.getacceleration());
        bajaj.gearThreeAccelerator();
        bajaj.gearThreeAccelerator();
        bajaj.gearThreeAccelerator();
        assertEquals(39, bajaj.getacceleration());
        bajaj.gearFourAccelerator();
        assertEquals(43, bajaj.getacceleration());
    }

    @Test
    public void bikeCanBeDeceleratedOnGearOneTest(){
        Bike bajaj = new Bike("Bajaj Motorcycle");
        bajaj.turnOn();
        assertTrue(bajaj.isOn());
        bajaj.gearFourAccelerator();
        bajaj.gearFourAccelerator();
        assertEquals(8, bajaj.getacceleration());
        bajaj.gearOneDecelerator();
        assertEquals(7,bajaj.getacceleration());
    }

    @Test
    public void bikeCanBeDeceleratedOnGearTwoTest(){
        Bike bajaj = new Bike("Bajaj Motorcycle");
        bajaj.turnOn();
        assertTrue(bajaj.isOn());
        bajaj.gearFourAccelerator();
        bajaj.gearFourAccelerator();
        assertEquals(8, bajaj.getacceleration());
        bajaj.gearTwoDecelerator();
        assertEquals(6,bajaj.getacceleration());
    }

    @Test
    public void bikeCanBeDeceleratedOnGearThreeTest(){
        Bike bajaj = new Bike("Bajaj Motorcycle");
        bajaj.turnOn();
        assertTrue(bajaj.isOn());
        bajaj.gearFourAccelerator();
        bajaj.gearFourAccelerator();
        assertEquals(8, bajaj.getacceleration());
        bajaj.gearThreeDecelerator();
        assertEquals(5,bajaj.getacceleration());
    }

    @Test
    public void bikeCanBeDeceleratedOnGearFourTest(){
        Bike bajaj = new Bike("Bajaj Motorcycle");
        bajaj.turnOn();
        assertTrue(bajaj.isOn());
        bajaj.gearFourAccelerator();
        bajaj.gearFourAccelerator();
        assertEquals(8, bajaj.getacceleration());
        bajaj.gearFourDecelerator();
        assertEquals(4,bajaj.getacceleration());
    }


    @Test
    public void bikeGearOneIsBetweenSpeedZeroAnd20Test() {
        Bike bajaj = new Bike("Bajaj Motorcycle");
        bajaj.turnOn();
        assertTrue(bajaj.isOn());
        for (int i =0; i<19; i++){
            bajaj.gearOneAccelerator();
        }
        assertEquals(19, bajaj.getacceleration());
        bajaj.gearOneAccelerator();
        bajaj.gearOneAccelerator();
        bajaj.gearOneAccelerator();
        assertEquals(20, bajaj.getacceleration());
    }

    @Test
    public void bikeGearTwoIsBetweenSpeed21And30Test() {
        Bike bajaj = new Bike("Bajaj Motorcycle");
        bajaj.turnOn();
        assertTrue(bajaj.isOn());
        for (int i =0; i<20; i++){
            bajaj.gearOneAccelerator();
        }
        assertEquals(20, bajaj.getacceleration());
        bajaj.gearTwoAccelerator();
        bajaj.gearTwoAccelerator();
        bajaj.gearTwoAccelerator();
        bajaj.gearTwoAccelerator();
        bajaj.gearTwoAccelerator();
        bajaj.gearTwoAccelerator();
        assertEquals(30, bajaj.getacceleration());
    }

    @Test
    public void bikeGearThreeIsBetweenSpeed31And40Test() {
        Bike bajaj = new Bike("Bajaj Motorcycle");
        bajaj.turnOn();
        assertTrue(bajaj.isOn());
        for (int i =0; i<20; i++){
            bajaj.gearOneAccelerator();
        }
        assertEquals(20, bajaj.getacceleration());
        bajaj.gearTwoAccelerator();
        bajaj.gearTwoAccelerator();
        bajaj.gearTwoAccelerator();
        bajaj.gearTwoAccelerator();
        bajaj.gearTwoAccelerator();
        assertEquals(30, bajaj.getacceleration());
        bajaj.gearThreeAccelerator();
        bajaj.gearThreeAccelerator();
        bajaj.gearThreeAccelerator();
        bajaj.gearThreeAccelerator();

        assertEquals(39, bajaj.getacceleration());
    }

    @Test
    public void bikeGearFourIsAboveSpeed40Test() {
        Bike bajaj = new Bike("Bajaj Motorcycle");
        bajaj.turnOn();
        assertTrue(bajaj.isOn());
        for (int i =0; i<20; i++){
            bajaj.gearOneAccelerator();
        }
        assertEquals(20, bajaj.getacceleration());
        bajaj.gearTwoAccelerator();
        bajaj.gearTwoAccelerator();
        bajaj.gearTwoAccelerator();
        bajaj.gearTwoAccelerator();
        bajaj.gearTwoAccelerator();
        assertEquals(30, bajaj.getacceleration());
        bajaj.gearThreeAccelerator();
        bajaj.gearThreeAccelerator();
        bajaj.gearThreeAccelerator();
        bajaj.gearThreeAccelerator();
        bajaj.gearThreeAccelerator();
        assertEquals(39, bajaj.getacceleration());
        bajaj.gearFourAccelerator();
        bajaj.gearFourDecelerator();
        bajaj.gearFourDecelerator();
        bajaj.gearFourDecelerator();

        assertEquals(39,bajaj.getacceleration());
    }
    }