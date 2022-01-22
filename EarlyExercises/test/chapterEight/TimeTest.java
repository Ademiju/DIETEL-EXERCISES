package chapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    @Test
    public void timeCanBeSetTest() {
        Time time = new Time();
        time.setTime(12,54,59);
        System.out.println(time);

    }
    @Test
    public void hourCanBeSetTest(){
        Time time = new Time();
        time.setTime(12,54,59);
        time.setHour(10);
        assertEquals("10:54:59",time.toString());
        System.out.println(time);
    }
    @Test
    public void minuteCanBeSetTest(){
        Time time = new Time();
        time.setTime(12,54,59);
        time.setMinute(46);
        assertEquals("12:46:59",time.toString());

    }
    @Test
    public void secondCanBeSetTest(){
        Time time = new Time();
        time.setTime(12,54,59);
        time.setSecond(27);
        assertEquals("12:54:27",time.toString());
        System.out.println(time);
    }
}