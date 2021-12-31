package chapterThree;

public class ClockTest {
    public static void main(String[] args) {

        Clock checkTime = new Clock(0,0,0);
        checkTime.setHour(25);
        checkTime.setMinute(67);
        checkTime.setSecond(80);
        checkTime.setDisplayTime();
        System.out.println("Your hour is set to "+checkTime.getHour());
        System.out.println("Your minute is set to "+checkTime.getMinute());
        System.out.println("Your second is set to "+checkTime.getSecond());
        System.out.println("The time in \"hh:mm:ss\" format is "+checkTime.DisplayTime());

        System.out.println();
        checkTime.setHour(22);
        checkTime.setMinute(54);
        checkTime.setSecond(36);
        checkTime.setDisplayTime();
        System.out.println("Your hour is set to "+checkTime.getHour());
        System.out.println("Your minute is set to "+checkTime.getMinute());
        System.out.println("Your second is set to "+checkTime.getSecond());
        System.out.println("The time in \"hh:mm:ss\" format is "+checkTime.DisplayTime());


    }
}
