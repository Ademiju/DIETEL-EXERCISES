package chapterSix;

public class Bike {

    private String name;
    private boolean isOn;
    private int speedometer = 0;


    public Bike(String bajajMotorcycle) {
        name = bajajMotorcycle;
    }
    public boolean isOn(){
        return isOn;
    }


    public boolean turnOn() {
        isOn = true;
        return isOn ;
    }

    public boolean turnOff() {
        isOn = false;
        return isOn;

    }

    public void gearOneAccelerator() {

        if(speedometer<20) {
            speedometer++;
        }
    }

    public int getacceleration() {
        return speedometer;
    }

    public void gearTwoAccelerator() {
        if (speedometer >= 20) {
            if(speedometer<30)
            speedometer += 2;
        }

    }

        public void gearThreeAccelerator() {
            if (speedometer >= 30) {
                if (speedometer < 39)
                    speedometer += 3;
            }
        }

    public void gearFourAccelerator() {
        if(speedometer >=39) {
            speedometer += 4;
        }
        }

    public void gearOneDecelerator() {
        if(speedometer<=20) {
            speedometer--;
        }
    }

    public void gearTwoDecelerator() {
        if (speedometer > 20) {
            if (speedometer <= 30)
                speedometer -= 2;
        }
    }

    public void gearThreeDecelerator() {
        if (speedometer > 30) {
            if (speedometer <=40)
                speedometer -= 3;
        }
    }

    public void gearFourDecelerator() {
        if(speedometer >41)
        speedometer-=4;
    }
}
