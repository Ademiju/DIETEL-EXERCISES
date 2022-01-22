package chapterEight;

public class Time {
    private int hour;
    private int minute;
    private int second;


    public void setTime(int hours, int minutes, int seconds) {
        validate(hours,minutes,seconds);
        hour = hours;
        minute = minutes;
        second = seconds;

    }

    private void validate(int hours, int minutes, int seconds) {
        validateHour(hours);
        validateMinute(minutes);
        validateSecond(seconds);

    }

    private void validateHour(int hours) {
        boolean hourIsNotValid = hours < 0 || hours > 12;
        if(hourIsNotValid) throw new IllegalArgumentException("Hour is Not Valid");

    }
    private void validateMinute(int minutes) {
        boolean minuteIsNotValid = minutes < 0 || minutes > 59;
        if(minuteIsNotValid) throw new IllegalArgumentException("Minute is Not Valid");

    }

    private void validateSecond(int seconds) {
        boolean secondIsNotValid = seconds < 0 || seconds > 59;
        if(secondIsNotValid) throw new IllegalArgumentException("Second is Not Valid");
    }

    public void setHour(int hours) {
        validateHour(hours);
        hour = hours;
    }

    public void setMinute(int minutes) {
        validateMinute(minutes);
        minute = minutes;
    }

    public void setSecond(int seconds) {
        validateSecond(seconds);
        second = seconds;
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}